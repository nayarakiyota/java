package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(5);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(5);
		
		System.out.println(numeros);
		
		System.out.println("Exibir o elemento na posição 2: " + numeros.get(2));
		
		System.out.println("Exibir o indice do elemento 10: " + numeros.indexOf(10));
		
		numeros.set(numeros.indexOf(10), 4); //para alterar o numero 10 pelo 4
		
		System.out.println(numeros);
		
		System.out.println("Exibir o indice do elemento 10: " + numeros.indexOf(10));
		
		numeros.remove(numeros.indexOf(5));
		
		System.out.println(numeros);
		
		// for(int indice = 0; indice < numero.size; indice++ ) {}
		// for each - a linha 35 substitui a linha 33
		for(int numero : numeros) {// só funciona se quiser trabalhar com um valor especifico
			System.out.println(numero);
		}
		
		System.out.println("Tamanho da lista: " + numeros.size());
		
		System.out.println("A lista está vazia? " + numeros.isEmpty());
		
		System.out.println("O número 8 está na lista? " + numeros.contains(8));
		
		// limpa a lista
		numeros.clear();
		
		System.out.println("A lista está vazia? " + numeros.isEmpty());

	}

}
