package usuario;

import com.mycompany.policards.Administrador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AdmTableModel extends AbstractTableModel{
   
    private List<Administrador> dados = new ArrayList<>();
    private String[] colunas = {"id", "Email", "Senha"};

    @Override
    public String getColumnName(int column) {
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

        switch (coluna) {
            case 0:
                return dados.get(linha).getId_adm();
            case 1:
                return dados.get(linha).getEmailAdm();
            case 2:
                return dados.get(linha).getSenhaAdm();

        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {

        switch (coluna) {
            case 0:
                dados.get(linha).setId_adm(Integer.parseInt((String) valor));
                break;
            case 1:
                dados.get(linha).setEmailAdm((String) valor);
                break;
            case 2:
                dados.get(linha).setSenhaAdm((String) valor);
                break;

        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void addRow(Administrador a) {
        this.dados.add(a);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public Administrador getAdm(int row) {
        return dados.get(row);
    }

    public void atualizar(Administrador a, int index) throws Exception {
        Administrador a2 = dados.get(index);

        a2.setEmailAdm(a.getEmailAdm());
        a2.setSenhaAdm(a.getSenhaAdm());

        fireTableRowsUpdated(index, index);
    }
}

