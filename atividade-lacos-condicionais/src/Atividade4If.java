import java.util.Scanner;

public class Atividade4If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String caracteristica1, caracteristica2, caracteristica3;
		String animal = "";
		
		System.out.println("Digite a primeira característica: ");
		caracteristica1 = leia.nextLine();
		
		System.out.println("Digite a segunda característica: ");
		caracteristica2 = leia.nextLine();
		
		System.out.println("Digite a terceira característica: ");
		caracteristica3 = leia.nextLine();
		
		if(caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equalsIgnoreCase("ave") && caracteristica3.equalsIgnoreCase("carnívoro")) {
			animal = "Águia";
		}else if(caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equalsIgnoreCase("ave") && caracteristica3.equalsIgnoreCase("onívoro")) {
			animal = "Pomba";
		}else if(caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equalsIgnoreCase("mamífero") && caracteristica3.equalsIgnoreCase("onívoro")) {
			animal = "Homem";
		}else if(caracteristica1.equalsIgnoreCase("vertebrado") && caracteristica2.equalsIgnoreCase("mamífero") && caracteristica3.equalsIgnoreCase("herbívoro")) {
			animal = "Vaca";
		}else if(caracteristica1.equalsIgnoreCase("invertebrado") && caracteristica2.equalsIgnoreCase("inseto") && caracteristica3.equalsIgnoreCase("hematófago")) {
			animal = "Pulga";
		}else if(caracteristica1.equalsIgnoreCase("invertebrado") && caracteristica2.equalsIgnoreCase("inseto") && caracteristica3.equalsIgnoreCase("herbívoro")) {
			animal = "Lagarta";
		}else if(caracteristica1.equalsIgnoreCase("invertebrado") && caracteristica2.equalsIgnoreCase("anelídeo") && caracteristica3.equalsIgnoreCase("hematófago")) {
			animal = "Sanguessuga";
		}else if(caracteristica1.equalsIgnoreCase("invertebrado") && caracteristica2.equalsIgnoreCase("anelídeo") && caracteristica3.equalsIgnoreCase("onívoro")) {
			animal = "Minhoca";
		}
		
		System.out.println(animal);
		
		leia.close();

	}

}
