package usuario;

import com.mycompany.policards.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import persistencia.ConnectionFactory;

public class UsuarioService {
    
    public static ArrayList<Usuario> get() throws Exception {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        Connection c = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
    try {
        c = ConnectionFactory.getConnection();
        String query = "SELECT id_aluno, emailAluno, senhaAluno FROM alunos;";
        stmt = c.prepareStatement(query);
        rs = stmt.executeQuery();

        while (rs.next()) {
            int id = rs.getInt("id_aluno");
            String emailAluno = rs.getString("emailAluno");
            String senhaAluno = rs.getString("senhaAluno");

            if (emailAluno != null) {
                Usuario u = new Usuario(emailAluno, senhaAluno);
                u.setId_aluno(id);
                usuarios.add(u);
            }
        }

    } finally {
        if (rs != null) rs.close();
        if (stmt != null) stmt.close();
        if (c != null) c.close();
    }

    return usuarios;
}

    public static void adicionar(Usuario u) throws Exception {
        Connection c = null;
        PreparedStatement stmt = null;
        
        try
        {
            c = ConnectionFactory.getConnection();

            String query = "INSERT INTO alunos (emailAluno, senhaAluno) VALUES (?, ?);";
            stmt = c.prepareStatement(query);
            
            stmt.setString(1, u.getEmailAluno());
            stmt.setString(2, u.getSenhaAluno());
            
            stmt.execute();           
        }
        finally
        {
            if (stmt != null)
                stmt.close();

            if (c != null)
                c.close();
        }
    }
    public static void atualizar(Usuario u) throws Exception {
        Connection c = null;
        PreparedStatement stmt = null;

        try
        {
            c = ConnectionFactory.getConnection();
            
            String query = "UPDATE alunos SET emailAluno=?, senhaAluno=? WHERE id_aluno=?;";
            stmt = c.prepareStatement(query);
            
            stmt.setString(1, u.getEmailAluno());
            stmt.setString(2, u.getSenhaAluno());
            stmt.setInt(3, u.getId_aluno());
            
            stmt.executeUpdate();
        }
        finally
        {
            if (stmt != null)
                stmt.close();

            if (c != null)
                c.close();
        }
    }
    public static void remover(Usuario u) throws Exception {
        Connection c = null;
        PreparedStatement stmt = null;

        try
        {
            c = ConnectionFactory.getConnection();

            String query = "DELETE FROM alunos WHERE id_aluno=?;";
            stmt = c.prepareStatement(query);

            stmt.setInt(1, u.getId_aluno());
            stmt.execute();
        }
        finally
        {
            if (stmt != null)
                stmt.close();

            if (c != null)
                c.close();
        }
    }
    public static boolean usuarioExiste(String email) throws Exception {
    String query = "SELECT COUNT(*) FROM alunos WHERE emailAluno = ?";
    
    try (Connection conn = ConnectionFactory.getConnection();
         PreparedStatement stmt = conn.prepareStatement(query)) {
        
        stmt.setString(1, email);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }
    }
    
    return false;
}

}
     
     

                