import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	    double nota1, nota2, media;
	    String aluno;

		System.out.println("Qual é o nome do aluno: ");
		aluno = leitor.next();
		
		do {
		System.out.println("Informe a nota 1: ");
		nota1 = leitor.nextDouble();
		
		System.out.println("Informe a nota 2: ");
		nota2 = leitor.nextDouble();
		
		}
		
		while (nota1 > 10 || nota2 > 10);
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("A media do aluno " + aluno + " é " + media);
	}
}
