import java.util.Scanner;

    class mercado {
        String nome;
        float precoCom, precoVen;
    }

public class Main
{
    public static void main(final String[] args)
    {
        Scanner leitor = new Scanner(System.in);
        mercado[] vet;  
            
            int escolha;
            float lucro=0;
            
            vet = new mercado[3];
            
            for(int i=0; i<3; i++) {
                vet[i] = new mercado();    
            }

            for(int i=0; i<3; i++) {
                System.out.print("Nome do produto: ");
                vet[i].nome = leitor.nextLine();
                
                System.out.print("Preço de compra: " );
                vet[i].precoCom = leitor.nextFloat();
                
                System.out.print("Preço de venda: " );
                vet[i].precoVen = leitor.nextFloat();
                leitor.nextLine();
            }
            
            for(int i=0; i<3; i++) {
                System.out.println(vet[i].nome + " Preço de compra[" + vet[i].precoCom +
                "] \tPreço de venda[" + vet[i].precoVen + "]" + " Produto " + i);
            }
            
            System.out.print("\nEscolha um produto pelo o numero: " );
            escolha = leitor.nextInt();
            
            if (escolha == 0) {
                lucro = vet[0].precoVen - vet[0].precoCom;
                System.out.print("O lucro do produto " + vet[0].nome + " é R$" + lucro);
            }
               
            else if (escolha == 1) {
                lucro = vet[1].precoVen - vet[1].precoCom;
                System.out.print("O lucro do produto " + vet[1].nome + " é R$" + lucro);
            }
               
            else if (escolha == 2) {
                lucro = vet[2].precoVen - vet[2].precoCom;
                System.out.print("O lucro do produto " + vet[2].nome + " é R$" + lucro);  
            }
               
            else 
            System.out.print("Esse produto não existe");

	}
}

