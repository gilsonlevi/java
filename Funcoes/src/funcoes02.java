import java.util.Scanner;

public class funcoes02 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String txt = teclado.nextLine();
		teclado.close();
		String texto = inverterTexto(txt);
		System.out.println(texto);
		
	}
	public static String inverterTexto(String txt) {
		
		
		String textoInvertido = "";
		for(int i = txt.length()-1;i>=0;i--) {
			textoInvertido += txt.charAt(i);
		}	
		
		
		
		return textoInvertido;
	
	}
}
