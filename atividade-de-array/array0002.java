import java.util.Scanner;

public class array0002 {

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
		for( i = num.length -1;i>=0;i--) {
			System.out.println(num[i]);
		}
		
	
	
	
	
	
	}

}
