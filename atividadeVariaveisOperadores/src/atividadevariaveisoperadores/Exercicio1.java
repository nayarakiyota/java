package atividadevariaveisoperadores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário: ");
		float salario = leia.nextFloat();		
		
		System.out.println("Digite o Abono: ");
		float abono = leia.nextFloat();	
		
		System.out.printf("Novo Salário: %.2f \n" , salario + abono);
		
		leia.close();
		
	}

}
