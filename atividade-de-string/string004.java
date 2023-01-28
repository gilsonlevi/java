import java.util.Scanner;

public class string004 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um texto: ");
		String texto = teclado.nextLine().toLowerCase();
		
		teclado.close();
		
		String textoInvertido = "";
		for(int i = texto.length()-1;i>=0;i--) {
			textoInvertido += texto.charAt(i);
		}
		
		System.out.print("O texto invertido é: " + textoInvertido);
		
		
		
	}
}
