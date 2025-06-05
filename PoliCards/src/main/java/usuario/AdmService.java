package usuario;

import com.mycompany.policards.Administrador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import persistencia.ConnectionFactory;

public class AdmService {
    
    public static ArrayList<Administrador> get() throws Exception {
        ArrayList<Administrador> administradores = new ArrayList<>();

        Connection c = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            c = ConnectionFactory.getConnection();
            String query = "SELECT * FROM administradores;";
            stmt = c.prepareStatement(query);
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_adm");
                String emailAdm = rs.getString("emailAdm");
                String senhaAdm = rs.getString("senhaAdm");

                if (emailAdm != null) {
                    Administrador a = new Administrador(emailAdm, senhaAdm);
                    a.setId_adm(id);
                    administradores.add(a);
                }
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

        return administradores;
    }

    public static void adicionar(Administrador a) throws Exception {
        Connection c = null;
        PreparedStatement stmt = null;

        try {
            c = ConnectionFactory.getConnection();

            String query = "INSERT INTO administradores (emailAdm, senhaAdm) VALUES (?, ?);";
            stmt = c.prepareStatement(query);

            stmt.setString(1, a.getEmailAdm());
            stmt.setString(2, a.getSenhaAdm());

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

    public static void atualizar(Administrador a) throws Exception {
        Connection c = null;
        PreparedStatement stmt = null;

        try {
            c = ConnectionFactory.getConnection();

            String query = "UPDATE administradores SET emailAdm=?, senhaAdm=? WHERE id_adm=?;";
            stmt = c.prepareStatement(query);

            stmt.setString(1, a.getEmailAdm());
            stmt.setString(2, a.getSenhaAdm());
            stmt.setInt(3, a.getId_adm());

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

    public static void remover(Administrador a) throws Exception {
        Connection c = null;
        PreparedStatement stmt = null;

        try {
            c = ConnectionFactory.getConnection();

            String query = "DELETE FROM administradores WHERE id_adm=?;";
            stmt = c.prepareStatement(query);

            stmt.setInt(1, a.getId_adm());
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

    public static boolean administradorExiste(String email) throws Exception {
        String query = "SELECT COUNT(*) FROM administradores WHERE emailAdm = ?";

        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

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
