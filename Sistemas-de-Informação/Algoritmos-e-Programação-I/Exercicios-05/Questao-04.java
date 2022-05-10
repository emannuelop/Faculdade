import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    
	    int [] valor;
	    int x, xmenor, xmaior;
	    
	    valor = new int[10];
	    
	    System.out.println("Qual é o valor de x: ");
	    x = leitor.nextInt();
	    
	    System.out.println("Informe 10 valores: ");
	    
	    for (int i=0; i <10; i++) {
	        System.out.println("Informe o valor da posição " + i);  
	        valor[i] = leitor.nextInt();
	    }
	    
	    for (int i=0; i <10; i++) {
	        if (valor[i] < x) {
	           xmenor = valor[i];
	            System.out.println("Esse valor é menor que x:" + xmenor); 
	        }
	    }
	    for (int i=0; i <10; i++) {
	        if (valor[i] >= x) {
	            xmaior = valor[i];
	            System.out.println("Esse valor é maior que x:" + xmaior);
	        }
	    }
	}
}
