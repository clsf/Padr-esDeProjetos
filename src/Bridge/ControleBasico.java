package Bridge;



public class ControleBasico implements ControleRemoto {
		protected Dispositivo dispositivo;
		
		public ControleBasico() {}
		
		public ControleBasico(Dispositivo dispositivo) {
			this.dispositivo = dispositivo;
		}
		
		@Override
		public void power() {
			System.out.println("Controle remoto: botão ligar pressionado");
			if (dispositivo.isEnabled()) {
				dispositivo.disable();
			} else {
				dispositivo.enable();
			}
		}
	}