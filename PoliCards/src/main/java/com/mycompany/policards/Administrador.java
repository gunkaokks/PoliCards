package com.mycompany.policards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Administrador {
    private int id_adm;
    private String emailAdm;
    private String senhaAdm;

    public Administrador(String emailAdm, String senhaAdm) {
        this.emailAdm = emailAdm;
        this.senhaAdm = senhaAdm;
        }
}
