import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	     float matriz1[][] = new float[2][3];
	     float matriz2[][] = new float[2][3];
	     float amazernador[][] = new float[2][3];
	     
	     for(int L=0; L<2; L++) {
	         
	         for(int C=0; C<3; C++) {
	             System.out.print("Informe a posição " + L + "." + C + " da matriz 1: ");
	             matriz1[L][C] = leitor.nextFloat();
	         }
	     }System.out.print("\n");
	     
	     for(int L=0; L<2; L++) {
	         
	         for(int C=0; C<3; C++) {
	             System.out.print("Informe a posição " + L + "." + C + " da matriz 2: ");
	             matriz2[L][C] = leitor.nextFloat();
	         }
	     }System.out.print("\n");
	     
	     for(int L=0; L<2; L++) {
	         
	         for(int C=0; C<3; C++) {
	             amazernador[L][C] = matriz1[L][C] + matriz2[L][C];
	             System.out.print(" | " + amazernador[L][C]);
	         }System.out.print("\n");
	     }
	     
	}
}

