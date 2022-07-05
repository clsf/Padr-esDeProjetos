package Observer.comPadrao;

public class Main {
	public static void main(String args[]) {
		
		TempoDeEstudoLimite observador = new TempoDeEstudoLimite();
		TempoDeEstudo observado = new TempoDeEstudo(); 
		observado.registrarObservador(observador);
		observado.setTempo(60);
	}
	
	
}
