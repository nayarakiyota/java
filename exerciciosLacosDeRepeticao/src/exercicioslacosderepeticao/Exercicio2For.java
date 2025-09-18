package exercicioslacosderepeticao;
import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
	int numero, totalNumPares = 0, totalNumImpares = 0;
	        
	for (int i = 1; i <= 10; i++) {
	    System.out.print("Digite o " + i + "º número: ");
	    numero = leia.nextInt();
	            
	if (numero % 2 == 0) {
	    totalNumPares++;
	}else{
	    totalNumImpares++;
	  }
	      }
	         
	     System.out.println("Total de números pares: " + totalNumPares);
	     System.out.println("Total de números ímpares: " + totalNumImpares);
	        
	 leia.close();
	 
	    }
	}