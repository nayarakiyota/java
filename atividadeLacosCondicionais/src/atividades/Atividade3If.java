package atividades;
import java.util.Scanner;

public class Atividade3If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		boolean apto = false;
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? ");
		primeiraDoacao = leia.nextBoolean();
				
		if(idade >= 18 && idade <= 59) {
			apto = true;
		}else if(idade >= 60 && idade <= 69) {
			if (!primeiraDoacao) {
				apto = true;
			}
		}
		
		if(apto) {
			System.out.println("\n" + nome + " está apto(a) para doar sangue!");
		}else {
			System.out.println("\n" + nome + " não está apto para doar sangue!");
		}
		
							
		leia.close();

	}

}
