package exercicioscollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3CollectionSet {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		int numero;
							
		for(int indice = 1; indice <= 10; indice ++) {
			System.out.println("Digite o " + indice + "º número: ");
			numero = leia.nextInt();
			numeros.add(numero);
		}

		System.out.println("Listar dados do Set: ");
		
		Iterator<Integer> inumero = numeros.iterator(); 
		while(inumero.hasNext()) {
			System.out.println(inumero.next());
		}
		
		leia.close();
	}

}
