
package crudFlashcards;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import persistencia.ConnectionFactory;

public class FlashcardsDAO {
    private Connection conn;
    
    public FlashcardsDAO() throws SQLException {
        this.conn = new ConnectionFactory().getConnection();
    }
    
    public boolean criarFlashcards (Flashcards flashcards) throws SQLException{
        String sql = "INSERT INTO flashcards (pergunta, resposta, materia, dificuldade, usuario_id) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, flashcards.getPergunta());
            ps.setString(2, flashcards.getResposta());
            ps.setString(3, flashcards.getMateria());
            ps.setString(4, flashcards.getDificuldade());
            ps.setInt(5,/*id do usuario logado*/);
            ps.execute();       
            
        }catch(SQLException e){
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
        }
        return false;
    }
}
