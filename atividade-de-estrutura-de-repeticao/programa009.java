import java.util.Scanner;

public class programa009 {
	public static void main(String[] args) {
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos n�meros voc� quer somar: ");
		int quant_num = teclado.nextInt();
		
		for(int i = 1 ;i <= quant_num ;i++ ) {
			System.out.println("Digite um n�mero: ");
			int num = teclado.nextInt();
			
			soma +=num;
		}
			
		
			System.out.println(soma);
			
		
	
	}
}
