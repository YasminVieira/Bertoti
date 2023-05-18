public class CounterStrike {
    public static void main(String[] args) {

        Jogador terrorista = new Jogador("Terrorista");
        Jogador contra_terrorista = new Jogador("Contra Terrorista");

        System.out.println("Início do jogo: a bomba ainda não foi plantada");
        terrorista.setComportamento(new EstrategiaPlante());
        contra_terrorista.setComportamento(new EstrategiaProtegerCT());

        terrorista.acao();
        contra_terrorista.acao();

        System.out.println();
        System.out.println("No decorrer do jogo: a bomba foi plantada pelos terroristas");
        terrorista.setComportamento(new EstrategiaProtegerTerrorista());
        contra_terrorista.setComportamento(new EstrategiaDefuse());

        terrorista.acao();
        contra_terrorista.acao();
    }
}