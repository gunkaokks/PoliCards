package com.mycompany.policards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private int id_usuario;
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        
    }
}
