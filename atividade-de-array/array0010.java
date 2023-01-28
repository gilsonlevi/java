import java.util.Scanner;

public class array0010 {
	public static void main(String[] args) {
		int ia = 0;
		int i= 0;
		int A1[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		for(;i<A1.length;i++) {
			System.out.println("Digite um número: ");
			A1[i] = teclado.nextInt();		
			}
		teclado.close();
		for(int a = 0;a<A1.length;a++) {
			System.out.println(A1[a]);
		}

		
		int menor = 0;
		for(int a = 0 ;a<A1.length;a++) {
			if(A1[a]<menor) {
				menor = A1[a];
				A1[ia++] = menor;
			}

		}

		
		
		
		
		
		
	
	}
}
