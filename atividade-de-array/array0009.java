import java.util.Scanner;

public class array0009{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int i3 = 0;
		int A1[] = new int[30];
		int A2[] = new int[30];
		int A3[] = new int[30];
		
		for(int i = 0;i<A1.length;i++) {
			System.out.println("Digite um número para o primeiro array: ");
			A1[i] = teclado.nextInt();
		}
		for(int i = 0;i<A2.length;i++) {
			System.out.println("Digite um número para o segundo array: ");
			A2[i] = teclado.nextInt();
		}
		teclado.close();
		for(int i = 0;i<A1.length;i++) {
			for(int a = 0;a<A2.length;a++) {
				if(A1[i] == A2[a]) {
					A3[i3++]=A1[i];
					break;
				}
			}
		}
		
		for(int i = 0;i<A3.length;i++) {
			System.out.println(A3[i]);
		}
		
		
		
		
		
		
		
		
	}
}