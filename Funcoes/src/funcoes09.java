import java.util.Scanner;

public class funcoes09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String txt = teclado.nextLine();
		String resultado = Desencripitador(txt);
		teclado.close();
		System.out.println(resultado);
	}

	public static String encripitador(String txt) {
		char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
		int[] num = { 1, 2, 3, 4, 5 };

		txt = txt.trim();
		while (txt.contains("  ")) {
			txt = txt.replace("  ", " ");
		}
		String txtEncriptado = "";
		for (int i = 0; i < txt.length(); i++) {
			char letra = txt.charAt(i);
			boolean trocar = false;
			for (int v = 0; v < vogais.length; v++) {
				char vogal = vogais[v];
				if (vogal == letra) {
					txtEncriptado += num[v];
					trocar = true;
				}
			}
			if (!trocar) {
				txtEncriptado += letra;
			}

		}
		return txtEncriptado;
	}

	public static String Desencripitador(String txt) {
		char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
		int[] num = { 1, 2, 3, 4, 5 };

		txt = txt.trim();
		while (txt.contains("  ")) {
			txt = txt.replace("  ", " ");
		}
		String a = "";
		for (int i = 0; i < txt.length(); i++) {
			char letra = txt.charAt(i);
			boolean trocar = false;
			for (int n = 0; n < num.length; n++) {
				if (num[n] == letra) {
					a += vogais[n];
					trocar = true;

				}
			}

			if (!trocar) {
				a += letra;
			}

		}

		return a;
	}
}
