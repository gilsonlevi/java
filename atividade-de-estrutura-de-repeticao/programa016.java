import java.util.Scanner;

public class programa016 {

	public static void main(String[] args) {
		int potencia;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a base: ");
		int a = teclado.nextInt();
		System.out.print("Digite o expoente: ");
		int n = teclado.nextInt();
		teclado.close();
		int produto = 1;
		
		for (int i = 1; i <= n; i++){
			produto *= a;
		}
		System.out.println(produto);
		
		
		
		
		

	}

}
