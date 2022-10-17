package avaliacao;
import java.util.Scanner;
import java.util.Arrays; 

public class Bonificacao {
	public static void main (String[] args) {
	 
		int funcionarios;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de funcionarios: ");
		funcionarios = entrada.nextInt();
		
		String[] nomes = new String[funcionarios];
		
		double[] salarios = new double[funcionarios];
		
		double bonus = 0;
		
		for (int contador = 0; contador < funcionarios; contador++){
			
			System.out.println("Nome do funcionario: ");
			nomes[contador] = entrada.next();
			
			System.out.println("Salario: ");
			salarios[contador] = entrada.nextDouble();
					
		}				
		for (int contador = 0; contador < funcionarios; contador++){
			if (salarios[contador] == 1000)
				bonus = salarios[contador]*0.20;
				
			 else if (salarios[contador] >= 1000 && salarios[contador] < 2000) 
				bonus = salarios[contador]*0.10;
				
			 else if (salarios[contador] >= 2000)
				bonus -= salarios[contador]*0.10;
				
			System.out.println("Funcionario: " + nomes[contador]);
	
			double [] registroSalarios = {salarios[contador], bonus,(salarios[contador] + bonus) };
			
			System.out.println(Arrays.toString(registroSalarios));
			
			System.out.println("Salario final: " + (salarios[contador] + bonus));
			
		} 
	}
}
