import java.util.Scanner;

public class array0001 {

	public static void main(String[] args) {
		int i = 0;
		int a = 0;
		int num[] = new int[10];
		Scanner teclado = new Scanner(System.in);
	
		do {
			System.out.println("Digite um número ");
			num[i] = teclado.nextInt();			
			i++;
		}while(i<num.length);
		teclado.close();
		do {
			System.out.println(num[a]);
			a++;
		}while(a<num.length);
		
		
		
		

	}

}
