package Mediator.comPadrao;



	public class main {
		public static void Main(String args[]) {
			System.out.println("Com Padr�o:");
			mediatorConcret mediator  = new mediatorConcret();
			ButtonAdc btAdc = new ButtonAdc(mediator);
			ButtonRemove btRemove = new ButtonRemove(mediator);
			
			mediator.setBtAdc(btAdc);
			mediator.setBtRemove(btRemove);
			
			btAdc.clickBt();
			btRemove.clickBt();		
			
			
		}
}
