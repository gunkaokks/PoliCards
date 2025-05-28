package persistencia;

public class Sessao {
    private static int idAluno;
    
    private static String emailAluno;
    
    public static void iniciarSessao(int id, String email) {
        idAluno = id;
        emailAluno = email;
    }

    public static void encerrarSessao() {
        idAluno = 0;
        emailAluno = null;
    }

    public static int getIdAluno() {
        return idAluno;
    }

    public static String getEmailAluno() {
        return emailAluno;
    }

    public static boolean sessaoAtiva() {
        return idAluno != 0;
    }
}