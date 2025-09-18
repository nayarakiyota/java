package atividades;
import java.util.Scanner;

public class Atividade8switch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigo;
		float saldo = 1000.00f, valor;
				
		System.out.println("Digite o código da operação: ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		
		case 1:
			System.out.printf("Operação - Saldo%nSaldo: R$%.2f", saldo);
			break;
			
		case 2:
			System.out.println("Valor: ");
			valor = leia.nextFloat();
			if(valor <= saldo) {
				saldo -= valor;
				System.out.printf("Operação - Saque%nNovo Saldo: R$ %.2f", saldo);
			}else {System.out.println("Saldo Insuficiente! ");
			}
			break;
			
		case 3:
			System.out.println("Valor: ");
			valor = leia.nextFloat();
			saldo += valor;
			System.out.printf("Operação - Depósito%nNovo Saldo: R$ %.2f", saldo);
			break;
			
		default:
			System.out.println("Operação inválida!");
			
		}
		
		leia.close();

	}

}
