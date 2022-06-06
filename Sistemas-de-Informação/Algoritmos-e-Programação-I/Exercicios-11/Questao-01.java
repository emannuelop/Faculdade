import java.util.Scanner;

class atleta {
        String nome;
        int idade;
        float altura, peso, imc;
    }

public class Main
{

    public static float imc (float altura, float peso) {
    
    float imc=0;
    
    imc = peso /(altura * altura);
    
    return imc;
    
    }

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    atleta p1;
    
    p1 = new atleta();
        
    float resultado;
  
    System.out.print("Digite o seu nome: ");
	p1.nome = leitor.nextLine();
    
    System.out.print("Digite a sua idade: ");
	p1.idade = leitor.nextInt();
	
	System.out.print("Digite a sua altura: ");
	p1.altura = leitor.nextFloat();
	
	System.out.print("Digite a sua peso: ");
	p1.peso = leitor.nextFloat();
	
	resultado = imc(p1.altura, p1.peso);
	
	System.out.println("A pessoa " + p1.nome + " com a idade de " + p1.idade + " anos " + "altura de " + p1.altura + "m e o peso de " + p1.peso + "Kg");
	System.out.print("O seu IMC é: " + resultado);
  
    }
   
}


