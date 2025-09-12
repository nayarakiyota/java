package atividadevariaveisoperadores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número 1: ");
		float n1 = leia.nextFloat();	
		
		System.out.println("Digite o número 2: ");
		float n2 = leia.nextFloat();	
		
		System.out.println("Digite o número 3: ");
		float n3 = leia.nextFloat();	
		
		System.out.println("Digite o número 4: ");
		float n4 = leia.nextFloat();	
		
		System.out.printf("Diferença: %.1f \n" , (n1 * n2) - (n3 * n4));
		
		leia.close();
		
	}

}
