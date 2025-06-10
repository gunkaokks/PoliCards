package crudFlashcards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FlashcardResposta {

    private int id_flashcard;
    private int id_materia;
    private String pergunta;
    private String resposta;
    private String dificuldade;
    private Boolean acertou;
    private String nomeMateria;

    public FlashcardResposta(int id_flashcard, String pergunta, String resposta,
            String dificuldade, Boolean acertou, int id_materia,
            String nomeMateria) {
        this.id_flashcard = id_flashcard;
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.dificuldade = dificuldade;
        this.acertou = acertou;
        this.id_materia = id_materia;
        this.nomeMateria = nomeMateria;
    }

    public boolean foiTentado() {
        return acertou != null;
    }

    public String getStatusTentativa() {
        if (acertou == null) {
            return "Não tentado";
        }
        return acertou ? "Acertou" : "Errou";
    }

    public boolean isCorreto() {
        return Boolean.TRUE.equals(acertou);
    }

    public boolean isErrado() {
        return Boolean.FALSE.equals(acertou);
    }
    
    @Override
    public String toString() {
        return "FlashcardResposta{"
                + "id_flashcard=" + id_flashcard
                + ", pergunta='" + pergunta + '\''
                + ", resposta='" + resposta + '\''
                + ", dificuldade='" + dificuldade + '\''
                + ", acertou=" + acertou
                + ", id_materia=" + id_materia
                + ", nomeMateria='" + nomeMateria + '\''
                + '}';
    }
}