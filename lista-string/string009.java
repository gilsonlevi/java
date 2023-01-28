import java.util.Scanner;

public class string009 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um data[no formato dd/mm/aaaa]: ");
		String texto = teclado.next();
		teclado.close();
		
		String[] meses = {"Janeiro","Fevereiro,Março,Abril,Maio,Junho,Julho,Agosto,Setembro,Outubro,Novembro,Dezembro"};
		String[] partes = texto.split("/");
		int parte = Integer.parseInt(partes[1]) -1;
		String resultado = partes[0] + " de " +meses[parte]  + " de " + partes[2];
		

	}

}
