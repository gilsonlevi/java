import java.util.Scanner;

public class programa009 {
	public static void main(String[] args) {
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos números você quer somar: ");
		int quant_num = teclado.nextInt();
		
		for(int i = 1 ;i <= quant_num ;i++ ) {
			System.out.println("Digite um número: ");
			int num = teclado.nextInt();
			
			soma +=num;
		}
			
		
			System.out.println(soma);
			
		
	
	}
}
