import java.util.Scanner;

	class pessoas {
		    
		String nome;
        int idade;
        float peso, altura, imc;
		    
	}

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		pessoas p1;
        p1 = new pessoas();
		
		System.out.print("Informe o nome da pessoa: ");
        p1.nome = leitor.next();
        System.out.print("Informe a idade: " );
        p1.idade = leitor.nextInt();
        System.out.print("Informe o peso em Kg: ");
        p1.peso = leitor.nextFloat();
        System.out.print("Informe a altua em m: ");
        p1.altura = leitor.nextFloat();
        
        p1.imc = p1.peso / (p1.altura * p1.altura);
        
        System.out.println("Seu nome é " + p1.nome + " sua idade é " + p1.idade + " anos" + " seu peso é " + p1.peso + "Kg" +
        " a sua altura é " + p1.altura + "m" + " seu IMC é " + p1.imc);
	}
}

