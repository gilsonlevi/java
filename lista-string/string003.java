import java.util.Scanner;

public class string003 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char[] vogais = {'a','e','i','o','u'};
		
		System.out.println("Digite um texto: ");
		String texto = teclado.nextLine().toLowerCase();
		teclado.close();
		
		int contVogais = 0;
		for(int i = 0;i<texto.length();i++) {
			char letra = texto.charAt(i);
				for( int j = 0;j<vogais.length;j++) {
					if(letra == vogais[j]) {
						contVogais++;
						break;
					}
				}
			
		}

		System.out.println("A quantidade de vogais no texto " + texto + " é igual a " + contVogais);
	}

}
