import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	     float matriz[][] = new float[3][3];
	     
	     for(int L=0; L<3; L++) {
	         
	         for(int C=0; C<2; C++) {
	             System.out.print("Informe a posição " + L + "." + C + " da matriz 1: ");
	             matriz[L][C] = leitor.nextFloat();
	         }
	     }
	     
	     for(int L=0; L<3; L++) {
	         
	         for(int C=0; C<2; C++) {
	             matriz[L][2] += matriz[L][C];
	            System.out.printf ("%.2f ", matriz[L][C]);
	         }
	         System.out.printf ("%.2f\n ", matriz[L][2]);
	     }
	     
	}
}

