public class CounterStrike {
    public static void main(String[] args) {

        Jogador terrorista = new Jogador("Terrorista");
        Jogador contra_terrorista = new Jogador("Contra Terrorista");

        System.out.println("Antes da bomba ser plantada");
        terrorista.setComportamento(new EstrategiaAgressiva());
        contra_terrorista.setComportamento(new EstrategiaDefensiva());

        terrorista.acao();
        contra_terrorista.acao();

        System.out.println();
        System.out.println("Depois da bomba ser plantada");
        terrorista.setComportamento(new EstrategiaDefensiva());
        contra_terrorista.setComportamento(new EstrategiaAgressiva());

        terrorista.acao();
        contra_terrorista.acao();
    }
}