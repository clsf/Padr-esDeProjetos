package Bridge.comPadrao;

public class Circulo extends Forma{
	private Cor cor;
	
	public Circulo(Cor cor) {
		this.cor = cor;
	}
	
	public void desenhar() {
		System.out.println("Desenhando um circulo " + this.cor.pegarCor());
	}
}
