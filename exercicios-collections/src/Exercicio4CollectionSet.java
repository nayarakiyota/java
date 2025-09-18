import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4CollectionSet {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		int valor;
		
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
			System.out.println("O número " + valor + " foi encontrado!");
		}else{
			System.out.println("O número " + valor + " não foi encontrado!");
		}
		
		leia.close();

	}

}
