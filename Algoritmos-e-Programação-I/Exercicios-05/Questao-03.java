import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    int [] valor1;
	    int [] valor2;
	    int [] valor3;
	    
	    valor1 = new int[10];
	    valor2 = new int[10];
	    valor3 = new int[10];
	    
	    System.out.println("Preencha 2 arrays A e B:");
	    
	    for (int i=0; i <10; i++) {
	        System.out.println("Informe o valor da posição " + i + " do array A: ");  
	        valor1[i] = leitor.nextInt();
	        System.out.println("Informe o valor da posição " + i + " do array B: ");  
	        valor2[i] = leitor.nextInt();
	    }
	    
	    for (int i=0; i <10; i++) {
	        valor3[i] = valor1[i] + valor2[i];
	        System.out.println("A soma de " + valor1[i] + "+" + valor2[i] + " = " + valor3[i]);
	    }
	}
}
