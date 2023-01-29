import java.util.Scanner;

public class funcoes04 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um texto");
		String a = teclado.nextLine();
		teclado.close();
		int resultado = TodasVogais(a);
		
		System.out.println(resultado);
		
		
	}
	
	public static int  TodasVogais(String txt) {
		char[] vogais = {'a','e','i','o','u'};
		
		int contVogais = 0;
			for(int i = 0;i<txt.length();i++) {
			char letra = txt.charAt(i);
				for(int j = 0;j<vogais.length;j++) {
					if(vogais[j] == letra) {
						contVogais++;
						break;
						
					}
			}
		}
			
			return contVogais;
	}
}
