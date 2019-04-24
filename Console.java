import java.util.Scanner;

/**
* classe do tipo interface com usuario 
*/
public class Console {
    
    void executa(){
    	Scanner entrada = new Scanner(System.in); 
        Pessoa pessoa = new Pessoa();
    	
    	System.out.print("Digite seu nome  : ");
    	String novonome = entrada.nextLine();
        pessoa.setNome(novonome);
    	
    	System.out.print("Digite seu peso : ");
    	double peso = entrada.nextDouble();
    	pessoa.setPeso(peso);
    	
    	System.out.print("Digite sua altura : ");
    	double altura = entrada.nextDouble();
    	pessoa.setAltura(altura);
    	
    	IMC imc = new IMC();
    	
    	//double indice = imc.getIndice(pessoa.getPeso(), pessoa.getAltura());
    	//double indice = imc.getIndice(pessoa); 
    	imc.atualiza(pessoa);
    	
    	
    	System.out.println("\nRelatorio *******");
    	System.out.println("nome   = " + pessoa.getNome());
    	System.out.println("peso   = " + pessoa.getPeso());
    	System.out.println("altura = " + pessoa.getAltura());
    	System.out.println("Seu IMC e = "   + pessoa.getImc());
    	System.out.println("Sua avaliacao e = "   + pessoa.getSituacao());
    
    
    }
  
  
  
}
