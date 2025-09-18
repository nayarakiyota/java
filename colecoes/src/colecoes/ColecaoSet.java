package colecoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Banana");
		frutas.add("Maçã");
		frutas.add("Laranja");
		frutas.add("Abacate");
		frutas.add("Banana");
		frutas.add("banana");
		
		System.out.println(frutas);
		
		for(String fruta : frutas) {
			System.out.println(fruta.hashCode());//para imprimir o codigo do objeto
		}
		
		frutas.remove("Abacate");
		
		System.out.println(frutas);
		
		System.out.println("A frutas Amora está presente no set? " + frutas.contains("Amora"));
		
		System.out.println("O set está vazio? " + frutas.isEmpty());
		
		Iterator<String> itFrutas = frutas.iterator();
		
		while(itFrutas.hasNext()) {
			System.out.println(itFrutas.next());
			
		}
		
		//cria um arrayList
		ArrayList<String> frutasList = new ArrayList<String>();
		
		//adicionar todos os elementos da coleção set no arraylist
		frutasList.addAll(frutas);
		
		//ordenação dos dados em ordem crescente
		frutasList.sort(null);
		
		//lista os dados do arraylist
		System.out.println(frutasList);
		
		//ordenação dos dados em ordem decrescente
		frutasList.sort(Comparator.reverseOrder());
		
		System.out.println(frutasList);
		

	}

}
