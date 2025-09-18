package exerciciosvetoresmatrizes;
import java.util.Scanner;

public class Exercicio3Matrizes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        
        int matriz[][] = new int[3][3]; 
        
        String diagonalPrincipal = "", diagonalSecundaria = "";
        
        int somaPrincipal = 0, somaSecundaria = 0;
        
        //entrada de dados
        System.out.println("Digite os elementos da matriz 3x3: ");
        for (int linha = 0; linha < matriz.length; linha ++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) { 
                System.out.printf("matriz[%d][%d] = ", linha, coluna);
                matriz[linha][coluna] = leia.nextInt();
            }
                            
        }
        
        //elementos na Diagonal Principal
        for (int indice = 0; indice < matriz.length; indice ++) {
            diagonalPrincipal += matriz[indice][indice] + " "; 
            somaPrincipal += matriz[indice][indice];
        }
        
        
        //elementos na Diagonal Secundária 
        for (int indice = 0; indice < matriz.length; indice ++) {
            diagonalSecundaria += matriz[indice][matriz.length - 1 - indice] + " "; 
            somaSecundaria += matriz[indice][matriz.length - 1 - indice];
        }
        
        System.out.println("Diagonal Principal: " + diagonalPrincipal);
		System.out.println("Diagonal Secundária: " + diagonalSecundaria);
        System.out.println("Soma dos elementos da Diagonal Principal: " + somaPrincipal);
        System.out.println("Soma dos elementos da Diagonal Secundária: " + somaSecundaria);
        
        leia.close();
    
	}

}
