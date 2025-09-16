import java.util.Scanner;

public class Exercicio6DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, contadorM3 = 0;
		float media, numeroM3 = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0 && numero != 0) {
				numeroM3 += numero; //para somar só os numero multiplos de 3
				contadorM3 ++;
			}
		}while(numero != 0); //para repetir até digitar o zero
		
		if(contadorM3 > 0) {
			media = numeroM3 / contadorM3;
			System.out.printf("A média de todos os números múltiplos de 3 é: %.1f%n", media);
		}else {
			System.out.println("Nenhum múltiplo de 3 foi digitado.");
		}
		
				
		leia.close();

	}

}
