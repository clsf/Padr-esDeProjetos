package Bridge;



public class ControleAvancado extends ControleBasico {
		
		public ControleAvancado(Dispositivo dispositivo) {
			super.dispositivo = dispositivo;
		}
		
		public void mute() {
			System.out.println("Controle avançado: botão mute pressionado");
		}
	}
