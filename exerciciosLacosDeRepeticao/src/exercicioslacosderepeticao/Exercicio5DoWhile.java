package exercicioslacosderepeticao;
import java.util.Scanner;

public class Exercicio5DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, somaPositivos = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				somaPositivos += numero; //para somar só os positivos
			}
		}while(numero != 0); //para repetir até digitar o zero
		
		System.out.println("A soma dos números positivos é: " + somaPositivos);
		
		leia.close();

	}

}
