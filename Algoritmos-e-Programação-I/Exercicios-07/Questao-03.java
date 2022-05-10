import java.util.Scanner;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    int linha, coluna;
	     
	    System.out.print("Informe a quantidade de linha da matriz: ");
	    linha = leitor.nextInt();
	     
	    System.out.print("Informe a quantidade de coluna da matriz: ");
	    coluna = leitor.nextInt();
	     
	    int matriz[][] = new int[linha][coluna];
	    int [] par = new int[linha * coluna];

	    for(int L=0; L<linha; L++) {
	         
	         for(int C=0; C<coluna; C++) {
	             System.out.print("Informe a posição " + L + "." + C + " da matriz: ");
	             matriz[L][C] = leitor.nextInt();
	         }
	     }
	     
	     for(int L=0; L<linha; L++) {
	         
	         for(int C=0; C<coluna; C++) {
	             if(matriz[L][C] % 2 == 0) {
	                par[C] = matriz[L][C];
	            }
	        }
	        System.out.print(Arrays.toString(par));
	    }
	    
	}
}

