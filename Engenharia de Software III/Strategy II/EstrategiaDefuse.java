public class EstrategiaDefuse implements Estrategia {

    @Override
    public void comandoDeAcao() {
        System.out.println("Estratégia defuse => Desarmar a bomba em até 30 segundos!");
    }
}