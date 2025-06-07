package crudMaterias;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import persistencia.ConnectionFactory;
import persistencia.Sessao;

public class MateriasDAO {

    private Connection conn;

    public MateriasDAO() throws SQLException {
        this.conn = new ConnectionFactory().getConnection();
    }

    public int salvarMateria(String materia) throws SQLException {
        String sql = "INSERT INTO materias (materia, id_aluno) VALUES (?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, materia);
            ps.setInt(2, Sessao.getIdAluno());
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    return rs.getInt(1);
                }
            }
        }
        return -1;
    }

    public List<Materias> listarTodasMaterias() throws SQLException {
        List<Materias> materias = new ArrayList<>();
        String sql = "SELECT id_materia, materia FROM materias WHERE id_aluno = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, Sessao.getIdAluno());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materias m = new Materias();
                m.setId_materia(rs.getInt("id_materia"));
                m.setMateria(rs.getString("materia"));
                m.setId_aluno(Sessao.getIdAluno());
                materias.add(m);
            }
        }
        return materias;
    }

    public int getIdMateria(String nomeMateria) {
        String sql = "SELECT id_materia FROM materias WHERE materia = ? AND id_aluno = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, nomeMateria.trim());
            ps.setInt(2, Sessao.getIdAluno());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("id_materia");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar ID da matéria: " + e.getMessage());
        }
        return -1;
    }
    
    public String getNomeMateria(int idMateria) throws SQLException {
        String sql = "SELECT materia FROM materias WHERE id_materia = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("materia");
            }
        }
        return "Matéria desconhecida";
    }
    
    public boolean deletarMateria(int idMateria) throws SQLException {
        String sql = "DELETE FROM materias WHERE id_materia = ? AND id_aluno = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idMateria);
            ps.setInt(2, Sessao.getIdAluno());
            return ps.executeUpdate() > 0;
        }
    }
    
    public boolean atualizarMateria(Materias materia) throws SQLException {
        String sql = "UPDATE materias SET materia = ? WHERE id_materia = ? AND id_aluno = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, materia.getMateria());
            ps.setInt(2, materia.getId_materia());
            ps.setInt(3, materia.getId_aluno());

            return ps.executeUpdate() > 0;
        }
    }

    public void close() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            System.err.println("Erro ao fechar conexão: " + e.getMessage());
        }
    }
}