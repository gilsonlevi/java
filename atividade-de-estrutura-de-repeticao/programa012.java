import java.util.Scanner;

public class programa012 {

	public static void main(String[] args) {
		int divisores = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int num= teclado.nextInt();						
			for(int i = 1;i<=num;i++) {
				if(num % i ==0) {
					divisores++;
				}
			
			
			
			}

			if(divisores >2) {
				System.out.println("O n�emro" + num + " � par!!");
			}else
				System.out.println("O n�mero" + num + " � primo");
		
}	
		
	}
