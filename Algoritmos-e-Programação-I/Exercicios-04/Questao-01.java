import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    int valor, soma=0;

		System.out.println("Digite um número inteiro: ");
		valor = leitor.nextInt();
		
		if (valor > 0) {
		for(;valor > 0; valor--){
		    soma = soma + valor;
		    
		    System.out.print(valor + "+");
		}
		
		System.out.println("=" + soma);
		
		}
		
		else {
		    System.out.println("Não pode valor negativo, só lamento");
		}
	}
}

