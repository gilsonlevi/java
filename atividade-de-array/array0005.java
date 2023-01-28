import java.util.Scanner;

public class array0005 {

	public static void main(String[] args) {
		int i = 0;
		int num[] = new int[10];
		Scanner teclado = new Scanner(System.in);
	
		do {
			System.out.println("Digite um número: ");
			num[i] = teclado.nextInt();			
			i++;
		}while(i<num.length);
		teclado.close();
		
		int maior = 0;
		int menor = num[0];
		for(int a = 0 ;a<num.length;a++) {
			if(num[a]>maior) {
				maior = num[a];
			}
			
			if(num[a]<menor) {
				menor = num[a];
			}
			
		}
		
		System.out.println("O maior número é " + maior);
		System.out.println("O menor número é " + menor);	
	}
}