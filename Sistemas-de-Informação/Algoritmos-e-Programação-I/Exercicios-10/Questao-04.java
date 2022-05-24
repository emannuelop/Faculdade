import java.util.Scanner;

public class Main
{

    public static int soma (int valor1, int valor2) {
    
    int maior, menor, soma=0;
    
    if (valor1 > valor2) {
        maior = valor1;
        menor = valor2;
    }
    
    else {
        maior = valor2;
        menor = valor1;
    }
    
    while (maior >= menor) {
        soma = soma + maior;
        maior--;
    }
    
    return soma;
    
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
    int valor1, valor2, resultado;  
  
    System.out.print("Digite um numero inteiro, não negativo: ");
	valor1 = leitor.nextInt();
	
	System.out.print("Digite um numero inteiro, não negativo: ");
	valor2 = leitor.nextInt();
	
	resultado = soma(valor1, valor2);
	
	System.out.print(resultado);
  
    }
   
}

