package Observer.comPadrao;

import java.util.ArrayList;
import java.util.List;

public class TempoDeEstudo implements Observable{
	
	private List<Observer>observadores = new ArrayList<>();
	private int tempo;
	
	
	public int getTempo() {
		return tempo;
	}
	
	public void setTempo(int tempo) {
		this.tempo = tempo;
		this.notificarObservadores();
	}

	@Override
	public void registrarObservador(Observer observador) {
		observadores.add(observador);
		
	}

	@Override
	public void removerObservador(Observer observador) {
		observadores.remove(observador);
		
	}

	@Override
	public void notificarObservadores() {
		
		for (Observer ob : observadores) {
			System.out.println("Notificando observadores");
			ob.atualizar(this.tempo);
		}
		
	}
	
	
}
