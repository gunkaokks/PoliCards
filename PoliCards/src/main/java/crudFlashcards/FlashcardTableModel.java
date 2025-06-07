package crudFlashcards;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class FlashcardTableModel extends AbstractTableModel {
    private List<FlashcardResposta> dados = new ArrayList<>();
    private String[] colunas = {"ID", "Pergunta", "Resposta", "Dificuldade", "Matéria", "Status"};

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
        FlashcardResposta f = dados.get(linha);

        switch (coluna) {
            case 0:
                return f.getId_flashcard();
                
            case 1:
                return f.getPergunta();
                
            case 2:
                return f.getResposta();
                
            case 3:
                return f.getDificuldade();
                
            case 4:
                return f.getNomeMateria(); 
                
            case 5:
                Boolean acertou = f.getAcertou();
                if (acertou == null) {
                    return "Não jogou";
                } else if (acertou) {
                    return "Acertou";
                } else {
                    return "Errou";
                }
                
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        FlashcardResposta f = dados.get(linha);

        switch (coluna) {
            case 1:
                f.setPergunta((String) valor);
                break;
            case 2:
                f.setResposta((String) valor);
                break;
            case 3:
                f.setDificuldade((String) valor);
                break;
            case 4:
                f.setNomeMateria((String) valor);
                break;
            case 5:
                if (valor instanceof Boolean) {
                    f.setAcertou((Boolean) valor);
                }
                break;
           
        }
        fireTableRowsUpdated(linha, linha);
    }

    public void addRow(FlashcardResposta f) {
        this.dados.add(f);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.dados.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }

    public FlashcardResposta getFlashcard(int row) {
        return dados.get(row);
    }

    public void atualizar(FlashcardResposta f, int index) throws Exception {
        FlashcardResposta f2 = dados.get(index);

        f2.setPergunta(f.getPergunta());
        f2.setResposta(f.getResposta());
        f2.setDificuldade(f.getDificuldade());
        f2.setNomeMateria(f.getNomeMateria());
        f2.setAcertou(f.getAcertou());

        fireTableRowsUpdated(index, index);
    }
    @Override
    public boolean isCellEditable(int row, int column) {
        return column >= 1 && column <= 4;
    }
    
    public void limparDados() {
        int rowCount = dados.size();
        if (rowCount > 0) {
            dados.clear();
            fireTableRowsDeleted(0, rowCount - 1);
        }
    }
}
