package Bridge.semPadrao;

public class ControleAvancadoTV extends ControleRemoto{
	
	private boolean on = false;
	
	public void mute() {
		System.out.println("Controle avançado tv: botão mute pressionado");
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
		System.out.println("Controle avançado tv: botão ligar pressionado");
		if (this.isEnabled()) {
			this.disable();
		} else {
			this.enable();
		}
	}
}
