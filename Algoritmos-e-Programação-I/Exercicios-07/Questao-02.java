import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	     float matriz[][] = new float[3][3];
	     float amazernador=0;
	     
	     for(int L=0; L<3; L++) {
	         
	         for(int C=0; C<3; C++) {
	             System.out.print("Informe a posição " + L + "." + C + " da matriz: ");
	             matriz[L][C] = leitor.nextFloat();
	         }
	         amazernador = matriz[0][0] + matriz[1][2] + matriz[2][2];
	     }
	     
	     System.out.println("A soma dos dos valores que compõem a diagonal principal da matriz é: "
	         + amazernador);
	     
	}
}

