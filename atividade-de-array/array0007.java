import java.util.Scanner;

public class array0007 {

	public static void main(String[] args) {
	int A1[] = new int[10];
	int A2[] = new int[10];
	int A3[] = new int[10];
	Scanner teclado = new Scanner(System.in);
	
	
	for(int i = 0;i<A1.length;i++) {
		System.out.println("Digite um número para o primeiro array: ");
		A1[i] = teclado.nextInt();
	}
	
	for(int i = 0;i<A2.length;i++) {
		System.out.println("Digite um número para o segundo array: ");
		A2[i] = teclado.nextInt();	
	}
	teclado.close();
	
	for(int i = 0;i<A3.length;i++) {
	A3[i] = A1[i]*A2[i]	;
	}
	
	for(int i = 0;i<A3.length;i++) {
		System.out.print(A3[i] + " ");
	}
	
	
	
	}
}
