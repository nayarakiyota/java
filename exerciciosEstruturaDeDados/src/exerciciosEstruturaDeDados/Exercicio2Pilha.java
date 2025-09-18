package exerciciosEstruturaDeDados;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exercicio2Pilha {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		int opcao;
		String livro = "";
					
		do {
		System.out.println("***********************************");
		System.out.println("                                   ");
		System.out.println("   1 - Adicionar Livro na pilha    ");
		System.out.println("   2 - Listar todos os Livros      ");
		System.out.println("   3 - Retirar Livro da pilha      ");
		System.out.println("   0 - Sair                        ");
		System.out.println("                                   ");
		System.out.println("***********************************");
		System.out.println("Entre com a opção desejada: ");
		opcao = leia.nextInt();
		leia.nextLine();
		
		switch(opcao) {
		case 1: 
			System.out.println("Digite o nome: ");
			livro = leia.nextLine();
			pilha.push(livro);
			System.out.println("Pilha:");
			System.out.println(pilha);
			System.out.println("Livro Adicionado!");
			break;
			
		case 2: 
			System.out.println("Lista de Livros na pilha: " + pilha);
			break;
			
		case 3: 
			if (pilha.isEmpty()) {
			    System.out.println("A pilha está vazia!");
			}else{
				pilha.pop();
				System.out.println("Pilha:");
			    System.out.println(pilha);
			    System.out.println("Um livro foi retirado da pilha!");
			}
			break;
			
		case 0: 
			System.out.println("Programa Finalizado!");
					
		}
		
		} while (opcao != 0);
		
		leia.close();		

	}

}
