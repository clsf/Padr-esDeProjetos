package Command.semPadrao;

public class PortaEletronica {
	
	private boolean estadoPorta = false; 
	
	public PortaEletronica() {
		this.estadoPorta = false;
	}
	
	
	public boolean abrirPorta() {
		this.estadoPorta = true; 
		System.out.println("A porta está aberta!!");
		return this.estadoPorta;
	}
	
	public boolean fecharPorta() {
		this.estadoPorta = false; 
		System.out.println("A porta está fechada!!");
		return this.estadoPorta;
	}
}
