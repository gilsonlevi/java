import java.util.Scanner;

public class funcoes10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um login: ");
		String login = teclado.nextLine();
		System.out.println("Digite uma senha: ");
		String senha = teclado.nextLine();
		teclado.close();
		boolean resultado = autenticar(login, senha);

		System.out.println(resultado);

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

	public static boolean autenticar(String umLogin, String umaSenha) {

		String senhaDesincriptada = Desencripitador(umaSenha);
		return umLogin.equals(senhaDesincriptada);

	}

}