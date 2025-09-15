import java.util.Scanner;

public class Atividade7switch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float numero1, numero2, resultado;
		int codigo;
		
		System.out.println("Digite o 1º número: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o 2º número: ");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite o código da operação: ");
		codigo = leia.nextInt();
		
		switch(codigo) {
		
		case 1:
			resultado = numero1 + numero2;
			System.out.printf(numero1 + " + " + numero2 + " = " + resultado);
			break;
			
		case 2:
			resultado = numero1 - numero2;
			System.out.printf(numero1 + " - " + numero2 + " = " + resultado);
			break;
			
		case 3:
			resultado = numero1 * numero2;
			System.out.printf(numero1 + " * " + numero2 + " = " + resultado);
			break;
			
		case 4:
			resultado = numero1 / numero2;
			System.out.printf(numero1 + " / " + numero2 + " = " + resultado);
			break;
			
		default:
			System.out.println("Código da operação inválido!");
		}
		
		leia.close();

	}

}
