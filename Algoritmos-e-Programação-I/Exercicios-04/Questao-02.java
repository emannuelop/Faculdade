import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    int valor, fatorial=1;
	    
	    System.out.println("Digite um numero inteiro, não negativo: ");
	    valor = leitor.nextInt();
	    
	    if (valor > 0) {
	    for(;valor > 0; valor--) {
	        fatorial = fatorial * valor;
	        
	        System.out.print(valor + "x");
	    }
	    
	    System.out.println("=" + fatorial);
	    
	    }
	    
	    else {
	        System.out.println("Não pode valor negativo, só lamento");
	    }
	}
}
