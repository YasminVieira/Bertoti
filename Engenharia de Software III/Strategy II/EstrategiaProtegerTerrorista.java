public class EstrategiaProtegerTerrorista implements Estrategia {

    @Override
    public void comandoDeAcao() {
        System.out.println("Estratégia de proteção => Encontrar um local para proteção e impedir que o ct " +
                "desarme a bomba!");
    }
}