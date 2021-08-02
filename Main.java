import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static int qtdGrilos;
	static int linhaDeChegada;
	
	public static void main(String[] args) {
		
		System.out.println("Quantidade de Grilos: ");
		qtdGrilos = scan.nextInt();
		
		System.out.println("Distância da Linha de Chegada: ");
		linhaDeChegada = scan.nextInt();
		
		for (int i=0; i<qtdGrilos; i++) {
			
		Grilo_Thread thread = new Grilo_Thread("Grilo_"+ i, linhaDeChegada);
		}
	}

}
