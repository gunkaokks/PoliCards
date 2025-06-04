package usuario;

import com.mycompany.policards.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class UsuarioTableModel extends AbstractTableModel {
    private List<Usuario> dados = new ArrayList<>();
    private String[] colunas ={"id","Email","Senha"};
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return dados.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna) {

        switch(coluna){
            case 0:
                return dados.get(linha).getId_aluno();
            case 1:
                return dados.get(linha).getEmailAluno();
            case 2:
                return dados.get(linha).getSenhaAluno();
                
        }
        return null;
    }
    
    @Override
    public void setValueAt(Object valor, int linha, int coluna){
        
        switch(coluna){
            case 0:
                dados.get(linha).setId_aluno(Integer.parseInt((String) valor));
                break;
            case 1:
                dados.get(linha).setEmailAluno((String) valor);
                break;
            case 2:
                dados.get(linha).setSenhaAluno((String) valor);
                break;
              
        }
        this.fireTableRowsUpdated(linha,linha);
    }
    
    public void addRow(Usuario u){
        this.dados.add(u);
        this.fireTableDataChanged();
    }
    
    public void removeRow(int linha){
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
    
    public Usuario getUsuario(int row) {
        return dados.get(row);
    }
    
    public void atualizar(Usuario u, int index) throws Exception {
        Usuario u2 = dados.get(index);
        
        u2.setEmailAluno(u.getEmailAluno());
        u2.setSenhaAluno(u.getSenhaAluno());

        fireTableRowsUpdated(index, index);
    }
}
