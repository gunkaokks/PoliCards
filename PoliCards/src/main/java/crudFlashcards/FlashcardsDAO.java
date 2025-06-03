package crudFlashcards;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import persistencia.ConnectionFactory;
import persistencia.Sessao;

public class FlashcardsDAO {
    public boolean criarFlashcard(Flashcards flashcard) throws SQLException {
        String sql = "INSERT INTO flashcards (id_aluno, id_materia, pergunta, resposta, dificuldade) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, Sessao.getIdAluno());
            ps.setInt(2, flashcard.getId_materia());
            ps.setString(3, flashcard.getPergunta());
            ps.setString(4, flashcard.getResposta());
            ps.setString(5, flashcard.getDificuldade());
            
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.err.println("Erro ao criar flashcard");
            throw e;
        }
    }
    
    public List<Flashcards> listarFlashcardsFiltrados(Integer idMateria, String dificuldade) throws SQLException, Exception {
        List<Flashcards> lista = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM flashcards WHERE 1=1");
        List<Object> parametros = new ArrayList<>();

        if (idMateria != null && idMateria > 0) {
            sql.append(" AND id_materia = ?");
            parametros.add(idMateria);
        }

        if (dificuldade != null && !dificuldade.equals("Aleatório")) {
            sql.append(" AND dificuldade = ?");
            parametros.add(dificuldade);
        }

        sql.append(" ORDER BY RAND()");
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql.toString())) {

            for (int i = 0; i < parametros.size(); i++) {
                stmt.setObject(i + 1, parametros.get(i));
            }

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Flashcards flashcard = new Flashcards(
                            rs.getInt("id_flashcard"),
                            rs.getInt("id_aluno"),
                            rs.getInt("id_materia"),
                            rs.getString("pergunta"),
                            rs.getString("resposta"),
                            rs.getString("dificuldade"));
                    lista.add(flashcard);
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar flashcards");
            throw e;
        }

        return lista;
    }
}