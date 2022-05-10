import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    double[] vetor;
	    double media, soma=0;
	    
	    vetor = new double[10];
	    
	    for(int i=0; i<10; i++) {
	        
	        System.out.println("Digite um valor: ");
	        vetor[i] = leitor.nextFloat();
	        soma = soma + vetor[i];
	        
	    }
	    
	    media = soma/10;
		System.out.println("A média é " + media);
		
		System.out.println("Menores que a média: ");
		for(int i=0; i<10; i++) {
		    
		    if(vetor[i] <= media)
		        System.out.print(vetor[i] + ", ");
		        
		}
		
		System.out.println("\nMaiores que a média: ");
		for(int i=0; i<10; i++) {
		    
		    if(vetor[i] > media)
		        System.out.print(vetor[i] + ", ");
		    
		}
	}
}

