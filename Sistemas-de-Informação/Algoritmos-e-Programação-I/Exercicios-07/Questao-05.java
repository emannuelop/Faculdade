import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	     int alunos, provaEFrenquecia=5, prova=4;
	     double media;
	     
	     System.out.print("Informe a quantidade de alunos: ");
	     alunos = leitor.nextInt();
	     
	     float matriz[][] = new float[alunos][provaEFrenquecia];
	     String [][] resultado = new String[alunos][2];
	     
	     for (int L=0; L<alunos; L++) {
	         media = 0;
	         
	         for(int C=0; C<provaEFrenquecia; C++) {
	             
	            if (C == prova) {
	                System.out.print("Informe a frequência do aluno " + L + ": ");
	                matriz[L][C] = leitor.nextFloat();
	            }
	            
	            else {
	                System.out.print("Informe a nota " + C + " do aluno " + L + ": ");
	                matriz[L][C] = leitor.nextFloat();
	                media = media + matriz[L][C];
	            }
	            
	            if ((media/prova) >= 6 && matriz[L][C] >= 75) {
	                resultado[L][0] = "Aluno " + L;
	                resultado[L][1] = "Aprovado por nota e frequência!";
	            }
	            else if ((media/prova) < 6 && matriz[L][C] >= 75) {
	                resultado[L][0] = "Aluno " + L;
	                resultado[L][1] = "Reprovado por nota!";
	            }
	            else if ((media/prova) >= 6 && matriz[L][C] < 75) {
	                resultado[L][0] = "Aluno " + L;
	                resultado[L][1] = "Reprovado por frequência!";
	            }
	            else {
	                resultado[L][0] = "Aluno " + L;
	                resultado[L][1] = "Reprovado por nota e frequência!";
	            }
	            
	         }
	         System.out.print("\n");
	     }
	     
	     for(int J=0; J<alunos; J++) {
	         
	         for(int I=0; I<provaEFrenquecia; I++) {
	             System.out.print(" | " + matriz[J][I]);
	         }System.out.print("\n");
	     }
	     
	     for(int M=0; M<alunos; M++) {
	         
	         for(int N=0; N<2; N++) {
	             System.out.print("\n" + resultado[M][N]+ "\t");
	         }System.out.print("\n");
	     }
	     
	}
}

