package Mediator.semPadrao;

import java.text.ParseException;


public class Main {
	public static void main(String[] args) throws ParseException {
		System.out.println("Sem Padrão:");
		BotaoAdc btadc = new BotaoAdc();
		BotaoRemover btRemover = new BotaoRemover();
		
		btadc.setBtRemover(btRemover);
		btRemover.setBtAdc(btadc);
		
		btadc.clickBt();
		btRemover.clickBt();

		
	}
	
}