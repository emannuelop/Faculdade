import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    int divisao;
	    
	    int[] valores;
	    
	    valores = new int[10];
	    
	    System.out.println("Informe 10 valores: ");
	    
	    for (int i=0; i <10; i++) {
	        System.out.println("Informe o valor da posição " + i);  
	        valores[i] = leitor.nextInt();
	    }
	    
	    for (int i=0; i <10; i++) {
	        divisao = valores[i] % 2;
	        
	        if (divisao == 0)
	        
	        System.out.println("Par " + valores[i]);
	    }
	    
	    for (int i=0; i <10; i++) {
	        divisao = valores[i] % 2;
	        
	        if (divisao == 1)
	        
	        System.out.println("Impar " + valores[i]);
	    }
	}
}
