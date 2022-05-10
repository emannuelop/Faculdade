import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		double emprestimo, parcelas, valorjuros, valorparcelas, valortotal;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual valor você quer pegar de empréstimo? ");
		emprestimo = leitor.nextDouble();
		System.out.println("O juros do empréstimo é de 20%");
		System.out.println("Em quantas parcelas você quer pagar?");
		parcelas = leitor.nextDouble();
		
		valorjuros = (emprestimo * 20) / 100;
		valorparcelas = (valorjuros + emprestimo) / parcelas;
		valortotal = valorjuros + emprestimo;
		
		System.out.println("Você pegou R$" + emprestimo + " de emprestimo," + " vai pagar o total de R$" + 
		valortotal + " o juros é de R$" + valorjuros + " e ficou " + parcelas + " parcelas de R$" + valorparcelas);
		
	}
}


