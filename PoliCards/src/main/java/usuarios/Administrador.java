
package usuarios;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Administrador {
    private int id_adm;
    private String email;
    private String senha;

    public Administrador(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
}

