package crudMaterias;

import lombok.Getter;
import lombok.Setter;
import persistencia.Sessao;

@Getter
@Setter
public class Materias {
    private int id_materia;
    private String materia;
    private int id_aluno = Sessao.getIdAluno();

    public Materias(int id_materia, String materia) {
        this.id_materia = id_materia;
        this.materia = materia;
        this.id_aluno = Sessao.getIdAluno();
    }

    public Materias() {
        this.id_aluno = Sessao.getIdAluno();
    }

    @Override
    public String toString() {
        return materia;
    }
}