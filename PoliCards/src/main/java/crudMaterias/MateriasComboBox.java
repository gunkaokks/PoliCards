package crudMaterias;

import java.sql.SQLException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

public class MateriasComboBox {
    public static void carregarMaterias(JComboBox<Materias> comboBox) {
        try {
            MateriasDAO dao = new MateriasDAO();
            List<Materias> materias = dao.listarTodasMaterias();
            DefaultComboBoxModel<Materias> modelo = new DefaultComboBoxModel<>();

            for (Materias materia : materias) {
                modelo.addElement(materia);
            }
            comboBox.setModel(modelo);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
