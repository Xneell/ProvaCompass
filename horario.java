package avaliacao;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Arrays; 

public class horario {
	public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
       
        System.out.println("login> ");
        
        String login = dados.nextLine();
        
        System.out.println("senha> ");
        
        String senha = dados.nextLine();
        
        Date dataHoraAtual = new Date();
        
        String hora = new SimpleDateFormat("HH").format(dataHoraAtual);
        System.out.println(hora);
        int horaf = Integer.parseInt(hora);
                     
        // Array para verificar caso ocorra algum erro com o login ou a senha
        String [] sistema = {login, senha,};
		System.out.println(Arrays.toString(sistema));
		      
        if((horaf >=6 && horaf<12) && (login.equals("admin") && senha.equals("admin11")))
        {
    		System.out.printf("Bom dia, voce se logou ao nosso sistema, o Usuário %s foi logado com sucesso.", login);	
            } else if((horaf >= 12 && horaf<18) && (login.equals("admin") && senha.equals("admin11")))
            {
    		System.out.printf("Boa tarde, voce se logou ao nosso sistema, o Usuário %s foi logado com sucesso.", login );	
    	} else if ((horaf >= 18 && horaf < 00) &&  (login.equals("admin") && senha.equals("admin11")))
    	{
    		System.out.printf("Boa noite,voce se logou ao nosso sistema, o Usuário %s foi logado com sucesso.", login );	
    	} else if ((horaf >=00 && horaf<6) && (login.equals("admin") && senha.equals("admin11")))
    	{
    		System.out.printf("Boa madrugada, voce se logou ao nosso sistema, o Usuário %s foi logado com sucesso.", login);		
    	} else {
                System.out.println("Usuario ou senha incorreto.");
    	}  		 
 }
}