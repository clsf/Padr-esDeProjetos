package Observer.semPadrao;

import java.util.Scanner;

public class Main {
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		TempoDeEstudo tempo = new TempoDeEstudo(); 
		int minutos; 
		
		System.out.println("Digite a quanto tempo voc� est� estudando em minutos: ");
		
		minutos = entrada.nextInt(); 
		
		entrada.nextLine(); 
		
		tempo.setTempo(minutos); 
		
		if(tempo.getTempo() >= 60) {
			
			System.out.println("Voc� est� a mais de 1 hora estudando, "
					+ "\n recomendo que d� uma pausa");
		}
	}
	
	
}
