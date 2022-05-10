import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    int [] valor = new int[10];
	    int [] inverso = new int[10];
	    
	    System.out.println("Informe 10 valores: ");
	    
	    for (int i=0; i <10; i++) {
	        System.out.println("Informe o valor da posição " + i);  
	        valor[i] = leitor.nextInt();
	    }
	    
	    for (int i = 9; i >= 0; i--) {
            inverso[i] = valor[9 - i];
        }
        
        System.out.println("Os valores invertidos foram " + Arrays.toString(inverso));
	}
}
