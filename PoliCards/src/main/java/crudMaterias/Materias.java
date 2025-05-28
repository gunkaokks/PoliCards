package crudMaterias;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Materias {
    private int id_materia;
    private String materia;
    
    private int id;
    private String nome;

    // Construtor com parâmetros
    public Materias(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Construtor vazio (se necessário)
    public Materias() {
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome; // Isso será mostrado no ComboBox
    }
}