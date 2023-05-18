public class EstrategiaPlante implements  Estrategia {

    @Override
    public void comandoDeAcao() {
        System.out.println("Estratégia plante => Plantar a bomba no local certo!");
    }
}