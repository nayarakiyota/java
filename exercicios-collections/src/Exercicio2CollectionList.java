import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2CollectionList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		int valor, posicao;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		valor = leia.nextInt();
		
		if(numeros.contains(valor)) {
			posicao = numeros.indexOf(valor);
			System.out.println("O número " + valor + " está localizado na posição: " + posicao);
		}else{
			System.out.println("O número " + valor + " não foi encontrado!");
		}
		
		leia.close();
		
	}

}
