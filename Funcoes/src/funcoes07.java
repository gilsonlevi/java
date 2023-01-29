import java.util.Arrays;
import java.util.Scanner;

public class funcoes07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [] array = new int [10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		System.out.println("O array tem 10 posições, quanto você quer aumentar: ");
		int a =  teclado.nextInt();
		teclado.close();
		System.out.println("Antes: " + array.length);
		System.out.println(Arrays.toString(array));
		array = ampliarArray(array, a);
		System.out.println("Depois: " + array.length);
		System.out.println(Arrays.toString(array));
	}
	
	public static int[]  ampliarArray(int[] umArray, int fator) {
		int novoTamanho = umArray.length + fator;
		int [] array = new int[novoTamanho];
		for (int i = 0; i < umArray.length; i++) {
			array[i] = umArray[i];
		}
		return array;
	
	}

}

