package Command.comPadrao;


public class PortaCommand implements Command {
	
	private PortaEletronica porta;
	
	public PortaCommand(PortaEletronica porta) {
		this.porta = porta;
	}
	
	public void executar() {
		porta.abrirPorta(); 
	}
	
	public void desfazer() {
		porta.fecharPorta();
	}
}
