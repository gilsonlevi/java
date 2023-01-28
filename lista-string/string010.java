import java.util.Scanner;

public class string010 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String texto = teclado.nextLine();
		teclado.close();
		
		texto = texto.trim();
		while(texto.contains("  ")) {
			texto = texto.replace("  ", " ");
		}
		
		String text = " ";
		for(int i = 1;i<texto.length();i++) {
			if(i%2==0) {
				text += String.valueOf(texto.charAt(i)).toUpperCase();
			}else
				text += (new String("" + texto.charAt(i))).toLowerCase();
		}
		
		System.out.println(text);
		
		
		
		
	}

}
