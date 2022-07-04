package Bridge.semPadrao;

public class ControleAvancadoRadio extends ControleRemoto{
	private boolean on = false;
	
	
	public void mute() {
		System.out.println("Controle avançado radio: botão mute pressionado");
	}

	public boolean isEnabled() {
		return on;
	}
	

	public void enable() {
		on = true;
	}
	

	public void disable() {
		on = false;
	}
	

	public void power() {
		System.out.println("Controle remoto: botão ligar pressionado");
		if (this.isEnabled()) {
			this.disable();
		} else {
			this.enable();
		}
	}
}
