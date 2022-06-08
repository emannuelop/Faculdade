/*
01 - Considere uma feira de carros que necessita de um sistema para controlar  o fluxo de carros e as vendas.
Para tanto deve permitir a cada expositor informar os dados do seu veículo (cada veículo terá seus dados armazenados em um registro):
Marca, modelo, ano, valor pedido para venda e valor da compra realizada, quando for o caso (inicialmente deve ser zero).

O programa deve permitir o armazenamento de 100 carros (deve ser utilizado um array de registros) e
controlar a quantidade de carros inseridos até o momento.

As funções de inserir um carro, realizar uma venda, calcular o total de vendas realizadas no dia, 
verificar se um carro foi vendido (quando o valor da compra for diferente de zero), 
imprimir os dados na tela e calcular o lucro da venda de um carro devem ser implementadas cada uma em uma função diferente.

O programa deve conter, ainda, uma função que apresenta um menu de opções, captura a opção informada pelo usuário e retorna a opção escolhida.

Bom trabalho a todos.
*/
import java.util.Arrays;
import java.util.Scanner;

class veiculos {
     
    String marca, modelo;
    int ano;
    float valorvenda, valorcompra=0; 
     
    }
    
public class Main
{
    
    public static int inserir (veiculos [] carros)
    {
    Scanner leitor = new Scanner(System.in);
        
    int sair, cont=0;
	
	for (int i=0; i<100; i++) 
	{
        
        System.out.print("Informe a marca do veículo: ");
	    carros[i].marca = leitor.next();
	
	    System.out.print("Informe o modelo do veículo: ");
	    carros[i].modelo = leitor.next();
	
	    System.out.print("Informe o ano do veículo: ");
	    carros[i].ano = leitor.nextInt();
	
	    System.out.print("Informe o valor de venda do veículo: ");
	    carros[i].valorvenda = leitor.nextFloat();
	    //System.out.print(carros[0].ano);
	    cont++;
	    
	    System.out.print("Deseja Continuar? 1-SIM/2-NÃO: ");
	    sair = leitor.nextInt();
	    
	        if (sair==2) {
	            
    	        break;
    	        
    	    }

    }
    
    return cont;
    
    }
    
    public static float venda (veiculos [] carros, int numcarro){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        carros[numcarro].valorcompra = leitor.nextFloat();
        return carros[numcarro].valorcompra ;
        
    }
    
    public static int totalVendas (veiculos [] carros){
        int totalVendass = 0;
        for (int i = 0; i < carros.length; i++ ){
            if (carros[i].valorcompra != 0){
                totalVendass = totalVendass + 1;
            }
        }
        return totalVendass;
    }
    
    public static float lucroVenda (veiculos [] carros, int numcarro){
        float lucroVenda = 0;
        lucroVenda = carros[numcarro].valorcompra - carros[numcarro].valorvenda;
        return lucroVenda;
    }
    
    public static String imprimirRecibo (veiculos [] carros, int numcarro){
        String recibo;
        if(carros[numcarro].valorcompra == 0){
            recibo = "Este carro não foi vendido ainda!\n";
            return recibo;
        } else{
            recibo = "O carro de modelo " + carros[numcarro].modelo + " foi comprado por " + carros[numcarro].valorcompra + ".\n";
            return recibo;
        }
    }
    
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    veiculos [] carros = new veiculos[100];
  
    for(int i = 0; i < 100; i++){
	    carros[i] = new veiculos();
	}
    
    int escolha, quantidade, numcarro, quantidade3;
    float quantidade2, lucroVenda;
    String ticket_recibo;
    boolean menu = true;
    
    while (menu) {
    System.out.println("------------------------");
    System.out.println("[1]: Inserir carros");
    System.out.println("[2]: Realizar vendas");
    System.out.println("[3]: Total de vendas realizadas no dia R$");
    System.out.println("[4]: Imprimir recibo");
    System.out.println("[5]: Lucro de uma venda");
    System.out.println("[6]: Fechar o programa");
    System.out.println("------------------------");

    System.out.print("Digite uma opção entre 1 e 6: ");
    escolha = leitor.nextInt();
    
    switch (escolha) {
        case 1: 
            quantidade = inserir (carros);
            break;
        case 2: 
            System.out.print("Qual é o numero do carro?");
            numcarro = leitor.nextInt();
            quantidade2 = venda(carros, numcarro);
            System.out.printf("O carro %s foi vendido por %.2f.\n", carros[numcarro].modelo , quantidade2);
            break;
        case 3: 
            quantidade3 = totalVendas(carros);
            System.out.println("Total de carros vendidos: " + quantidade3);
            break;
        case 4: 
            System.out.print("Qual é o numero do carro?");
            numcarro = leitor.nextInt();
            ticket_recibo = imprimirRecibo(carros, numcarro);
            System.out.println(ticket_recibo);
            break;
        case 5:
            System.out.print("Qual é o numero do carro?");
            numcarro = leitor.nextInt();
            lucroVenda = lucroVenda(carros, numcarro);
            System.out.println(lucroVenda);
            break;
        case 6:
            menu = false;
            break;
        }
    
    }
        
    }
}




