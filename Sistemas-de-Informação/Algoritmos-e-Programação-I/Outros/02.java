/****************************************************************************************
'''Faça um programa, utilizando os operadores lógicos, que:

a. Pergunte ao usuário o nome, a idade e se ele é estudante de Java
i. Permita apenas usuários maiores de 18 anos reservarem um ingresso para
um clube de festas;

b. Se o usuário for maior de idade, permita que ele escolha entre a entrada padrão, que
custa R$20,00, e a entrada VIP, que custa R$50,00.
c. Conceda um desconto de 50% na entrada VIP apenas para os estudantes de Python;
d. Nos casos em que a pessoa for menor de idade, mostre na tela quantos anos faltam
para o usuário ter 18 anos e, consequentemente, ter acesso ao clube.'''
*****************************************************************************************/

import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

    String nome;
    int idade, falta, estudante, entrada;

    Scanner leitor = new Scanner (System.in);

      System.out.println ("Qual é seu nome: ");
      nome = leitor.next ();
      
      System.out.println ("Qual é sua idade: ");
      idade = leitor.nextInt ();
      
      falta = (18 - idade);
      
      if (idade >= 18) {
        System.out.println ("Você é estudante Sim digite[1] ou Não digite[2]?");
        estudante = leitor.nextInt ();
        System.out.println("Quer entrada vip(R$50) digite[1] ou padrão(R$20) digite[2]? ");
        entrada = leitor.nextInt ();
        
        if (estudante == 1 && entrada == 1){
            System.out.println(nome + " só vai pagar R$25 porque você é estudante");
        }   
        else if (estudante == 2 && entrada == 1){
            System.out.println(nome + " vai pagar R$50 porque você não é estudante");
        }    
        else if (entrada == 2 || estudante == 1 || estudante == 2){
            System.out.println(nome + " vai pagar R$20");
        }
      }
      
      else {
          System.out.println(nome + " não pode entrar pois tem menos que 18 anos, falta " + falta 
          + " anos para entrar");
      }
  }
}


