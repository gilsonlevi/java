import java.util.Scanner;

public class string008 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String texto = teclado.nextLine();
		teclado.close();
		
		texto = texto.trim();
		while(texto.contains("  ")) {
			texto = texto.replace("  ", " ");}
		
		String[] partes = texto.split(" ");
		
		 String result = "";
	        for (int i = 0; i < partes.length; i++) {
	        String palavra = partes[i];
	        for (int l = palavra.length()- 1;l >= 0; l--) {
	             result += palavra.charAt(l);
	        }
	        result += " "; 
	        }     
	        System.out.println(result);
	        
	     }
	}


