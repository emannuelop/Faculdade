import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	     int [] vetor = new int[10];
	     int [] vetor2 = new int[2];
	     int inverter;
	     
	     for (int i=0; i <10; i++) {
	        System.out.print("Informe um valor " + i + ": ");  
	        vetor[i] = leitor.nextInt();
	    }
	    
	    System.out.println("\n" + Arrays.toString(vetor));
	    
	     for (int i = 0; i < 2; i++) {
            System.out.print("\n" + "Informe duas posições: ");
            vetor2[i] = leitor.nextInt();
        }
        
        inverter = vetor[vetor2[0]];
        vetor[vetor2[0]] = vetor[vetor2[1]];
        vetor[vetor2[1]] = inverter;
        
        System.out.println("\n" + Arrays.toString(vetor));
	}
}
