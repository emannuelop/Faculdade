/*
Escreva um programa em Java que permita ao usuario informar valores numéricos inteiros para 
o preenchimento de um array de tamanho escolhido pelo usuário (0,5).

O usuário também deve informar duas posições do array e o programa deve imprimir todos 
os numeros contidos no intervalo informado (incluindo os limites) (0.5)

O programa deve permitir que a primeira posição informada seja menor que a segunda 
e mesmo assim imprimir corretamente (0.5).

O programa deve verificar se as posições informadas são posições válidas para evitar 
erros no programa e informar ao usuário (0.5)
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner leitor = new Scanner(System.in);
	    
	    int tamanhoArray, valor1, valor2;
	    int[] usario;
	    
	    System.out.print("Informe o tamanho do array: ");
	    tamanhoArray = leitor.nextInt();
	    
	    usario = new int[tamanhoArray];
	    
	    for(int i = 0; tamanhoArray > i; i++)
	    
	    {
            
            System.out.print("Informe um número inteiro: ");
            usario[i] = leitor.nextInt();
            
        }
	    
	    System.out.print("Informe dois valores entre 0 e " + usario.length + ": ");
        valor1 = leitor.nextInt();
        valor2 = leitor.nextInt();
        
        if (valor2 <= usario.length && valor1 <= usario.length)
        
        {
            
            if(valor1 > valor2)
            
            {
            
                for(int i = valor2  ; i<= valor1; i++ )
                
                {
                    
                    System.out.println("\n valores " + usario[i]);
                    
                }
                
            }
            
            else if(valor1 <= valor2)
            
            {
                for(int i = valor1; valor2 >= valor1; i++ )
                
                {
                    
                    System.out.println("\n valores " +usario[i]);
                    
                }
                
            }
            
        } 
	    
	}
	
}


