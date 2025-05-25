import java.util.ArrayList;
import java.util.List;

public class Baralho {
    private String materia;
    private String dificuldade;
    private List<Flashcard> flashcards;

    public Baralho(String materia, String dificuldade) {
        this.materia = materia;
        this.dificuldade = dificuldade;
        this.flashcards = new ArrayList<>();
    }

    public void adicionarFlashcard(Flashcard card) {
        flashcards.add(card);
    }

    public List<Flashcard> getFlashcards() {
        return flashcards;
    }

    public String getMateria() {
        return materia;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    @Override
    public String toString() {
        return "Matéria: " + materia + " | Dificuldade: " + dificuldade + 
               " | Total de flashcards: " + flashcards.size();
    }
}
