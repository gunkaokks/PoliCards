package com.mycompany.policards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private int id_aluno;
    private String email;
    private String senha;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
}
