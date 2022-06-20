import java.util.Random;
import java.util.Scanner;

class jogo 
{
    int campo1;
    String campo2;
}

public class Main
{
	public static void main(String[] args)
	{
	    Scanner leitor = new Scanner(System.in);
	    Random gerador = new Random();
	    
	    int chute, pontuacao=0, acertou, escolha;
	    jogo[] minado = new jogo[100];
	    boolean menu = true;
	    
	    for(int i = 0; i < 100; i++) 
	    {
	        minado[i] = new jogo();
	    }
	    
	    for(int i=0; i < 100; i++) 
	    {
	        minado[i].campo2 = "*";
	        minado[i].campo1 = gerador.nextInt(200);
	        
	        System.out.print(minado[i].campo2);
	    }
	    
	    while (menu) 
	    {
            System.out.println("\n[1] Começar o jogo");
            System.out.println("[2] Começar o jogo novamente");
            System.out.println("[3] Sair do jogo");
            
            System.out.print("\nDigite uma opção entre 1 e 3: ");
            escolha = leitor.nextInt();
            
            switch (escolha) 
            {
                case 1:
                    for(int i=0; i < 10; i++) 
	                {

	                    do 
	                    {
	                    System.out.print("\nChute um valor: ");
	                    chute = leitor.nextInt();
	                    } 
	        
	                    while(chute < 0);
	       
	                    acertou = 0;
	    
	                    for(int j=0; j < 100; j++) 
	                    {
	            
	                        if(chute == minado[j].campo1 && acertou == 0) 
	                        {
	                            pontuacao++;
	                            System.out.println("Acertou");
	                            acertou = 1;
	                            minado[j].campo1 = -1;
	                        }
	            
	                        else if(chute == minado[j].campo1 && acertou == 1)
	                            minado[j].campo1 = -1; 
	                    }
	        
	                }
	                
	            System.out.println("\nSua pontuação foi de " + pontuacao + " pontos!");	
                break;  
                
                case 2:
                    for(int i=0; i < 10; i++) 
	                {

	                    do 
	                    {
	                    System.out.print("\nChute um valor: ");
	                    chute = leitor.nextInt();
	                    } 
	        
	                    while(chute < 0);
	       
	                    acertou = 0;
	    
	                    for(int j=0; j < 100; j++) 
	                    {
	            
	                        if(chute == minado[j].campo1 && acertou == 0) 
	                        {
	                            pontuacao++;
	                            System.out.println("Acertou");
	                            acertou = 1;
	                            minado[j].campo1 = -1;
	                        }
	            
	                        else if(chute == minado[j].campo1 && acertou == 1)
	                            minado[j].campo1 = -1; 
	                    }
	        
	                }
	                
	            System.out.println("\nSua pontuação foi de " + pontuacao + " pontos!");	
                break;      
                
                case 3:
                menu = false;
                System.out.println("\nVocê saiu do jogo");	
                break;
                
            }
	    }
	    
	}
}



