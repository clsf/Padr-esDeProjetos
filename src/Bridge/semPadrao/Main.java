package Bridge.semPadrao;

public class Main {
	
	
	public static void main(String args[]) {
		ControleBasicoTV basicoTV = new ControleBasicoTV();
		basicoTV.power();
		
		ControleAvancadoTV avancadoTV = new ControleAvancadoTV();
		avancadoTV.mute();
		
		ControleBasicoRadio basicoRadio = new ControleBasicoRadio();
		basicoRadio.power();
		
		ControleAvancadoRadio avancadoRadio = new ControleAvancadoRadio();
		avancadoRadio.mute();
	}
}
