package Mediator.semPadrao;

public class BotaoRemover {
	
	private BotaoAdc btAdc;		
	
	public BotaoRemover() {

	}
	
	public BotaoAdc getBtAdc() {
		return btAdc;
	}
	
	public void setBtAdc(BotaoAdc btAdc) {
		this.btAdc = btAdc;
	}
	
	private void acionarBtAdc() {
		btAdc.ativarBt();
	}
	
	public void clickBt() {		
		System.out.println("Bot�o adicionar clicado!");
		acionarBtAdc();
	}

	public void ativarbt() {
		System.out.println("Bot�o remover ativado");
		
	}

}
