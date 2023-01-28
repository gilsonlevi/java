import java.util.Scanner;

public class programa010 {

	public static void main(String[] args) {
		int i = 1;
		int soma= 0;
		int media = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos números você quer digitar: ");
		int quant_num = teclado.nextInt();
		teclado.close();
		while(i<=quant_num) {
			System.out.println("Digite um número: ");
			i++;
			int num = teclado.nextInt();
		
			soma += num;
			media = (soma/quant_num);
		

		}
	
		
		System.out.println("Foram digitados " + quant_num);
		
		
		}
	
		
		
	}

