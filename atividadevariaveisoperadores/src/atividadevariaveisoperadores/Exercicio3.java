package atividadevariaveisoperadores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salário Bruto: ");
		float salariobruto = leia.nextFloat();	
		
		System.out.println("Digite o Adicional Noturno: ");
		float adicionalnoturno = leia.nextFloat();	
		
		System.out.println("Digite as Horas Extras: ");
		float horasextras = leia.nextFloat();	
		
		System.out.println("Digite os Descontos: ");
		float descontos = leia.nextFloat();	
		
		System.out.printf("Salário Líquido: %.2f \n" , salariobruto + adicionalnoturno + (horasextras * 5) - descontos);
			
		leia.close();
				
	}

}
