package Mediator.comPadrao;

public class Botao {
	public Mediator mediator;

	public Botao(mediatorConcret mediator) {
		super();
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(mediatorConcret mediator) {
		this.mediator = mediator;
	}	
	
}


