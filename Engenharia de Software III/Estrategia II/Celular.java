package strategy;

public class Celular {
	
	private Ligacao ligacao;
	private Calculadora calculadora;
	private Camera camera;

	public void setLigacao(Ligacao pliga) {
		ligacao = pliga;
	}
	
	public void realizarLigacao() {
		ligacao.ligar();
	}
	
	public void setCalculadora(Calculadora pcalcula) {
		calculadora = pcalcula;
	}
	
	public void utilizarCalculadora() {
		calculadora.calcular();
	}
	
	public void setCamera(Camera pcamera) {
		camera = pcamera;
	}
	
	public void utilizarCamera() {
		camera.capturar();
	}

}