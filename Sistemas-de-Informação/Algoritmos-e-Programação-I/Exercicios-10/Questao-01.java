import java.util.Scanner;

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
        
        int  base, expoente, resultado;
	    
	    System.out.print("Digite o valor da base: ");
	    base = leitor.nextInt();
	    
	    System.out.print("Digite o valor da expoente: ");
	    expoente = leitor.nextInt();
	    
	    resultado = potencia(base, expoente);
	    
	    System.out.println("O numero " + base + " elevado a " + expoente + " o resultado é " + resultado);
    }
   
}
