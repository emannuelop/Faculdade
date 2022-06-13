/*
Escreva um programa em Java que permita ao usuário informar o nome e as notas A1 e A2 dos alunos de uma turma da Unitins. 
A quantidade de alunos deverá ser informada pelo usuário.
O programa deve ter funções para:
- calcular e retornar a média de um aluno
- calcular e retornar a média geral da turma
- retornar o nome do aluno com maior média
- retornar a quantidade de alunos aprovados (média maior ou igual a 6)
- imprimir na tela o nome dos alunos reprovados direto (média menor que 4)
*/

import java.util.Scanner;

class Turma 
    {
        
    String nome;
    double a1, a2;
    
    }

public class Main
{
    
    public static double mediaAluno (Turma aluno)
    {
        
        return (aluno.a1 + aluno.a2) / 2;
       
    }
    
    public static double mediaTurma (Turma[] sala, int quantidade)
    {
        
        double soma=0;
        for (int i = 0; i < quantidade; i++) 
        {
            soma = soma + mediaAluno(sala[i]);
        }
        
        return soma / quantidade;
        
    }
    
    public static String AlunoMaior (Turma[] sala)
    {
        double maiorMedia = mediaAluno(sala[0]);
        int posicaoMaior=0;
        for (int i = 1; i < sala.length; i++) 
        {
            if (mediaAluno(sala[i]) > maiorMedia) 
            {
                maiorMedia = mediaAluno(sala[i]);
                posicaoMaior = i;
            }
        }
        
        return sala[posicaoMaior].nome;
    }
    
    public static int Aprovados (Turma[] sala)
    {
        int cont=0;
        
        for (int i=0; i < sala.length; i++) 
        {
            if (mediaAluno(sala[i]) >= 6)
            {
                System.out.println("O aluno " + sala[i].nome + " foi aprovado!!");
                cont++;
            }
        }
        
        return cont;
    }
    
    public static int Reprovados (Turma[] sala)
    {
        int cont=0;
        
        for (int i=0; i < sala.length; i++) 
        {
            if (mediaAluno(sala[i]) < 4)
            {
                System.out.println("O aluno " + sala[i].nome + " foi aprovado!!");
                cont++;
            }
        }

        return cont;

    }
    
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    int escolha, quantidade, aluno;
    double media1, media2, aprovado, reprovado;
    boolean menu = true;
    
    System.out.print("Informe a quantidade de alunos:");
    quantidade = leitor.nextInt();
    
    Turma[] sala  = new Turma[quantidade];
    
    for (int i = 0; i < quantidade; i++) 
    {
        sala[i] = new Turma();
    }
    
    for (int i = 0; i < quantidade; i++)
    {
        leitor.nextLine();
        System.out.println("Informe o nome do aluno: ");
        sala[i].nome = leitor.nextLine();
        
        System.out.println("Informe a nota a1: ");
        sala[i].a1 = leitor.nextDouble();
        
        System.out.println("Informe a nota a2: ");
        sala[i].a2 = leitor.nextDouble();
    }
    
    while (menu) 
    {
        System.out.println("-------------------------------------");
        System.out.println("[1]: Media de um aluno");
        System.out.println("[2]: Media da turma");
        System.out.println("[3]: Aluno com maior média");
        System.out.println("[4]: Alunos aprovados");
        System.out.println("[5]: Alunos reprovados");
        System.out.println("[6]: Fechar o programa");
        System.out.println("-------------------------------------");

        System.out.print("Digite uma opção entre 1 e 6: ");
        escolha = leitor.nextInt();
        
        switch (escolha){
            case 1: 
                System.out.print("Qual aluno voce quer a media?");
                aluno = leitor.nextInt();
                media1 = mediaAluno(sala[aluno]);
                System.out.println(media1);
                break;
            case 2: 
                media2 = mediaTurma(sala, quantidade);
                System.out.println(media2);
                break;
            case 3: 
                System.out.println(AlunoMaior(sala));
                break;
            case 4: 
                aprovado = Aprovados(sala);
                System.out.println(aprovado);
                break;
            case 5:
                reprovado = Reprovados(sala);
                System.out.println(reprovado);
                break;
            case 6:
                menu = false;
                break;
        }
        
    }
    
    }
}


