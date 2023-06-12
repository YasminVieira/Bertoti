package Model;

import java.io.*;
import java.util.ArrayList;

public class Database {

    private ArrayList<Usuario> usuarioArrayList;

    public Database() {
        usuarioArrayList = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarioArrayList.add(usuario);
    }

    public void salvarUsuario(File file) {
        try {
            Usuario usuario;
            String save_data = "";

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            int i = 0;
            while( i < usuarioArrayList.size()) {
                usuario = usuarioArrayList.get(i);
                save_data = usuario.obterNome() + ", " + usuario.obterSobrenome();
                i++;
            }
            bufferedWriter.write(save_data);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object[] carregarUsuarios(File file) {
        Object[] objects;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            objects = bufferedReader.lines().toArray();
            bufferedReader.close();
            return objects;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
