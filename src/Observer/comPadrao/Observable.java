package Observer.comPadrao;

public interface Observable {
	public void registrarObservador(Observer observador);
	public void removerObservador(Observer observador); 
	public void notificarObservadores();
}
