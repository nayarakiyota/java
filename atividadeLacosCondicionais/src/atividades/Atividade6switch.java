package atividades;
import java.util.Scanner;

public class Atividade6switch {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int codigoColaborador;
		String nomeColaborador = "", cargo = "";
		float salario = 0, reajuste = 0.00f, novoSalario;
		
		System.out.println("Digite o nome do colaborador: ");
		nomeColaborador = leia.nextLine();
		
		System.out.println("Digite o código do cargo: ");
		codigoColaborador = leia.nextInt();
		
		System.out.println("Digite o sálario: ");
		salario = leia.nextFloat();
		
		switch(codigoColaborador) {
		
		case 1:
			cargo = "Gerente";
			reajuste = 0.10f;
			break;
			
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07f;
			break;
			
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09f;
			break;
			
		case 4:
			cargo = "Motorista";
			reajuste = 0.06f;
			break;
			
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05f;
			break;
			
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08f;
			break;
			
		default:
			System.out.println("Código do cargo inválido!");
		}
		
		novoSalario = salario + (reajuste * salario);
		
		System.out.println("Nome do colaborador: " + nomeColaborador);
		System.out.println("Cargo: " + cargo);
		System.out.printf("Salário: R$ %.2f", novoSalario);
				
		leia.close();

	}

}
