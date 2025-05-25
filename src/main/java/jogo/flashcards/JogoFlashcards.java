import java.util.ArrayList;
import java.util.List;

public class JogoFlashcards {
    private List<Baralho> baralhos;

    public JogoFlashcards() {
        this.baralhos = new ArrayList<>();
    }

    public void adicionarBaralho(Baralho baralho) {
        baralhos.add(baralho);
    }

    public List<Baralho> getBaralhos() {
        return baralhos;
    }

    public void listarBaralhos() {
        if (baralhos.isEmpty()) {
            System.out.println("Nenhum baralho criado.");
        } else {
            for (int i = 0; i < baralhos.size(); i++) {
                System.out.println((i + 1) + " - " + baralhos.get(i));
            }
        }
    }
}
