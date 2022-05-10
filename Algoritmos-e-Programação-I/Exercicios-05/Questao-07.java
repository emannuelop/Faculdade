import java.util.Scanner;
import java.util.Random;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner leitor = new Scanner(System.in);
	    Random gerador = new Random();
	    
	    int[] vetor = new int[100];
	    int tentativa, pontuacao=0;
	    
	    for (int i=0; i< 100; i++) {
	        vetor[i] = gerador.nextInt(100);
	    }
	    
	    for (int i=0; i<10; i++) {
	            System.out.println("Chute um valor: ");
	            tentativa = leitor.nextInt();
	        
	        
	        for(int j=0; j<100; j++) {
	            if(tentativa == vetor[j]) {
	                pontuacao++;
	                System.out.println("Acertou");
	            }
	        }
	    }
	   
	    System.out.print("Sua pontuação foi de "+ pontuacao + " pontos!");	
	    
	}
}
