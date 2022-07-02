package Mediator.semPadrao;

import java.text.ParseException;


public class main {
	public static void main(String[] args) throws ParseException {
		BotaoAdc btadc = new BotaoAdc();
		BotaoRemover btRemover = new BotaoRemover();
		
		btadc.setBtRemover(btRemover);
		btRemover.setBtAdc(btadc);
		
		btadc.clickBt();
		btRemover.clickBt();

		
	}
	
}