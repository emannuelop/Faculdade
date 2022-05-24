import java.util.Scanner;

public class Main
{

    public static int fatorial (int valor) {
    
    int fatorial=1;
    
    if (valor > 0) {
	    for(;valor > 0; valor--) {
	        fatorial = fatorial * valor;
	    }
    }
    
    return fatorial;
    
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int valor, resultado;
        
        System.out.print("Digite um numero inteiro, não negativo: ");
	    valor = leitor.nextInt();
	    
	    resultado = fatorial(valor);
	    
	    System.out.print("O valor fatorial do número " + valor + " é " + resultado);
    }
   
}
