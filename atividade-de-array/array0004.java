import java.util.Scanner;

public class array0004 {

	public static void main(String[] args) {
		
		int i = 0;
		int a = 0;
		int num[] = new int[10];
		Scanner teclado = new Scanner(System.in);

		// Notas
		do {
			System.out.println("Digite a nota do aluno:  ");
			num[i] = teclado.nextInt();
			i++;
		} while (i < num.length);

		teclado.close();
		
		// Media
		int mediaa = 0;
		int media = 0;
		do {
			media += num[a];
			a++;
		} while (a < num.length);

		mediaa = (media / num.length);

		
		int acima_media = 0;
		for(;i<num.length;i++) {
			if(num[i]>60) {
				acima_media++;
			}
		}
		
		
		
		
		
		System.out.println("A quantidade de alunos que tiveram a nota acima da media é " + acima_media);

		System.out.println("A media da turma é " + mediaa);

	}

}