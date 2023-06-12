package Controller;

import Model.Database;
import Model.Usuario;
import View.Form;
import View.DetalhesUsuario;
import javax.swing.*;
import java.io.File;

public class UsuarioController {
    
    private String databaseFile = "sr" + File.pathSeparator + "data" + File.pathSeparator + "database.txt";
    private Database database;
    private Form form;
    private DetalhesUsuario detalhesUsuario;

    public UsuarioController(Form form, DetalhesUsuario detalhesUsuario) {
        this.database = new Database();
        this.form = form;
        this.detalhesUsuario = detalhesUsuario;

        this.form.adicionarUsuario(e -> {
            String nome = this.form.obterNome().trim();
            String sobrenome = this.form.obterSobrenome().trim();

            if(nome.isEmpty()) {
                JOptionPane.showMessageDialog(this.form, "O nome é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            } else if(sobrenome.isEmpty()) {
                JOptionPane.showMessageDialog(this.form, "O sobrenome é obrigatório!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            this.database.adicionarUsuario(new Usuario(nome, sobrenome));
            this.database.salvarUsuario(new File(databaseFile));
            this.form.limpar(true);
            JOptionPane.showMessageDialog(this.form, "Usuário adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        });

        this.form.visualizarUsuarios(e -> {
            this.detalhesUsuario.obterUsuarios(this.database.carregarUsuarios(new File(databaseFile)));
        });
    }
}
