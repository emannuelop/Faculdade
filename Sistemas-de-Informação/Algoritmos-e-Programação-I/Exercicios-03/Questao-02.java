import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    String produto;
    double quantidade, preco, precoTotal;

    Scanner leitor = new Scanner (System.in);

      System.out.println ("Nome do produto: ");
      produto = leitor.next ();
      
      System.out.println ("Qual é a quantidade do produto: ");
      quantidade = leitor.nextDouble ();
      
      System.out.println ("Qual é o preço do produto: ");
      preco = leitor.nextDouble ();
      
      precoTotal = (quantidade * preco);
      
      if (quantidade <= 5){
          precoTotal -= (precoTotal * 0.02);  
      }
      
      else if (quantidade <= 10) {
          precoTotal -= (precoTotal * 0.03);  
      }
      
      else {
          precoTotal -= (precoTotal * 0.05);  
      }
      
    System.out.println ("O produto " + produto + " o total a ser pago é " + precoTotal);
  }
}



