import java.util.Scanner;

class banco {
    String nome;
    float valorIncial, saldoDevedor1, saldoDevedor2,  juros, valorParcelas;
    int parcelas;
}

class parcelas {
    float parcelaOriginal, parcelaPaga, status, numero;
}

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);
        banco emprestimo = new banco(); 

        boolean escolha = true;
        int opcao, atraso, numparcela, cont=0;

        System.out.println("Informe o seu nome: ");
        emprestimo.nome = leitor.next();

        System.out.println("Informe o valor do emprestimo: ");
        emprestimo.valorIncial = leitor.nextFloat();

        System.out.println("Informe o juros: ");
        emprestimo.juros = leitor.nextFloat();

        System.out.println("Informe a quantidade de parcelas: ");
        emprestimo.parcelas = leitor.nextInt();

        parcelas[] parcelamento = new parcelas[emprestimo.parcelas];

        emprestimo.saldoDevedor1 = (emprestimo.valorIncial / 100) * emprestimo.juros;

        emprestimo.saldoDevedor2 = emprestimo.saldoDevedor1 + emprestimo.valorIncial;

        emprestimo.valorParcelas = emprestimo.saldoDevedor2 / emprestimo.parcelas;

        for(int i = 0; i < emprestimo.parcelas; i++) 
        {
            parcelamento[i] = new parcelas();
            parcelamento[i].parcelaOriginal = emprestimo.parcelas;
            parcelamento[i].parcelaPaga = 0;
            parcelamento[i].status = 0;
            parcelamento[i].numero = i+1;
        }

        System.out.println("Valor total do saldo devedor R$" + emprestimo.saldoDevedor2);
        System.out.println("Voce parcelou em " + emprestimo.parcelas + " parcelas e ficou no valor de R$"  + emprestimo.valorParcelas + " cada parcela");

        while(escolha == true)
        {
            System.out.println("-----------------------------------");
            System.out.println("[1] Valor total devido");
            System.out.println("[2] Pagamento de uma parcela");
            System.out.println("[3] Parcelas não pagas");
            System.out.println("[4] Lucro do banco");
            System.out.println("[5] Status de cada parcela");
            System.out.println("[6] Sair");
            System.out.println("-----------------------------------");
            opcao = leitor.nextInt();

            switch(opcao)
            {
                case 1: System.out.println(emprestimo.saldoDevedor2);
                        break;
                case 2: 
                        System.out.println("Informe o numero da parcela: ");
                        numparcela = leitor.nextInt();
                        System.out.println("Parcela foi paga em atraso? Sim[1] Não[2] ");
                        atraso = leitor.nextInt();
                        if (atraso == 1)
                        {
                            parcelamento[numparcela - 1].parcelaPaga = ((emprestimo.valorParcelas / 100) * 10)  + emprestimo.valorParcelas;
                            emprestimo.saldoDevedor2 = emprestimo.saldoDevedor2 - parcelamento[numparcela - 1].parcelaPaga - emprestimo.valorParcelas;
                            System.out.println(parcelamento[numparcela - 1].parcelaPaga);
                        }
                        else if (atraso  == 2)
                        {
                            emprestimo.saldoDevedor2 = emprestimo.saldoDevedor2 - parcelamento[numparcela - 1].parcelaPaga - emprestimo.valorParcelas;
                        }
                        break; 
                case 3: for (int i = 0; i < emprestimo.parcelas; i++) 
                        {
                            if (parcelamento[i].parcelaPaga == 0)
                            {
                                cont++;
                            }
                        }
                        System.out.println("Parcelas não pagas são " + cont);
                        break; 
                case 4: System.out.println("O lucro do banco é R$" + emprestimo.saldoDevedor1);
                        break;
                case 5: for (int i = 0; i < emprestimo.parcelas; i++) 
                        {
                            if (parcelamento[i].parcelaPaga == 0)
                            {
                                System.out.println("Parcelas não pagas");   
                            }
                            else
                            {
                                System.out.println("Parcela paga");
                            }
                        }
                        break;
                case 6: escolha = false;
                        break;
            }            
        }

    }
}

