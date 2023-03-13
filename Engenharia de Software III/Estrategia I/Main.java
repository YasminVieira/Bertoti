package strategy;

public class Main {
	
	public static void main(String[] args) {
		Celular celular = new Celular();
		
		celular.setLigacao(new Teclado());
		celular.realizarLigacao();
		
		celular.setLigacao(new NaoLiga());
		celular.realizarLigacao();
	}

}