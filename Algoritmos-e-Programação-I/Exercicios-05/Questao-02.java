import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    int dobro;
	    int [] valores;
	    
	    valores = new int[10];
	    
	    System.out.println("Informe 10 valores: ");
	    
	    for (int i=0; i <10; i++) {
	        System.out.println("Informe o valor da posição " + i);  
	        valores[i] = leitor.nextInt();
	    }
	    
	    for (int i=0; i <10; i++) {
	        dobro = valores[i] * 2;
	        
	        
	        System.out.println("O valor em dobro de  " + valores[i] + " é " + dobro);
	    }
	}
}
