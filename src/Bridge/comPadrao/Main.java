package Bridge.comPadrao;
public class Main {
	
	public static void main(String args[]) {
		Circulo circuloVerde = new Circulo(new Verde());
		circuloVerde.desenhar();
		
		Circulo circuloVerm = new Circulo(new Vermelho());
		circuloVerm.desenhar();
		
		Quadrado quadradoVerde = new Quadrado(new Verde());
		quadradoVerde.desenhar();
		
		Quadrado quadradoVerm = new Quadrado(new Vermelho());
		quadradoVerm.desenhar();
	}
	
	
}
	
