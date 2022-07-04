package Bridge.semPadrao;

public class Main {
	
	
	public static void main(String args[]) {
		QuadradoAzul qa = new QuadradoAzul();
		qa.desenhar();
		
		QuadradoVerde qv = new QuadradoVerde();
		qv.desenhar();
		
		CirculoVerde ca = new CirculoVerde();
		ca.desenhar();
		
		CirculoVermelho cv = new CirculoVermelho();
		cv.desenhar();
	}
}
