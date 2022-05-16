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
            
            int menordeidade=0;
            
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
            
            if (vet[0].ano == vet[1].ano && vet[0].ano == vet[2].ano)
                System.out.print("\n" + vet[0].nome + " , " + vet[1].nome + " e " + vet[2].nome + " são do mesmo ano");
            
            else if (vet[0].ano == vet[1].ano)
                System.out.print("\n" + vet[0].nome + " e " + vet[1].nome + " são do mesmo ano");

            else if (vet[0].ano == vet[2].ano)
                System.out.print("\n" + vet[0].nome + " e " + vet[2].nome + " são do mesmo ano");
                
            else if (vet[1].ano == vet[2].ano)
                System.out.print("\n" + vet[1].nome + " e " + vet[2].nome + " são do mesmo ano");
                
            
            if (vet[0].mes == vet[1].mes && vet[0].mes == vet[2].mes)
                System.out.print("\n" + vet[0].nome + " , " + vet[1].nome + " e " + vet[2].nome + " são do mesmo mês");
            
            else if (vet[0].mes == vet[1].mes)
                System.out.print("\n" + vet[0].nome + " e " + vet[1].nome + " são do mesmo mês");

            else if (vet[0].mes == vet[2].mes)
                System.out.print("\n" + vet[0].nome + " e " + vet[2].nome + " são do mesmo mês");
                
            else if (vet[1].mes == vet[2].mes)
                System.out.print("\n" + vet[1].nome + " e " + vet[2].nome + " são do mesmo mês");
                
            
            System.out.print("\nTem " + menordeidade + " pessoas menores de idade");
	}
}

