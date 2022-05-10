import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    double maior, menor, media, numero, soma=0, quantidade=0;

		System.out.println("Digite um número natural (ou negativo para sair): ");
		numero = leitor.nextDouble();
		
		maior = numero;
		menor = numero;
		
		while (numero >= 0) {
		   quantidade = quantidade + 1;
		   soma = soma + numero;
		   
		   if (numero > maior) {
		       maior = numero;
		   }
		   
		   if (numero < menor) {
		       menor = numero;
		   }
		   
		   System.out.println("Digite um número natural (ou negativo para encerrar): ");
		   numero = leitor.nextDouble();
		}
		
		System.out.println("O maior valor é: " + maior);
		System.out.println("O menor valor é: " + menor);
		System.out.println("A média dos valores é: " + soma/quantidade);
	}
}
