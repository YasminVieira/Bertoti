package strategy;

public class Main {
	
	public static void main(String[] args) {
		Celular celular = new Celular();
		
		celular.setLigacao(new Teclado());
		celular.realizarLigacao();
		
		celular.setLigacao(new NaoLiga());
		celular.realizarLigacao();
		
		celular.setCalculadora(new Soma());
		celular.utilizarCalculadora();
		
		celular.setCalculadora(new Subtracao());
		celular.utilizarCalculadora();
		
		celular.setCamera(new Foto());
		celular.utilizarCamera();
		
		celular.setCamera(new Video());
		celular.utilizarCamera();
	}

}