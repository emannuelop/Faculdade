import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    double a, b, c;

    Scanner leitor = new Scanner (System.in);

      System.out.println ("Digite um valor de um lado do triângulo: ");
      a = leitor.nextDouble ();

      System.out.println ("Digite um valor de um lado do triângulo: ");
      b = leitor.nextDouble ();

      System.out.println ("Digite um valor de um lado do triângulo: ");
      c = leitor.nextDouble ();

    if (a < (b + c) && b < (a + c) && c < (a + b)){
        System.out.println("Sim os falores informados forma um triângulo");
        if (a == b && b == c){
            System.out.println("É um triângulo equilátero");
        }
        else if (a == b || b == c || a == c){
            System.out.println("É um triângulo isósceles");
        }
        else {
            System.out.println("É um triângulo escaleno ");
        }
    }    
    else {
		System.out.println("Os valores informados não forma um triângulo");
    }
  }
}

