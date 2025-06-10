package crudFlashcards;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import persistencia.ConnectionFactory;

       


public class FlashcardService {
    public static ArrayList<FlashcardResposta> get(int idAluno) throws Exception {
        ArrayList<FlashcardResposta> flashcards = new ArrayList<>();

        Connection c = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            c = ConnectionFactory.getConnection();

            String query
                    = "SELECT f.id_flashcard, f.pergunta, f.resposta, f.dificuldade, "
                    + "r.acertou, m.id_materia, m.materia "
                    + "FROM flashcards f "
                    + "JOIN materias m ON f.id_materia = m.id_materia "
                    + "LEFT JOIN respostas r "
                    + "  ON f.id_flashcard = r.id_flashcard AND r.id_aluno = ? "
                    + "WHERE f.id_aluno = ?";

            stmt = c.prepareStatement(query);
            stmt.setInt(1, idAluno); 
            stmt.setInt(2, idAluno); 

            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_flashcard");
                String pergunta = rs.getString("pergunta");
                String resposta = rs.getString("resposta");
                String dificuldade = rs.getString("dificuldade");

                Boolean acertou = null;
                Object acertouObj = rs.getObject("acertou");
                if (acertouObj != null) {
                    acertou = rs.getBoolean("acertou");
                }

                int idMateria = rs.getInt("id_materia");
                String nomeMateria = rs.getString("materia");

                FlashcardResposta f = new FlashcardResposta(id, pergunta, resposta, dificuldade, acertou, idMateria, nomeMateria);
                flashcards.add(f);
            }

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (c != null) {
                c.close();
            }
        }

        return flashcards;
    }

    
    public static void atualizar(Flashcards f) throws Exception {
        Connection c = null;
        PreparedStatement stmt = null;

        try {
            c = ConnectionFactory.getConnection();

            String query = "UPDATE flashcards SET pergunta = ?, resposta = ?, dificuldade = ?, id_materia = ? WHERE id_flashcard = ?;";
            stmt = c.prepareStatement(query);

            stmt.setString(1, f.getPergunta());
            stmt.setString(2, f.getResposta());
            stmt.setString(3, f.getDificuldade());
            stmt.setInt(4, f.getId_materia());
            stmt.setInt(5, f.getId_flashcard());

            stmt.executeUpdate();

        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (c != null) {
                c.close();
            }
        }
    }
    
    public static void remover(Flashcards f) throws Exception {
        Connection c = null;
        PreparedStatement stmt = null;

        try {
            c = ConnectionFactory.getConnection();

            String query = "DELETE FROM flashcards WHERE id_flashcard = ?;";
            stmt = c.prepareStatement(query);

            stmt.setInt(1, f.getId_flashcard()); 
            stmt.execute();

        } finally {
            if (stmt != null) {
                stmt.close();
            }
            if (c != null) {
                c.close();
            }
        }
    }
    
    public static void registrarTentativa(int idAluno, int idFlashcard, boolean acertou) throws Exception {
        Connection c = null;
        PreparedStatement stmtCheck = null;
        PreparedStatement stmtInsert = null;
        PreparedStatement stmtUpdate = null;
        ResultSet rs = null;

        try {
            c = ConnectionFactory.getConnection();

            String checkQuery = "SELECT id_respostas FROM respostas WHERE id_aluno = ? AND id_flashcard = ?";
            stmtCheck = c.prepareStatement(checkQuery);
            stmtCheck.setInt(1, idAluno);
            stmtCheck.setInt(2, idFlashcard);
            rs = stmtCheck.executeQuery();

            if (rs.next()) {
                String updateQuery = "UPDATE respostas SET acertou = ? WHERE id_aluno = ? AND id_flashcard = ?";
                stmtUpdate = c.prepareStatement(updateQuery);
                stmtUpdate.setBoolean(1, acertou);
                stmtUpdate.setInt(2, idAluno);
                stmtUpdate.setInt(3, idFlashcard);
                stmtUpdate.executeUpdate();
            } else {
                String insertQuery = "INSERT INTO respostas (id_aluno, id_flashcard, acertou) VALUES (?, ?, ?)";
                stmtInsert = c.prepareStatement(insertQuery);
                stmtInsert.setInt(1, idAluno);
                stmtInsert.setInt(2, idFlashcard);
                stmtInsert.setBoolean(3, acertou);
                stmtInsert.executeUpdate();
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmtCheck != null) {
                stmtCheck.close();
            }
            if (stmtInsert != null) {
                stmtInsert.close();
            }
            if (stmtUpdate != null) {
                stmtUpdate.close();
            }
            if (c != null) {
                c.close();
            }
        }
    }
}
