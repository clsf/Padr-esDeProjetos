package Mediator.semPadrao;

import java.text.ParseException;


public class main {
	public static void Main(String[] args) throws ParseException {
		System.out.println("Sem Padrão:");
		BotaoAdc btadc = new BotaoAdc();
		BotaoRemover btRemover = new BotaoRemover();
		
		btadc.setBtRemover(btRemover);
		btRemover.setBtAdc(btadc);
		
		btadc.clickBt();
		btRemover.clickBt();

		
	}
	
}