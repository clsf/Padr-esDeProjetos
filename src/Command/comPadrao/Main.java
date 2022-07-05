package Command.comPadrao;


public class Main {
	
	public static void main(String[] args) {
		
		//Receiver
		PortaEletronica porta = new PortaEletronica();
		
		//Command
		PortaCommand portaComando = new PortaCommand(porta);
		
		//Controle - Invoker
		PortaEletronicaApp portaApp = new PortaEletronicaApp(portaComando);
		
		portaApp.abrirPorta(); 
		portaApp.fecharPorta(); 
		
		
	}
}
