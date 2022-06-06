import java.util.Scanner;

class potencia {
        int base, expoente;
    }

public class Main
{

    public static int potencia (int base, int expoente) {
    
    int resultado=1;
    
    for (  ;expoente > 0 ; expoente-- ) {
	    resultado = resultado * base;
        
    }
    
    return resultado;
    
    }

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    potencia p1;
    
    p1 = new potencia();
        
    int resultado;
  
    System.out.print("Digite o valor da base: ");
	p1.base = leitor.nextInt();
	
	System.out.print("Digite o valor da expoente: ");
	p1.expoente = leitor.nextInt();
	
	resultado = potencia(p1.base, p1.expoente);
	
	System.out.println("O numero " + p1.base + " elevado a " + p1.expoente + " o resultado é " + resultado);
  
    }
   
}

