package crudFlashcards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flashcards {
    private int id_flashcards;
    private int id_aluno;
    private int id_materia;
    private String pergunta;
    private String resposta;
    private String dificuldade;
    
    public Flashcards (int id_aluno, int id_materia, String pergunta, String resposta, String dificuldade) throws Exception {
        this.id_aluno = id_aluno;
        this.id_materia = id_materia;
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.dificuldade = dificuldade;
    }
}