package com.mycompany.policards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private int id_aluno;
    private String emailAluno;
    private String senhaAluno;

    public Usuario(String emailAluno, String senhaAluno) {
        this.emailAluno = emailAluno;
        this.senhaAluno = senhaAluno;
        
    }
}
