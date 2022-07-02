package Mediator.semPadrao;

public class BotaoAdc {
	
	private BotaoRemover btRemover;	
	
	public BotaoAdc() {

	}

	public BotaoRemover getBtRemover() {
		return btRemover;
	}

	public void setBtRemover(BotaoRemover btRemover) {
		this.btRemover = btRemover;
	}

	private void acionarBtRemover() {
		btRemover.ativarbt();
	}
	
	public void clickBt() {		
		System.out.println("Botão adicionar clicado!");
		acionarBtRemover();
	}
	
	public void ativarBt() {
		System.out.println("Botão Adicionar ativado");
	}

}
