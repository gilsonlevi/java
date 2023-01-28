import java.util.Scanner;

public class array0003 {

	public static void main(String[] args) {
		int i = 0;
		int num[] = new int[10];
		Scanner teclado = new Scanner(System.in);
	
		do {
			System.out.println("Digite um número ");
			num[i] = teclado.nextInt();			
			i++;
		}while(i<num.length);
		System.out.println("------------------------------");
		System.out.println("        Digite a posição      ");
		System.out.println("------------------------------");
		int posicao = teclado.nextInt();
		teclado.close();
		System.out.println(num[posicao-1]);
	
	
	
	
	
	}
}