package Model;

public class Usuario {
    private String nome;
    private String sobrenome;

    public Usuario() {
        
    }

    public Usuario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String obterNome() {
        return nome;
    }

    public String obterSobrenome() {
        return sobrenome;
    }
}
