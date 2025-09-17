package vetores;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeros[][] = {
				{1, 2, 3},
				{4, 5 ,6},
				{7, 8, 9}
		};
		
		float numerosReais[][] = new float [3][2];
		
		System.out.println("Listar os dados - Matriz Números");
		
		//percorre as linhas
		for(int linha = 0; linha < numeros.length; linha ++) {
			//percorre as colunas
			for(int coluna = 0; coluna < numeros.length; coluna ++) {
				System.out.printf("numeros[%d][%d] = %d%n", linha, coluna, numeros[linha][coluna]);
			}
		}
		
		System.out.println("\nInput de dados - Matriz Números Reais");
		
		System.out.println("Tamanho da Matriz Números Reais: " + numerosReais.length);
		System.out.println("Tamanho da Matriz Números Reais[0]: " + numerosReais[0].length);
		
		for(int linha = 0; linha < numerosReais.length; linha ++) {
			
			for(int coluna = 0; coluna < numerosReais[linha].length; coluna ++) {
				System.out.println("Digite um número: ");
				numerosReais[linha][coluna] = leia.nextFloat();
			}
		}
		
		System.out.println("\nListar os dados - Matriz Números Reais");
		
		for(int linha = 0; linha < numerosReais.length; linha ++) {
			
			for(int coluna = 0; coluna < numerosReais[linha].length; coluna ++) {
				System.out.printf("numerosReais[%d][%d] = %.2f%n", linha, coluna, numerosReais[linha][coluna]);
			}
		}

		leia.close();

	}

}
