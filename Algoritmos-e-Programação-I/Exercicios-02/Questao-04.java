import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		double peso, altura, IMC;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual é seu peso em Kg? ");
		peso = leitor.nextDouble();
		
		System.out.println("Qual é sua altura em m? ");
		altura = leitor.nextDouble();
		
		IMC = peso / (altura * altura);
		
		System.out.println("Você " + peso + "Kg" + " e a sua altua é " + altura + "m");
		System.out.println("O seu IMC é " + IMC);
	}
}


