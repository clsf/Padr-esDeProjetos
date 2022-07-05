package Mediator.comPadrao;



	public class Main {
		public static void main(String args[]) {
			System.out.println("Com Padrão:");
			mediatorConcret mediator  = new mediatorConcret();
			ButtonAdc btAdc = new ButtonAdc(mediator);
			ButtonRemove btRemove = new ButtonRemove(mediator);
			
			mediator.setBtAdc(btAdc);
			mediator.setBtRemove(btRemove);
			
			btAdc.clickBt();
			btRemove.clickBt();		
			
			
		}
}
