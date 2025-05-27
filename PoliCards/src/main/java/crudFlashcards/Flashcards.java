package crudFlashcards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flashcards {
    private int id;
    private String pergunta;
    private String resposta;
    private String materia;
    private String dificuldade;
    
    public Flashcards (int id, String pergunta, String resposta, String materia, String dificuldade) throws Exception {
        this.id = id;
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.materia = materia;
        this.dificuldade = dificuldade;
    }
}
