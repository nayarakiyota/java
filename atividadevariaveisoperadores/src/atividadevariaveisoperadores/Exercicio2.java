package atividadevariaveisoperadores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a Nota 1: ");
		float nota1 = leia.nextFloat();	
		
		System.out.println("Digite a Nota 2: ");
		float nota2 = leia.nextFloat();	
		
		System.out.println("Digite a Nota 3: ");
		float nota3 = leia.nextFloat();	
		
		System.out.println("Digite a Nota 4: ");
		float nota4 = leia.nextFloat();	
		
		System.out.printf("Média final: %.1f \n" , (nota1 + nota2 + nota3 + nota4) / 4);
			
		leia.close();

	}

}
