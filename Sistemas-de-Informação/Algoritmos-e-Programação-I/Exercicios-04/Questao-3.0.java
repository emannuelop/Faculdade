import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    int base, pot, res=1;
              
        do{
            System.out.println("Digite a base");
            base = leitor.nextInt();
            
            if(base != 0){
                System.out.println("Digite a potencia");
                pot = leitor.nextInt();
        
                do{
                    res = res * base;
                    pot--;    
                }while(pot > 0);
        
                System.out.println(res);
                res = 1;
          
            }
        }while((base != 0));
        System.out.println("Você digitou base = 0. O programa foi finalizado.");
	}
}
