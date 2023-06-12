package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class DetalhesUsuario extends JPanel {

    private static final long serialVersionUID = 1L;
	private JTable usuarioTable;
    private String[] usuarioTableColumn = {"NOME", "SOBRENOME"};

    private JButton voltarButton;

    public DetalhesUsuario() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        JToolBar toolBar = new JToolBar();
        usuarioTable = new JTable();
        JScrollPane usuarioTableScroll = new JScrollPane(usuarioTable, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        voltarButton = new JButton("Voltar");
        add(toolBar);
        toolBar.add(voltarButton);
        toolBar.setMaximumSize(new Dimension(Integer.MAX_VALUE, toolBar.getMinimumSize().height));
        add(usuarioTableScroll);
    }

    public void obterUsuarios(Object[] objects) {
        DefaultTableModel defaultTableModel = (DefaultTableModel) usuarioTable.getModel();
        defaultTableModel.setColumnIdentifiers(usuarioTableColumn);
        defaultTableModel.setRowCount(0);
        int i = 0;
        while(i < objects.length) {
            String row = objects[i].toString().trim();
            String[] rows = row.split(",");
            defaultTableModel.addRow(rows);
            i++;
        }
    }

    public void voltarButton(ActionListener actionListener) {
        voltarButton.addActionListener(actionListener);
    }
}
