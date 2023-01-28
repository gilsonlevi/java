import java.util.Scanner;

public class programa011 {

	public static void main(String[] args) {
		int i = 1;
		int multi = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = teclado.nextInt();
		
		while(i<=10) {
			multi = num *i;
			System.out.println(num +  " x " + i +  " = " +  multi);
			i++;
		}
		
		
		
		

	}

}
