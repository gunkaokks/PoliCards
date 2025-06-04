package persistencia;

import com.mycompany.policards.Administrador;
import com.mycompany.policards.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public boolean cadastrar(Usuario u) {
        String sql = "INSERT INTO alunos (emailAluno, senhaAluno) VALUES (?, ?)";

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, u.getEmailAluno().trim());
            ps.setString(2, u.getSenhaAluno().trim());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
            return false;
        }
    }

    public Usuario autenticar(String email, String senha) {
        String sql = "SELECT * FROM alunos WHERE emailAluno = ? AND senhaAluno = ?";

        try (Connection con = ConnectionFactory.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, email.trim());
            ps.setString(2, senha.trim());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Usuario u = new Usuario(
                        rs.getString("emailAluno"),
                        rs.getString("senhaAluno"));
                        u.setId_aluno(rs.getInt("id_aluno"));
                        return u;
                }
            }

        } catch (SQLException e) {
            System.err.println("Erro ao autenticar usuário: " + e.getMessage());
        }
        return null;
    }
    
    public Usuario autenticarAdm (String emailAdm, String senhaAdm) {
        String sql = "SELECT * FROM administradores WHERE emailAdm = ? AND senhaAdm = ?";

        try (Connection con = ConnectionFactory.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, emailAdm.trim());
            ps.setString(2, senhaAdm.trim());

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Usuario a = new Usuario(
                            rs.getString("emailAdm"),
                            rs.getString("senhaAdm"));
                    a.setId_aluno(rs.getInt("id_adm"));
                    return a;
                }
            }

        } catch (SQLException e) {
            System.err.println("Erro ao autenticar usuário: " + e.getMessage());
        }
        return null;
    }
    
    public boolean cadastrarAdm(Administrador a) {
        String sql = "INSERT INTO administradores (emailAdm, senhaAdm) VALUES (?, ?)";

        try (Connection con = ConnectionFactory.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, a.getEmailAdm().trim());
            ps.setString(2, a.getSenhaAdm().trim());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar administrador: " + e.getMessage());
            return false;
        }
    }
}


