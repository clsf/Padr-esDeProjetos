package Command.comPadrao;


public class PortaEletronicaApp {
	
	private Command[] commands; 

	
	public PortaEletronicaApp(Command Command) {
		this.commands = new Command[1]; 
		commands[0] = Command;  
	}
	
	public void abrirPorta() {
		commands[0].executar();  
	}
	
	public void fecharPorta() {
		commands[0].desfazer();
	} 
	
	
	
}
