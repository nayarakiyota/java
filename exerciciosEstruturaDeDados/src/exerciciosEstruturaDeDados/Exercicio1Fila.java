package exerciciosEstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1Fila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		int opcao; 
		
		String nome = "";
				
		do {
		
		System.out.println("***********************************");
		System.out.println("                                   ");
		System.out.println("   1 - Adicionar Cliente na Fila   ");
		System.out.println("   2 - Listar todos os Clientes    ");
		System.out.println("   3 - Retirar Cliente da Fila     ");
		System.out.println("   0 - Sair                        ");
		System.out.println("                                   ");
		System.out.println("***********************************");
		System.out.println("Entre com a opção desejada: ");
		opcao = leia.nextInt();
		leia.nextLine();
		
		switch(opcao) {
		case 1: 
			System.out.println("Digite o nome: ");
			nome = leia.nextLine();
			fila.add(nome);
			System.out.println("Fila:");
			System.out.println(fila);
			System.out.println("Cliente Adicionado!");
			break;
			
		case 2: 
			System.out.println("Lista de Clientes na Fila: " + fila);
			break;
			
		case 3: 
			if (fila.isEmpty()) {
			    System.out.println("A fila está vazia!");
			}else{
			    fila.poll();
			    System.out.println("Fila:");
			    System.out.println(fila);
			    System.out.println("O cliente foi chamado!");
			}
			break;
			
		case 0: 
			System.out.println("Programa Finalizado!");
					
		}
		
		} while (opcao != 0);
		
		leia.close();		
		
	}

}
