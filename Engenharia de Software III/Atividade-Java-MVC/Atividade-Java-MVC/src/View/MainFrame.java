package View;

import Controller.UsuarioController;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;
	private CardLayout cardLayout;

    public MainFrame() {
        super("Atividade Java MVC - Cadastro de Usuários");
        cardLayout = new CardLayout();
        Form form = new Form();
        DetalhesUsuario detalhesUsuario = new DetalhesUsuario();
        
        setLayout(cardLayout);

        new UsuarioController(form, detalhesUsuario);

        add(form, "form");
        add(detalhesUsuario, "Usuários Cadastrados");        
        form.visualizarUsuarios(e -> cardLayout.show(MainFrame.this.getContentPane(), "Usuários Cadastrados"));
        detalhesUsuario.voltarButton(e -> cardLayout.show(MainFrame.this.getContentPane(), "form"));

        // icone
        ImageIcon imageIcon = new ImageIcon("src/assets/usuario.png");
        setIconImage(imageIcon.getImage());
        
        // tamanho da tela
        int FRAME_WIDTH = 600;
        int FRAME_HEIGHT = 350;
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
