import java.util.Scanner;

public class string006 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String texto = teclado.nextLine();
	
		teclado.close();
		 String iniciais = "";
		
		texto = texto.trim();
	      while (texto.contains("  ")) {
	      	texto = texto.replace("  "," ");
	      }
	      
	     String[] partes = texto.split(" ");
	     
	     for(int i = 0;i<partes.length;i++) {
	    	 iniciais += partes[i].charAt(0);
	    	 
	     }
	      

	        System.out.println("As iniciais são: " + iniciais );  
	        
	   }
}

