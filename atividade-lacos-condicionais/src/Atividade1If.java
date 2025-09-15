import java.util.Scanner;

public class Atividade1If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, C, resultado;
		
		System.out.println("Digite o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		B = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		C = leia.nextInt();
		
		resultado = (A + B);
		
		if(resultado > C) {
			System.out.printf("%d + %d = %d > %d%n", B, A, resultado, C);
			System.out.printf("%nA soma de A + B é maior do que C");
		}else if(resultado < C) {
			System.out.printf("%d + %d = %d < %d%n", A, B, resultado, C);
			System.out.printf("%nA soma de A + B é menor do que C", resultado, C);
		}else{
			System.out.printf("%d + %d = %d = %d%n", A, B, resultado, C);
			System.out.printf("%nA soma de A + B é igual a C", resultado, C);
		}
					
		leia.close();

	}

}
