import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    double kgMorango, kgMaca, precoTotal, precoMorango, precoMaca, totalKilos;

    Scanner leitor = new Scanner (System.in);

      System.out.println ("Qual é a quantida de morango em Kg: ");
      kgMorango = leitor.nextDouble ();
      
      System.out.println ("Qual é a quantida de maça em Kg: ");
      kgMaca = leitor.nextDouble ();
      
      if (kgMorango <= 5){
          precoMorango = 2.50 * kgMorango;
      }
      
      else {
          precoMorango = 2.20 * kgMorango;
      }
      
      if (kgMaca <= 5){
          precoMaca = 1.80 * kgMaca;
      }
      
      else {
          precoMaca = 1.50 * kgMaca;
      }
      
      precoTotal = precoMorango + precoMaca;
      
      totalKilos = kgMorango + kgMaca;
      
      if (precoTotal > 25 || totalKilos > 8){
        precoTotal -= (precoTotal * 0.10); 
      }
      
      else {
          System.out.println ("Voce não tem desconto");
      }
      System.out.println ("O valor total a ser pago é " + precoTotal);
  }
}
