import java.util.Scanner;

	class boi {
		    
		String nome;
        int idade;
        double peso, arrobas;
		    
	}

public class Main
{
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		boi b1;
        b1 = new boi();
		
		System.out.print("Informe o nome do boi: ");
        b1.nome = leitor.next();
        
        System.out.print("Informe o peso do boi em Kg: ");
        b1.peso = leitor.nextDouble();
        
		System.out.print("Informe a idade do boi em meses: ");
        b1.idade = leitor.nextInt();
        
        b1.arrobas = b1.peso/15;
        
        if (b1.idade <= 12) {
            System.out.print("O boi " + b1.nome + ", ele é um bezerro, o peso em Kg é " 
            + b1.peso + " e em arrobas é " + b1.arrobas);
        }
        
        else if (b1.idade >= 13 && b1.idade <= 24) {
            System.out.print("O boi " + b1.nome + ", ele é um garrote, o peso em Kg é " 
            + b1.peso + " e em arrobas é " + b1.arrobas);
        }
        
        else 
            System.out.print("O boi " + b1.nome + ", ele é um erado, o peso em Kg é " 
            + b1.peso + " e em arrobas é " + b1.arrobas);
        
        
	}
}


