package crudMaterias;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import persistencia.ConnectionFactory;
import static persistencia.ConnectionFactory.getConnection;

public class MateriasDAO {
    private Connection conn;

    public MateriasDAO() throws SQLException {
        this.conn = new ConnectionFactory().getConnection();
    }

    public int salvarMateria(String materia) throws SQLException {
        String sql = "INSERT INTO materias (materia) VALUES (?)";

        try (PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, materia);
            ps.executeUpdate();

            try (ResultSet rs = ps.getGeneratedKeys()) {
                rs.next();
                return rs.getInt(1);
            }
        }
    }
    public List<Materias> listarTodasMaterias() throws SQLException {
        List<Materias> materias = new ArrayList<>();
        String sql = "SELECT id_materia, materia FROM materias";

        try (Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Materias m = new Materias();
                m.setId(rs.getInt("id_materia"));
                m.setNome(rs.getString("materia"));
                materias.add(m);
            }
        }
        return materias;
    }
    
    public int getIdMateria(String nomeMateria) {
        String sql = "SELECT id_materia FROM materias WHERE materia = ?";

        try (Connection conn = ConnectionFactory.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nomeMateria.trim());
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("id_materia");
            }

        } catch (SQLException e) {
            System.err.println("Erro ao buscar ID da matéria: " + e.getMessage());
        }

        return -1; // Retorna -1 se não encontrar
    }
}