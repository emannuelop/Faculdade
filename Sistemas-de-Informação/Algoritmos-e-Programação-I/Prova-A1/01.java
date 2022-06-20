/*
Escreva um programa que permita ao usuário informar dados de compras feitas em uma pequena mercearia. 
Devem ser armazenados, para cada compra, o preço unitário do produto e a quantidade da venda.

Os dados devem ser armazenados em arrays, para armazenar 100 compras, no máximo (0.5).

Ao "encerrar" o caixa (digitação dos dados) o programa deve exibir os dados 
e o valor total de cada compra realizada (0,5), o valor total em vendas no día (0,5) 
e o valor medio das compras (0.5)
*/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] quantidade;
		int continuar; 
		double media1=0, media2;
		double[] preco;
		double[] soma;
		double Total = 0;
	    
	    quantidade = new int[100];
		preco = new double[100];
		soma = new double[100];
		
		
		for(int i = 0; i <= 100; i++)
		
	{
		   
		System.out.print("Informe o preço unitário do produto: ");
        preco[i] = leitor.nextDouble(); 
        
        System.out.print("Informe o quantidade de venda do produto: ");
        quantidade[i] = leitor.nextInt();
        
        soma[i] = preco[i] * quantidade[i];
        Total += soma[i];
        
        System.out.print("Se você deseja continuar digite [1] se não digite [2]: "); 
        continuar = leitor.nextInt();
        
        media1 = media1 + 1;
        
        if (continuar == 2)
        
        { 
            
        break;
        
        }
        
	}
	  
	  media2 = (Total / media1);
	  System.out.println("\nEsse e o valor total: " + Total);
	  System.out.println("A média é " + media2);
	
	  for(int i = 0; i <= 100; i++ )
	  
	  {    
	      
	  System.out.println("\n O preço foi de R$" + preco[i] + " a quantidade é " + quantidade[i] 
	  + " o preço vezes a quantidade é: R$" + soma[i]);
	  
	  }
	  
	}
	
}

