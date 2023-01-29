import java.util.Scanner;

public class funcoes01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String a = teclado.nextLine();
		System.out.println("Digite uma palavra: ");
		String b = teclado.nextLine();
		System.out.println("Digite uma palavra: ");
		String c = teclado.nextLine();
		teclado.close();
		String result = concatenar(a, b, c);
		System.out.println(result);
		
	}
	
	public static String concatenar(String txtUm,String txtDois,String txtTres) {
		String texto = txtUm + " " + txtDois + " " + txtTres;
		return texto;
	}

}
