
package crudFlashcards;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import persistencia.ConnectionFactory;
import persistencia.Sessao;

public class FlashcardsDAO {
    private Connection conn;
    
    public FlashcardsDAO() throws SQLException {
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public boolean criarFlashcards (Flashcards flashcards) throws SQLException{
        String sql = "INSERT INTO flashcards (id_aluno, id_materia, pergunta, resposta, dificuldade) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, Sessao.getIdAluno());
            ps.setInt(2, flashcards.getId_materia());
            ps.setString(3, flashcards.getPergunta());
            ps.setString(4, flashcards.getResposta());
            ps.setString(5, flashcards.getDificuldade());
            
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.err.println("Erro ao criar flashcard: " + e.getMessage());
            throw e;
        }
    }
}
