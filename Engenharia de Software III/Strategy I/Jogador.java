public class Jogador {
    Estrategia comportamento;
    String tipo;

    public Jogador(String tipo) {
        this.tipo = tipo;
    }

    public void setComportamento(Estrategia comportamento) {
        this.comportamento = comportamento;
    }

    public void acao() {
        System.out.println("Jogador: " + this.tipo);
        comportamento.comandoDeAcao();
    }
}