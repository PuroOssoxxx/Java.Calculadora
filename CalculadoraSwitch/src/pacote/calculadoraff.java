package pacote;
import java.util.Scanner;
import java.util.Locale;
public class calculadoraff {

	public static void main(String[] args) {
		//Elabore uma calculadora usando switch/case
	//para, a partir de 02 valores informados pelo usu�rio assim como a escolha da opera��o que ser� realizada, o algoritmo apresente o resultado final.
    //Se o usu�rio n�o escolher nenhuma das 04 opera��es b�sicas: somar, subtrair, dividir e multiplicar o algoritmo dever� informar opera��o inv�lida.
		
		
		Scanner sc = new Scanner(System.in); // C�DIGO PARA PEGAR DADOS DO CONSOLE.	
		
		
		double valor1, valor2, resultado; // DEFININDO VARI�VEIS
				
		
		int operacao;
	
		
		System.out.println("Informe o primeiro valor"); // PEGANDO PRIMEIRO VALOR INFORMADO PELO USU�RIO
		
		
		valor1 = sc.nextDouble(); // GUARDANDO VALOR INFORMADO
		
		
		System.out.println("Informe o segundo valor"); // PEGANDO SEGUNDO VALOR INFORMADO PELO USU�RIO
	
		
		valor2 = sc.nextDouble();
		
	
		System.out.print("Escolha uma das 4 opera��es desejada" // PEDINDO AO USU�RIO PARA ESCOLHER UMA DAS 04 OPERA��ES  
						
				        + "\n(1) soma"
						+ "\n(2) subtra��o"
						+ "\n(3) multiplica��o"
						+ "\n(4) divis�o");
		
		
	    operacao = sc.nextInt(); // SALVANDO VALOR EM OPERA��O
	
	    
	    switch(operacao) {      // COLOCANDO O C�DIGO SWITCH PARA ORGANIZAR AS OPERA��ES
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
		 System.out.println("Opera��o inv�lida!");
		
		
	     
	       
	    }
			
	}

}
