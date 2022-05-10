import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		double base, altura, area;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual é o tamanho da base do retângulo em metros? ");
		base = leitor.nextDouble();
		
		System.out.println("Qual é o tamanho da altura do retângulo em metros? ");
		altura = leitor.nextDouble();
		
		area = base * altura;
		
		System.out.println("O tamanho da base é " + base + "m e o tamanho da altura é " + altura + "m");
		System.out.println("A área do retângulo é de " + area + "m2");
	}
}



