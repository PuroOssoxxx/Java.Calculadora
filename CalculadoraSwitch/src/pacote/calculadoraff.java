package pacote;
import java.util.Scanner;
import java.util.Locale;
public class calculadoraff {

	public static void main(String[] args) {
		//Elabore uma calculadora usando switch/case
	//para, a partir de 02 valores informados pelo usuï¿½rio assim como a escolha da operaï¿½ï¿½o que serï¿½ realizada, o algoritmo apresente o resultado final.
    //Se o usuï¿½rio nï¿½o escolher nenhuma das 04 operaï¿½ï¿½es bï¿½sicas: somar, subtrair, dividir e multiplicar o algoritmo deverï¿½ informar operaï¿½ï¿½o invï¿½lida.
		
		
		Scanner sc = new Scanner(System.in); // Cï¿½DIGO PARA PEGAR DADOS DO CONSOLE.	
		
		
		double valor1, valor2, resultado; // DEFININDO VARIï¿½VEIS
				
		
		int operacao;
	
		
		System.out.println("Informe o primeiro valor"); // PEGANDO PRIMEIRO VALOR INFORMADO PELO USUï¿½RIO
		
		
		valor1 = sc.nextDouble(); // GUARDANDO VALOR INFORMADO
		
		
		System.out.println("Informe o segundo valor"); // PEGANDO SEGUNDO VALOR INFORMADO PELO USUï¿½RIO
	
		
		valor2 = sc.nextDouble();
		
	
		System.out.print("Escolha uma das 4 operações desejada" // PEDINDO AO USUï¿½RIO PARA ESCOLHER UMA DAS 04 OPERAï¿½ï¿½ES  
						
				        + "\n(1) soma"
						+ "\n(2) subtração"
						+ "\n(3) multiplicação"
						+ "\n(4) divisão");
		
		
	    operacao = sc.nextInt(); // SALVANDO VALOR EM OPERAÇÃO
	
	    
	    switch(operacao) {      // COLOCANDO O CÓDIGO SWITCH PARA ORGANIZAR AS OPERAÇÕES
	    case 1:
	    	resultado = valor1 + valor2 ;
    		System.out.println(resultado);
    		break;
	  
	    
	    
	    case 2:
	    	resultado = valor1 - valor2 ;
    		System.out.println(resultado);
    		break;
	    
    		
	    case 3:
	    	resultado = valor1 * valor2 ;
    		System.out.println(resultado);
    		break;
	    
	    
	    case 4:
	    	resultado = valor1 / valor2 ;
    		System.out.println(resultado);
    		break;

    		
		default:
		 System.out.println("Operação inválida!");
		
		
	     
	       
	    }
			
	}

}
