import java.util.Scanner;

public class string002 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char[] consoantes = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','x','w','y','z'};
		
		System.out.println("Digite um texto: ");
		String texto = teclado.nextLine().toLowerCase();
		teclado.close();
		
		int contConso = 0;
			for(int i = 0;i<texto.length();i++) {
			char letra = texto.charAt(i);
				for(int j = 0;j<consoantes.length;j++) {
					if(consoantes[j] == letra) {
						contConso++;
						break;
						
					}
			}
		}
		
		System.out.println("O número de consoantes no texto " + texto + " é igual a " + contConso);

	}

}
