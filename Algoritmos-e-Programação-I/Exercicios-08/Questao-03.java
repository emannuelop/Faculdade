import java.util.Scanner;

	class data {
		    
		String nome1, nome2;
        int ano1, mes1, dia1, ano2, mes2, dia2;
		    
	}

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		data d1;
        d1 = new data();
        
            System.out.print("Informe um nome de uma pessoa: ");
            d1.nome1 = leitor.next();
            
            System.out.print("\nInforme um nome de outra pessoa: ");
            d1.nome2 = leitor.next();
            
            System.out.print("\nInforme o ano que a pessoa " + d1.nome1 + " nasceu: ");
            d1.ano1 = leitor.nextInt();
            
            System.out.print("Informe o mês que a pessoa " + d1.nome1 + " nasceu: ");
            d1.mes1 = leitor.nextInt();
            
            System.out.print("Informe o dia que a pessoa " + d1.nome1 + " nasceu: ");
            d1.dia2 = leitor.nextInt();
            
            System.out.print("\nInforme o ano que a pessoa " + d1.nome2 + " nasceu: ");
            d1.ano2 = leitor.nextInt();
            
            System.out.print("Informe o mês que a pessoa " + d1.nome2 + " nasceu: ");
            d1.mes2 = leitor.nextInt();
            
            System.out.print("Informe o dia que a pessoa " + d1.nome2 + " nasceu: ");
            d1.dia2 = leitor.nextInt();
            
        if(d1.ano1 > d1.ano2) {
            System.out.println(d1.nome2 + " é mais velho");
        }
        
        else if(d1.ano1 < d1.ano2) {
            System.out.println(d1.nome1 + " é mais velho");
        }
        
        else {
        
            if(d1.mes2 > d1.mes1) {
            System.out.println(d1.nome1 + " é mais velho");
            }
            
            else if(d1.mes1 > d1.mes2) {
                System.out.println(d1.nome2 + " é mais velho");        
            }
        
            else {
                
                if(d1.dia1 > d1.dia2) {
                System.out.println(d1.nome2 + " é mais velho"); 
                }
                
                else if(d1.dia2 > d1.dia1) {
                System.out.println(d1.nome1 + " é mais velho");  
                }
    
                else {
                    System.out.println("As pessoas tem a mesma idade"); 
                }
            }
        }

	}
}

