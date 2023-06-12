package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Form extends JPanel {

    private static final long serialVersionUID = 1L;
	private JTextField nomeField;
    private JTextField sobrenomeField;

    private JButton adicionarButton;
    private JButton visualizarButton;

    public Form() {

        JLabel nomeLabel = new JLabel("Nome: ");
        JLabel lastnameLabel = new JLabel("Sobrenome: ");

        nomeField = new JTextField(25);
        sobrenomeField = new JTextField(25);

        adicionarButton = new JButton("Adicionar Usuário");
        adicionarButton.setPreferredSize(new Dimension(278, 40));
        visualizarButton = new JButton("Visualizar Usuários");
        visualizarButton.setPreferredSize(new Dimension(278, 40));

        Insets fieldsInset = new Insets(0, 0, 10, 0);        
        Insets buttonInset = new Insets(20,0,0,0);

        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.insets = fieldsInset;
        gridBagConstraints.fill = GridBagConstraints.NONE;

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        add(nomeLabel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;

        add(nomeField, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;

        add(lastnameLabel, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;

        add(sobrenomeField, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = buttonInset;

        add(adicionarButton, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = buttonInset;

        add(visualizarButton, gridBagConstraints);
    }

    public String obterNome() {
        return nomeField.getText();
    }

    public String obterSobrenome() {
        return sobrenomeField.getText();
    }

    public void adicionarUsuario(ActionListener actionListener) {
        adicionarButton.addActionListener(actionListener);
    }

    public void visualizarUsuarios(ActionListener actionListener) {
        visualizarButton.addActionListener(actionListener);
    }

    // limpa os campos
    public void limpar(boolean bln) {
        if(bln) {
            nomeField.setText("");
            sobrenomeField.setText("");
        }
    }
}
