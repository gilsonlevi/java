import java.util.Scanner;

public class array0006 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int A1[] = new int[10];
		int A2[] = new int[10];

		for (int i = 0; i < A1.length; i++) {
			System.out.println("Digite um número: ");
			A1[i] = teclado.nextInt();
		}
		teclado.close();
		for (int i = 0; i < A2.length; i++) {

			A2[i] = A1[i] * A1[i];
		}

		System.out.println("Os valores do array A1 são ");
		for (int i = 0; i < A1.length; i++) {
			if(i == A1.length -1) {
				System.out.println(A1[i] + " ");
			}else System.out.print(A1[i] + " ");
			
		}
		System.out.println("Os valores do array A2 são ");
		for (int i = 0; i < A1.length; i++) {
			System.out.print(A2[i] + " ");
		}

	}

}
