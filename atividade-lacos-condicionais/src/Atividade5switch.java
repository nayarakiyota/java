import java.util.Scanner;

public class Atividade5switch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigoProduto, quantidade;
		String produto = "";
		float preco = 0, total;
		
		System.out.println("Digite o código do produto: ");
		codigoProduto = leia.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = leia.nextInt();
		
		switch(codigoProduto) {
		
		case 1:
			produto = "Cachorro quente";
			preco = 10.0f;
			break;
			
		case 2:
			produto = "X-Salada";
			preco = 15.0f;
			break;
			
		case 3:
			produto = "X-Bacon";
			preco = 18.0f;
			break;
			
		case 4:
			produto = "Bauru";
			preco = 12.0f;
			break;
			
		case 5:
			produto = "Refrigerante";
			preco = 8.0f;
			break;
			
		case 6:
			produto = "Suco de laranja";
			preco = 13.0f;
			break;
			
		default:
			System.out.println("Código de produto inválido!");
		}
		
		total = quantidade * preco;
		
		System.out.println("Produto: " + produto);
		System.out.printf("Valor total: R$ %.2f", total);
		
		leia.close();

	}

}
