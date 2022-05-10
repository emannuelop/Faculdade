import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    String nome1, nome2;
    int mes1, mes2, dia1, dia2, ano1, ano2;

    Scanner leitor = new Scanner (System.in);

      System.out.println ("Informe o nome da primeira pessoa: ");
      nome1 = leitor.next ();
      
      System.out.println ("Informe o ano de nascimento: ");
      ano1 = leitor.nextInt();
        
      System.out.println ("Informe o mes de nascimento: ");
      mes1 = leitor.nextInt();
      
      System.out.println ("Informe o dia de nascimento: ");
      dia1 = leitor.nextInt();

      System.out.println ("Informe o nome da segunda pessoa: ");
      nome2 = leitor.next ();
      
      System.out.println ("Informe o ano de nascimento: ");
      ano2 = leitor.nextInt();
        
      System.out.println ("Informe o mes de nascimento: ");
      mes2 = leitor.nextInt();
      
      System.out.println ("Informe o dia de nascimento: ");
      dia2 = leitor.nextInt();

    if(ano1 > ano2){
        
        System.out.println(nome2 + " e mais velho");
        
    }
    else if(ano1 < ano2){
        
        System.out.println(nome1 + " e mais velho");
        
    }
    else{
        
        if(mes2 > mes1){
        System.out.println(nome1 + " e mais velho");
        }
        else if(mes1 > mes2){
            System.out.println(nome2 + " e mais velho");        
        }
        
        else{
            if(dia1 > dia2){
               System.out.println(nome2 + " e mais velho"); 
            }
            else if(dia2 > dia1){
              System.out.println(nome1 + " e mais velho");  
            }
            
            else{
                 System.out.println("mesma idade"); 
            }
        }
    }
  }
}
