package crudFlashcards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flashcards {
    private int id_flashcard;
    private int id_aluno;
    private int id_materia;
    private String pergunta;
    private String resposta;
    private String dificuldade;
    
    public Flashcards (int id_flashcard, int id_aluno, int id_materia, String pergunta, String resposta, String dificuldade) throws Exception {
        this.id_flashcard = id_flashcard;
        this.id_aluno = id_aluno;
        this.id_materia = id_materia;
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.dificuldade = dificuldade;
    }
    
    public Flashcards (int id_aluno, int id_materia, String dificuldade, String materia, String pergunta, String resposta) {
        this.id_aluno = id_aluno;
        this.dificuldade = dificuldade;
        this.id_materia = id_materia;
        this.pergunta = pergunta;
        this.resposta = resposta;
    }
    public Flashcards(int id_flashcard) {
        this.id_flashcard = id_flashcard;
    }
}