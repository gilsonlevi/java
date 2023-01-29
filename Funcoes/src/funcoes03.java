import java.util.Scanner;

public class funcoes03 {
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String txt = teclado.nextLine();
		String resultado = inverterTexto(txt);
		teclado.close();
		boolean palindromo = ehPalindromo(resultado);
		if(palindromo == false) {
			System.out.println("Nâo é palindromo!!");
		}else
			System.out.println("É palindromo!!");
		
		
		
	}
	
	
	public static String inverterTexto(String txt) {
		String textoInvertido = "";
		for(int i = txt.length()-1;i>=0;i--) {
			textoInvertido += txt.charAt(i);
		}	
		return textoInvertido;
	}
	
	
	public static boolean ehPalindromo(String umaString) {
		String textoInvertido = inverterTexto(umaString);
		return umaString.equals(textoInvertido); 
	}
	
	
	
	
	
	
}
