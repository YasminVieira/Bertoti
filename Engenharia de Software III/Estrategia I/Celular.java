package strategy;

public class Celular {
	
	private Ligacao ligacao;

	public void setLigacao(Ligacao pliga) {
		ligacao = pliga;
	}
	
	public void realizarLigacao() {
		ligacao.ligar();
	}

}