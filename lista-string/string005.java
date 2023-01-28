import java.util.Scanner;
  public class string005 {
  	public static void main(String[] args) {
  		int contador = 0;
  		
  		Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String text = teclado.nextLine();
         teclado.close();
      
         text = text.trim();
         while (text.contains("  ")) {
           	text = text.replace("  "," ");
           }
         
         
         
         for(int i = 0;i<text.length();i++) {
        	  char letra = text.charAt(i);
        	 if(letra == ' ') {
        		 contador++;
        	 }
        			  
        		  }
        	  
  	
  	System.out.println(contador + 1);
  			}
        		  
    }
      
     
  