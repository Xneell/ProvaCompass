package avaliacao;

import java.util.Scanner;

public class quiz {
   
	public static void main(String[] args) {
		
	 String pergunta1 = "";
	 String pergunta2 = "";
	 String pergunta3 = "";
	 String pergunta4 = "";
	 String pergunta5 = "";
	 String nomeUsuario = "";
	 
	 Scanner scan = new Scanner(System.in);
		
		int alternativasCorretas = 0;
		int alternativasErradas = 0;
		
		System.out.println("Qual o seu nome de usuario");
		nomeUsuario = scan.nextLine();
		
		// Primeira Questao
		
		
		System.out.println("Qual é a conta?? (20+20)");		
		System.out.println("A: 1");
		System.out.println("B: 2");
		System.out.println("C: 3");
		System.out.println("D: 40");
				
		pergunta1 = scan.nextLine();
		
		if(pergunta1.equals("D"))
		{
			System.out.println("Acertou!");
			alternativasCorretas = alternativasCorretas +1;
		}
		else
		{		
			System.out.println("D");
			alternativasErradas = alternativasErradas +1;
		}
		// Segunda Questao
		
		System.out.println("Qual é a conta?? (20x20)");		
		System.out.println("A: 400");
		System.out.println("B: 300");
		System.out.println("C: 100");
		System.out.println("D: 200");
				
		pergunta2 = scan.nextLine();
		
		if(pergunta2.equals("A"))
		{
			System.out.println("Acertou!");
			alternativasCorretas = alternativasCorretas +1;
		}
		else
		{		
			System.out.println("Errou");
			alternativasErradas = alternativasErradas +1;
		}
		// terceira questao
		
		System.out.println("Qual é a conta?? (20/20)");		
		System.out.println("A: 4");
		System.out.println("B: 1");
		System.out.println("C: 3");
		System.out.println("D: 2");
				
		pergunta3 = scan.nextLine();
		
		if(pergunta3.equals("B"))
		{
			System.out.println("Acertou!");
			alternativasCorretas = alternativasCorretas +1;
		}
		else
		{		
			System.out.println("Errou");
			alternativasErradas = alternativasErradas +1;
		}
		// quarta questao
		
		System.out.println("Qual é a conta?? (20+20-20)");		
		System.out.println("A: 2");
		System.out.println("B: 60");
		System.out.println("C: 40");
		System.out.println("D: 20");
				
		pergunta4 = scan.nextLine();
		
		if(pergunta4.equals("D"))
		{
			System.out.println("Acertou!");
			alternativasCorretas = alternativasCorretas +1;
		}
		else
		{		
			System.out.println("Errou");
			alternativasErradas = alternativasErradas +1;
		}
		// quinta questao
		
		System.out.println("Qual é a conta?? (20+20*20)");		
		System.out.println("A: 200");
		System.out.println("B: 20");
		System.out.println("C: 420");
		System.out.println("D: 60");
				
		pergunta5 = scan.nextLine();
		
		if(pergunta5.equals("C"))
		{
			System.out.println("Acertou!");
			alternativasCorretas = alternativasCorretas +1;
		}
		else
		{		
			System.out.println("Errou");
			alternativasErradas = alternativasErradas +1;
		}
		System.out.println("Usuario : " + nomeUsuario);
		System.out.println("Alternativas que voce acertou: " + alternativasCorretas);
		System.out.println("Alternativas que voce errou: " + alternativasErradas);
}
}