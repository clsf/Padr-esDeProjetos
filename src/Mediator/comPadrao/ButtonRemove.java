package Mediator.comPadrao;

public class ButtonRemove extends Botao {


	public ButtonRemove(mediatorConcret mediator) {
		super(mediator);
		
	}
	
	public void onBtRemove() {
		mediator.notificacao(this);
	}
	
	public void ativarBt() {
		System.out.println("Bot�o remove ativo");
	}
	
	public void clickBt() {
		System.out.println("Bot�o remove clicado!");
		onBtRemove();
	}

}

