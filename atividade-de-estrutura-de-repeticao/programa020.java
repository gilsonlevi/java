import java.util.Scanner;

public class programa020 {

	public static void main(String[] args) {
		int doze = 0;
		int totaldoze = 0;
		int totaltotaldoze = 0;
		
		int totaltotaldez = 0;
		int totaldez = 0;
		int dez = 0;
		int totall = 0;
		int avista = 0;
		int aavista = 0;
		
		int total = 0;
		int produto = 0;
		
		int i= 1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantos produtos ser�o passados: ");
		int quant_int = teclado.nextInt();
		
		while(i<=quant_int) {
			System.out.println("Qual o valor do produto: ");
			produto = teclado.nextInt();
			i++;
			total += produto;
		
			avista = (total/20);
			aavista = (total + avista);
			
		}
		
		
		System.out.println("O valor total � " + total);
		
		int pag = 0;
		do {
			System.out.println("Como ser� a forma de pagamento: ");
			System.out.println("[1] A VISTA");
			System.out.println("[2] PARCELADO");
			pag = teclado.nextInt();
		} while (pag != 1 && pag != 2);
		
		
		
		if(pag == 1 ) {
			System.out.println("O valor a ser pago � " + aavista);
		}else if(pag == 2) {	
			
		int parcelas = 0;
		do {
			System.out.println("Quantas vezes voc� quer dividir");
			System.out.println("[1] 10x");
			System.out.println("[2] 12x");
			parcelas = teclado.nextInt();
		} while(parcelas !=1 && parcelas !=2);
			
			if(parcelas==1) {
				
			dez = total/100;
			totaldez = total/10;
			totaltotaldez = totaldez + dez;
			}else if (parcelas==2) {
				
			doze = total/100;
			totaldoze = total/12;
			totaltotaldoze = totaldoze + doze;
			}
		
			if(parcelas==1) {
				System.out.println("S�o dez parcelas de " + totaltotaldez);
		}else if(parcelas==2) {
			System.out.println("S�o doze parcelas de " + totaltotaldoze);
		}
			
		
		
		}
	
		
	
	}
		
}


