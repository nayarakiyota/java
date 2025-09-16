import java.util.Scanner;

public class Exercicio4While {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, genero = 0, pessoaDesenvolvedora = 0, backend = 0, frontend = 0, mobile = 0, fullstack = 0, totalRespostas = 0;
		
		double mediaIdades = 0, somaIdades = 0;
				
		String continua = "S";
		
		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Pesquisa Interna");
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			
			System.out.println("Digite sua identidade de gênero: ");
			genero = leia.nextInt();
			
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			
			System.out.println("Digite sua área de atuação: ");
			pessoaDesenvolvedora = leia.nextInt();
			
			//numero de desenvolvedores backend
			if (pessoaDesenvolvedora == 1) {
				 backend++;
			}
			
			//numero de mulheres cis e trans frontend
			if((genero == 1 || genero == 4) && pessoaDesenvolvedora == 2) {
				 frontend++;
			}
			
			//numero de homens cis e trans mobile maiores de 40 anos
			if((genero == 2 || genero == 5) && pessoaDesenvolvedora == 3 && idade > 40) {
				mobile ++;
			}
			
			//numero de não binarios fullstack menores 30 anos
			if(genero == 3 && pessoaDesenvolvedora == 4 && idade < 30) {
				fullstack ++;
			}
			
			somaIdades += idade;
			
			totalRespostas ++;
						
			System.out.println("Deseja continuar (S/N)");
			leia.skip("\\R");// ignora a outra linha
			continua = leia.nextLine().toUpperCase();//converte para letra maiuscula
			
		}
		
		mediaIdades = somaIdades / totalRespostas;
		
		System.out.printf("Total de pessoas desenvolvedoras Backend: %d%n", backend);
		System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d%n", frontend);
		System.out.printf("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d%n", mobile);
		System.out.printf("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d%n", fullstack);
		System.out.printf("Número total de pessoas que responderam à pesquisa: %d%n", totalRespostas);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa é: %.2f%n", mediaIdades);
		
		leia.close();


	}

}
