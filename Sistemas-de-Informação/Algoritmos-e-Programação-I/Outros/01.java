import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		
		int linha, coluna, soma=0, media=0;
		
		System.out.print("Informe a quantidade de linhas: ");
		linha = leitor.nextInt();
		
		System.out.print("Informe a quantidade de colunas: ");
		coluna = leitor.nextInt();
		
		int matriz[][] = new int[linha][coluna];
		
		for (int L = 0; L < linha; L++)
		{
		    for (int C = 0; C < coluna; C++)
		    {
		       System.out.print("Informe a " + L + "." + C + ": ");
		       matriz[L][C] = leitor.nextInt();
		       
		       soma = soma + matriz[L][C];
	           media++;
		    }
		}
		
		media = soma / media;
		
		for (int L = 0; L < linha; L++) 
		{
		    for (int C = 0; C < coluna; C++)
		    {
		        if (matriz[L][C] >= media) 
		        {
		            matriz[L][C] = 1; 
		        }
		        
		        else if (matriz[L][C] < media)  
		        {
		            matriz[L][C] = 0; 
		        }
		    }
		}
		
		for (int L = 0; L < linha; L++) 
		{
		    for (int C = 0; C < coluna; C++)
		    {
		        System.out.print(" [" + matriz[L][C] + "] ");
		    }
		    System.out.println();
		}
		
	}
}


