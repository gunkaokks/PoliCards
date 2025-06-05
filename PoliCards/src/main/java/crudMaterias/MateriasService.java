package crudMaterias;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import persistencia.ConnectionFactory;
import persistencia.Sessao;

public class MateriasService {

    public static ArrayList<Materias> get() throws Exception {
        ArrayList<Materias> lista = new ArrayList<>();
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = con.prepareStatement(
            "SELECT id_materia, materia FROM materias WHERE id_aluno = ?"
        );
        stmt.setInt(1, Sessao.getIdAluno());
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Materias m = new Materias();
            m.setId_materia(rs.getInt("id_materia"));
            m.setMateria(rs.getString("materia"));
            lista.add(m);
        }
        
        rs.close();
        stmt.close();
        con.close();
        
        return lista;
    }

    public static void adicionar(Materias materia) throws Exception {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = con.prepareStatement(
            "INSERT INTO materias (materia, id_aluno) VALUES (?, ?)"
        );
        stmt.setString(1, materia.getMateria());
        stmt.setInt(2, Sessao.getIdAluno());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    }

    public static void atualizar(Materias materia) throws Exception {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = con.prepareStatement(
            "UPDATE materias SET materia = ? WHERE id_materia = ? AND id_aluno = ?"
        );
        stmt.setString(1, materia.getMateria());
        stmt.setInt(2, materia.getId_materia());
        stmt.setInt(3, Sessao.getIdAluno());
        
        stmt.executeUpdate();
        
        stmt.close();
        con.close();
    }

    public static void remover(int idMateria) throws Exception {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = con.prepareStatement(
            "DELETE FROM materias WHERE id_materia = ? AND id_aluno = ?"
        );
        stmt.setInt(1, idMateria);
        stmt.setInt(2, Sessao.getIdAluno());
        
        stmt.execute();
        
        stmt.close();
        con.close();
    }

    public static boolean existe(String nomeMateria) throws Exception {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = con.prepareStatement(
            "SELECT COUNT(*) FROM materias WHERE materia = ? AND id_aluno = ?"
        );
        stmt.setString(1, nomeMateria);
        stmt.setInt(2, Sessao.getIdAluno());
        
        ResultSet rs = stmt.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        
        rs.close();
        stmt.close();
        con.close();
        
        return count > 0;
    }
}