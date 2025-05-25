public class Flashcard {
    private String pergunta;
    private String resposta;

    public Flashcard(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    @Override
    public String toString() {
        return "Pergunta: " + pergunta + "\nResposta: " + resposta;
    }
}
