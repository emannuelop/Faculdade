import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;


public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    Random gerador = new Random();
	    
	    int[] vetor = new int[100];
	    ArrayList<Integer> list = new ArrayList();

	    int valor;
	    
	    for (int i=0; i< 100; i++) {
	        vetor[i] = gerador.nextInt(100);
	    }
	    
	    System.out.println(Arrays.toString(vetor));
	    
	    System.out.print("\nInforme um valor de 0 a 99: ");
	    valor = leitor.nextInt();
	    
	    for (int i=0; i< 100; i++) {
	        
	        if (valor == vetor[i]) {
	            list.add(i);
	        }
	        
	    }
	    
	    if ( list.isEmpty()) {
	        System.out.println("Lista vazia!");
	    }
	    
	    else {
            System.out.print(list);
        }
        
	}
}

