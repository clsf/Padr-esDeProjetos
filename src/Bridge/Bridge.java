public class Bridge {
	
	public static void main(String args[]) {
		Radio radio = new Radio();
		System.out.println("Testes controle basico");
		ControleBasico ControleBasico = new ControleBasico(radio);
		radio.printStatus();
		ControleBasico.power();
		radio.printStatus();
		
		TV tv = new TV();
		System.out.println("Testes controle avançado");
		ControleAvancado ControleAvancado = new ControleAvancado(tv);
		ControleAvancado.power();
		ControleAvancado.mute();
		tv.printStatus();
	}
	
	
}
	
