public class EstrategiaProtegerCT implements Estrategia {

    @Override
    public void comandoDeAcao() {
        System.out.println("Estratégia de proteção => Encontrar um local seguro e não permitir que os " +
                "terrotistas plantem a bomba");
    }
}