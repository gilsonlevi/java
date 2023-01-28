import java.util.Scanner;

public class string007 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String texto = teclado.nextLine();
		teclado.close();
		texto = texto.trim();
	      while (texto.contains("  ")) {
	      	texto = texto.replace("  "," ");
	      }
		
		System.out.print(texto);
		
		
	      
		


		
		
		
	}
}
