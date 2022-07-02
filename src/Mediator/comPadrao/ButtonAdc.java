package Mediator.comPadrao;

public class ButtonAdc extends Botao {


	public ButtonAdc(mediatorConcret mediator) {
		super(mediator);
	}	
	
	public void onBtAdc() {
		mediator.notificacao(this);
	}

	public void clickBt() {
		System.out.println("Bot�o adicionar clicado!");
		onBtAdc();
		
	}
	
	public void ativarBt() {
		System.out.println("Bot�o adicionar ativo!");
	}
	
	

}
