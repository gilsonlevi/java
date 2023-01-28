import java.util.Scanner;

public class programa019 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos clientes há na mesa: ");
		int quant_clientes = teclado.nextInt();
		
		int total_total_total = 0;
		int total_total = 0;
		int total = 0;
		int peso_total = 0;
		int valor_beb = 0;
		int i = 0;
		while(i<quant_clientes) {
			System.out.println("Peso do prato: ");
			int peso_p = teclado.nextInt();
			
			System.out.println("Valor da bebida: ");
			int valor_b = teclado.nextInt();
			i++;
		
			peso_total += peso_p;
			 
			total= peso_total/1000;
			
			total_total = total*20;
			
			
			
			valor_beb += valor_b;
			
			total_total_total = valor_beb + total_total;
		
		}
		
		System.out.println("O valor total da comida é " + total_total + " e o valor total da bebida é " + valor_beb);
		
		System.out.println("O valor total da conta é " + total_total_total);	
		
	}

}
