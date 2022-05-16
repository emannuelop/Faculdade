import java.util.Scanner;

    class pessoas {
        String nome;
        int idade, ano, mes, dia;
    }

public class Main
{
    public static void main(final String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        pessoas[] vet;  
            
            int menordeidade=0, mesEscolha, anoEscolha;
            
            vet = new pessoas[3];
            
            for(int i=0; i<3; i++) {
                vet[i] = new pessoas();    
            }

            for(int i=0; i<3; i++) {
                System.out.print("Nome da pessoa: ");
                vet[i].nome = leitor.nextLine();
                
                System.out.print("Idade: " );
                vet[i].idade = leitor.nextInt();
                
                System.out.print("Ano de nascimento: " );
                vet[i].ano = leitor.nextInt();
                
                System.out.print("Mês de nascimento: " );
                vet[i].mes = leitor.nextInt();
                
                System.out.print("Dia de nascimento: " );
                vet[i].dia = leitor.nextInt();
                leitor.nextLine();
            }
            
            for(int i=0; i<3; i++) {
                if (vet[i].idade < 18)
                menordeidade++;
            }
            
            System.out.print("Escolha um mês: ");
            mesEscolha = leitor.nextInt();
            
            System.out.print("Escolha um ano: ");
            anoEscolha = leitor.nextInt();
            
            
            for(int i=0; i<3; i++) {
                if (mesEscolha == vet[i].mes) {
                System.out.print(" | " + vet[i].nome + " | ");
                }
            }
            
            for(int i=0; i<3; i++) {
                if (anoEscolha == vet[i].ano) {
                System.out.print("\n | " + vet[i].nome + " | ");
                }
            }
            
            System.out.print("\nTem " + menordeidade + " pessoas menores de idade");
	}
}


