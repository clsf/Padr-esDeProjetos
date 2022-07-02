package Mediator.comPadrao;

public class mediatorConcret implements Mediator{
	
	private ButtonAdc btAdc;
	private ButtonRemove btRemove;	

	public mediatorConcret() {
		
	}
	
	public void notificacao(Botao c) {
		if(c==btAdc) {
			btRemove.ativarBt();
		}
		if(c==btRemove) {
			btAdc.ativarBt();
		}
		
	}

	public ButtonAdc getBtAdc() {
		return btAdc;
	}

	public void setBtAdc(ButtonAdc btAdc) {
		this.btAdc = btAdc;
	}

	public ButtonRemove getBtRemove() {
		return btRemove;
	}

	public void setBtRemove(ButtonRemove btRemove) {
		this.btRemove = btRemove;
	}

}



