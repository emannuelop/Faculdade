import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    int  base, expoente, resultado = 1;
	    
	    System.out.println("Digite o valor da base: ");
	    base = leitor.nextInt();
	    
	    System.out.println("Digite o valor da expoente: ");
	    expoente = leitor.nextInt();
	    
	    for (  ;expoente > 0 ; expoente-- ){
	     resultado = resultado * base;
	    } 
	    System.out.println(resultado);
	}
}



