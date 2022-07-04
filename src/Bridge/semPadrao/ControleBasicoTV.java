package Bridge.semPadrao;


public class ControleBasicoTV extends ControleRemoto{
	
	public ControleBasicoTV() {}
	
	private boolean on = false;
	

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
		System.out.println("Controle basico tv: botão ligar pressionado");
		if (this.isEnabled()) {
			this.disable();
		} else {
			this.enable();
		}
	}
}
