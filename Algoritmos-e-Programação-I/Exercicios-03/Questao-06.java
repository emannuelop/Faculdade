import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    
    double VelMax, VelMotorista, Velocida;

    Scanner leitor = new Scanner (System.in);

    VelMax = 80;
    
    System.out.println ("Velocidade permitida da pista é 80km por hora");

    System.out.println ("Informe a velocidade que motorista estava: ");
    VelMotorista = leitor.nextDouble ();
    
    Velocida = (VelMotorista - VelMax);
    
    if (Velocida > 0 && Velocida <= 10){
        System.out.println ("Voce ultrapassou a velocidade permitida multa de R$50");
    }
        
    else if (Velocida > 10 && Velocida <= 30){
            System.out.println ("Voce ultrapassou a velocidade permitida multa de R$100");
        }
        
    else if (Velocida > 30){
            System.out.println ("Voce ultrapassou a velocidade permitida multa de R$200");
        }
        
    else {
        System.out.println ("Voce não ultrapassou a velocidade permitida");
    }
  }
}
