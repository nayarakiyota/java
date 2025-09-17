import java.util.Scanner;

public class Exercicio1Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		//vetor com 10 numeros inteiros
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		
		//mostrar indices e valores do vetor
		System.out.println("       ");
		for (int indice = 0; indice <vetor.length; indice ++) {
			System.out.printf("%-4d", indice);
		}
		
		System.out.println("Vetor");
		for (int valor : vetor) {
			System.out.printf("%-4d", valor);
		}

		//entrada de dados
		System.out.println("\nDigite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		//retorno invalido
		boolean encontrado = false;
		
		//pesquisa no vetor
		for (int indice = 0; indice < vetor.length; indice ++) {
			if (vetor[indice] == numero) {
				System.out.println("O número " + numero + " está localizado na posição: " + indice);
				encontrado = true;
				break; //parar o laço de repetição
			}
		}
		
		//numero não encontrado
		if (!encontrado) {
			System.out.println("O número " + numero + " não foi encontrado");
		}
		
		leia.close();
		
	}

}
