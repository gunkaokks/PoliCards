package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import usuarios.Administrador;
import usuarios.Usuario;

public class DAO {
    private Connection con;

    public boolean autenticar(String u, String senha) throws Exception {
        //jdbc: Java Database Connectivity

        //1-Especificar o comando SQL
        String sql = "SELECT * FROM alunos WHERE emailAluno = ? AND senhaAluno = ?";
        //2-Estabelecer uma conexao com o banco de dados
        con = ConnectionFactory.getConnection();
        boolean achou;
        //4-Substituir os eventuais placeholders
        try ( //3-Preparar o comando
                PreparedStatement ps = con.prepareStatement(sql)) {
            //4-Substituir os eventuais placeholders
            ps.setString(1, u.getEmail());
            ps.setString(2, u.getSenha());
            //6-Lidar com o resultado
            try ( //5-Executar o comando
                    ResultSet rs = ps.executeQuery()) {
                //6-Lidar com o resultado
                achou = rs.next();
                //7-Fechar conexao
            }
        }
        con.close();
        //8-Responder se o usuario existe ou nao
        return achou;
    }
    public void cadastrarUsuario(Usuario Usuario) throws Exception {

        con = ConnectionFactory.getConnection();

        String sql = "INSERT INTO alunos (emailAluno, senhaAluno) VALUES (?,?);";
        
        //ps.setLong(1, 3);
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            //ps.setLong(1, 3);
            ps.setString(1, Usuario.getEmail());
            ps.setString(2, Usuario.getSenha());
            // ps.execute();
            // int resultado =
            ps.executeUpdate();
            //if (resultado == 1) {
            //   System.out.println("Dados inseridos com sucesso!");
            //}
        }
        con.close();
    }  
    public boolean autenticarAdm(Administrador a) throws Exception {
        //jdbc: Java Database Connectivity

        //1-Especificar o comando SQL
        String sql = "SELECT * FROM administradores WHERE emailAdm = ? AND senhaAdm = ?";
        //2-Estabelecer uma conexao com o banco de dados
        con = ConnectionFactory.getConnection();
        boolean achouAdmin;
        //4-Substituir os eventuais placeholders
        try ( //3-Preparar o comando
                PreparedStatement ps = con.prepareStatement(sql)) {
            //4-Substituir os eventuais placeholders
            ps.setString(1, a.getEmail());
            ps.setString(2, a.getSenha());
            //6-Lidar com o resultado
            try ( //5-Executar o comando
                    ResultSet rs = ps.executeQuery()) {
                //6-Lidar com o resultado
                achouAdmin = rs.next();
                //7-Fechar conexao
            }
        }
        con.close();
        //8-Responder se o usuario existe ou nao
        return achouAdmin;
    }
    public void cadastrarAdm(Administrador Administrador) throws Exception {

        con = ConnectionFactory.getConnection();

        String sql = "INSERT INTO administradores (emailAdm, senhaAdm) VALUES (?,?);";
        
        try (PreparedStatement ps = con.prepareStatement(sql)
        //ps.setLong(1, 3);        String sql = "INSERT INTO administradores (emailAdmin, senhaJogador, serie) VALUES (?,?,?,?);";
        ) {
            ps.setString(1, Administrador.getEmail());
            ps.setString(2, Administrador.getSenha());
            // ps.execute();
            // int resultado =
            ps.executeUpdate();
            //if (resultado == 1) {
            //   System.out.println("Dados inseridos com sucesso!");
            //}
        }
        con.close();
    }

    public boolean cadastrar(Usuario novoUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
