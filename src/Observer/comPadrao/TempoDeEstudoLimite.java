package Observer.comPadrao;

public class TempoDeEstudoLimite implements Observer{
	
	@Override
	public void atualizar(int tempoDeEstudo) {
		
		if (tempoDeEstudo >= 60) {
			System.out.println("Voc� est� a mais de 1 hora estudando, "
					+ "\n recomendo que d� uma pausa");
		}
		
	}


	
}
