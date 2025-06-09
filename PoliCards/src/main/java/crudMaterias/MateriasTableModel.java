package crudMaterias;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MateriasTableModel extends AbstractTableModel {

    private List<Materias> listaMaterias = new ArrayList<>();
    private String[] colunas = {"ID", "Matéria"};

    public List<Materias> getDados() {
        return listaMaterias;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return listaMaterias.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna) {
            case 0:
                return listaMaterias.get(linha).getId_materia();
            case 1:
                return listaMaterias.get(linha).getMateria();
        }
        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0:
                listaMaterias.get(linha).setId_materia(Integer.parseInt((String) valor));
                break;
            case 1:
                listaMaterias.get(linha).setMateria((String) valor);
                break;
        }
        this.fireTableRowsUpdated(linha, linha);
    }

    public void addRow(Materias m) {
        this.listaMaterias.add(m);
        this.fireTableDataChanged();
    }
    
    public Materias getMateria(int row) {
        if (row >= 0 && row < listaMaterias.size()) {
            return listaMaterias.get(row);
        }
        return null;
    }
}