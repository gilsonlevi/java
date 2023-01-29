import java.util.Scanner;

public class funcoes06 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um texto");
		String txt = teclado.nextLine();
		int resultado = contarPalavras(txt);
		System.out.println(resultado);
		teclado.close();
	}
	
	public static int contarPalavras(String txt){
		
		int contador = 0;
		
         txt = txt.trim();
         while (txt.contains("  ")) {
           	txt = txt.replace("  "," ");
           }
         
         for(int i = 0;i<txt.length();i++) {
        	  char letra = txt.charAt(i);
        	 if(letra == ' ') {
        		 contador++;
        	 }		  
        		  }
         return contador+1;
	}
	
}
