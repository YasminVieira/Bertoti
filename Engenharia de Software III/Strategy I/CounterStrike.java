public class CounterStrike {
    public static void main(String[] args) {

        Jogador terrorista = new Jogador("Terrorista");
        Jogador contra_terrorista = new Jogador("Contra Terrorista");

        System.out.println("Início do jogo: a bomba ainda não foi plantada");
        terrorista.setComportamento(new EstrategiaAgressiva());
        contra_terrorista.setComportamento(new EstrategiaDefensiva());

        terrorista.acao();
        contra_terrorista.acao();
        
    }
}