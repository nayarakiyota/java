package condicionais;

import java.util.Scanner;

public class Horoscopo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int signo;
		
		System.out.println("===========================================");
		System.out.println("            Horóscopo do dia               ");
		System.out.println("===========================================");
		System.out.println("                                           ");
		System.out.println("               1 - Capricórnio             ");
		System.out.println("               2 - Aquário                 ");
		System.out.println("               3 - Peixes                  ");
		System.out.println("               4 - Áries                   ");
		System.out.println("               5 - Touro                   ");
		System.out.println("               6 - Gêmeos                  ");
		System.out.println("               7 - Câncer                  ");
		System.out.println("               8 - Leão                    ");
		System.out.println("               9 - Virgem                  ");
		System.out.println("               10 - Libra                  ");
		System.out.println("               11 - Escorpião              ");
		System.out.println("               12 - Sagitário              ");
		System.out.println("                                           ");
		System.out.println("===========================================");
		System.out.println("Digite a opção desejada:                   ");
		signo = leia.nextInt();
		
		switch(signo) {
		
		case 1: 
			System.out.println("Capricórnio: Trabalho e disciplina rendem frutos; um passo consistente hoje aproxima metas importantes.");
			break;
		
		case 2: 
			System.out.println("Aquário: Inove nas conexões sociais; uma ideia em grupo pode evoluir — compartilhe sem medo.");
			break;
		
		case 3: 
			System.out.println("Peixes: Sensibilidade aguçada; confie na intuição, cuide dos limites e cultive um pequeno ritual que te acalme.");
			break;
		
		case 4: 
			System.out.println("Áries: Dia para agir com coragem — comece algo pequeno que você vinha adiando e confie no seu impulso.");
			break;
			
		case 5: 
			System.out.println("Touro: Foque no conforto e nas finanças; um gesto prático trará segurança emocional e estabilidade.");
			break;
			
		case 6: 
			System.out.println("Gêmeos: Comunicação em alta — aproveite para conversar, esclarecer mal-entendidos e fazer conexões.");
			break;
		
		case 7: 
			System.out.println("Câncer: Priorize autocuidado e intimidade; reserve tempo para família ou para recarregar suas emoções.");
			break;
			
		case 8: 
			System.out.println("Leão: Brilhe com criatividade — mostre seu trabalho, aceite elogios e participe de algo que inspire orgulho.");
			break;
			
		case 9: 
			System.out.println("Virgem: Organização traz paz; revise prioridades, ajuste rotinas e faça uma tarefa chata para ganhar leveza.");
			break;
			
		case 10: 
			System.out.println("Libra: Busque equilíbrio em relacionamentos; seja gentil ao negociar e priorize diálogo aberto.");
			break;
				
		case 11: 
			System.out.println("Escorpião: Profundidade e transformação — encare uma verdade difícil e permita-se renascer a partir dela.");
			break;
				
		case 12: 
			System.out.println("Sagitário: Abra-se para aprendizado e aventura curta; um novo interesse pode renovar sua visão de futuro.");
			break;
		default:
			System.out.println("Opção inválida!");
		
		}
		
		leia.close();
				
	}

}
