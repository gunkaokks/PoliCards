package crudMaterias;

import lombok.Getter;
import lombok.Setter;
import persistencia.Sessao;

@Getter
@Setter
public class Materias {
    private int id_materia;
    private String materia;
    private int id;
    private String nome;
    private int id_aluno = Sessao.getIdAluno();

    public Materias(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.id_aluno = Sessao.getIdAluno();
    }

    public Materias() {
        this.id_aluno = Sessao.getIdAluno();
    }

    @Override
    public String toString() {
        return nome;
    }
}