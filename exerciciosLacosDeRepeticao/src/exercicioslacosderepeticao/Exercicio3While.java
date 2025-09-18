package exercicioslacosderepeticao;
import java.util.Scanner;

public class Exercicio3While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, idadem21 = 0, idadeM50 = 0;
		        
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >=0) {
			
		if (idade < 21) {
			idadem21 ++;
		}
		
		if(idade > 50) {
			idadeM50 ++;
		}
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + idadem21);
		System.out.println("Total de pessoas maiores de 50 anos: " + idadeM50);
		        
		 leia.close();

	}

}
