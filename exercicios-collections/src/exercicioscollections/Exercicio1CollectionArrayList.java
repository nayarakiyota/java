package exercicioscollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1CollectionArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		String cor; 
		
		//entrada de dados
		for(int indice = 1; indice <= 5; indice ++) {
			System.out.println("Digita a cor " + indice + ": ");
			cor = leia.nextLine();
			cores.add(cor);
			
		}
		
		//listar todas as cores
		System.out.println("Listar todas as cores: " + cores);
		
		//ordenar as cores
		Collections.sort(cores);
		System.out.println("Ordenar as cores: " + cores);
		
		leia.close();

	}

}
