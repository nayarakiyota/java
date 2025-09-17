import java.util.Scanner;

public class Exercicio2Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
						
		int numeros[] = new int[10];
		int soma = 0;
		double media;
		
		System.out.println("\nInput de dados - Vetor de números");
		
		//entrada de dados
		for(int indice = 0; indice < numeros.length; indice ++) {
			System.out.println("Digite o número da posição " + indice + ": ");
			numeros[indice] = leia.nextInt();
		}
		
		//numeros no indice impar
		System.out.printf("\nElementos nos índices ímpares: ");
		
		for(int indice = 1; indice < numeros.length; indice += 2) {
			System.out.printf(" " + numeros[indice]);
		}
		
		//numero pares
		System.out.printf("\nElementos pares: ");
		for (int indice = 0; indice < numeros.length; indice ++) {
			if (numeros[indice] % 2 == 0) {
				System.out.printf(" " + numeros[indice]);
			}
		}
		
		//soma de todos os numeros
		for (int valor : numeros) {
			soma += valor;
		}
		
		//media
		media = (double) soma / numeros.length;
		
		System.out.println("\nSoma: " + soma);
        System.out.printf("Média: %.2f\n", media);
		
	
		leia.close();

	}

}
