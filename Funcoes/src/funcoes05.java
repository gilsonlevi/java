import java.util.Scanner;

public class funcoes05 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um texto");
		String a = teclado.nextLine().toLowerCase();
		teclado.close();
		int resultado = TodasVogais(a);
		
		System.out.println(resultado);
		
		
	}
	
	public static int  TodasVogais(String txt) {
		char[] vogais = {'a','e','i','o','u'};
		
		int contVogais = 0;
		for (int i = 0; i < vogais.length; i++) {
            char vogal = vogais[i];
            int indice = txt.indexOf(vogal);
            if (indice >= 0) {
                 contVogais++;
            }
          }
		
			
			return contVogais;
	}
}
