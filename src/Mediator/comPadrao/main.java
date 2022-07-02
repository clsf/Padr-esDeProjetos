package Mediator.comPadrao;

import java.text.ParseException;

	public class main {
		public static void main(String[] args) throws ParseException {
			mediatorConcret mediator  = new mediatorConcret();
			ButtonAdc btAdc = new ButtonAdc(mediator);
			ButtonRemove btRemove = new ButtonRemove(mediator);
			
			mediator.setBtAdc(btAdc);
			mediator.setBtRemove(btRemove);
			
			btAdc.clickBt();
			btRemove.clickBt();		
			
			
		}
}
