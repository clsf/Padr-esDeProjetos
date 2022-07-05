package Observer.comPadrao;

public class TempoDeEstudoLimite implements Observer{
	
	@Override
	public void atualizar(int tempoDeEstudo) {
		
		if (tempoDeEstudo >= 60) {
			System.out.println("Você está a mais de 1 hora estudando, "
					+ "\n recomendo que dê uma pausa");
		}
		
	}


	
}
