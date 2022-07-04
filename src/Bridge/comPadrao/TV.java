package Bridge.comPadrao;

public class TV implements Dispositivo {
		private boolean on = false;
		
		
		@Override
		public boolean isEnabled() {
			return on;
		}
		
		@Override
		public void enable() {
			on = true;
		}
		
		@Override
		public void disable() {
			on = false;
		}
		
		@Override
		public void printStatus() {
			System.out.println("------------------------------------");
			System.out.println("TV");
			System.out.println(on ? "Ligada" : "Desligada");
			System.out.println("------------------------------------\n");
		}
		
}