package Bridge.comPadrao;

public class Quadrado extends Forma {
	private Cor cor;
	
	public Quadrado(Cor cor) {
		this.cor = cor;
	}
	
	public void desenhar() {
		System.out.println("Desenhando um quadrado " + this.cor.pegarCor());
	}
}
