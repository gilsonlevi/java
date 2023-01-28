import java.util.Scanner;

public class array0008 {

	public static void main(String[] args) {
		int num[] = new int[20];
		Scanner teclado = new Scanner(System.in);
		
		for(int i = 0;i<num.length;i++) {
			System.out.println("Digite um número: ");
			num[i] = teclado.nextInt();
		}
		teclado.close();
		for(int i = 0;i<num.length/2;i++) {
			int aux = num[i];
			num[i] = num[num.length-1-i];
			num[num.length-1-i] = aux;
		}
		
		for(int i = 0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		
		

	}

}
