import java.util.Scanner;

class  notas {
        float nota1, nota2, media;
    }

public class Main
{
    public static float statusAluno (float m) {
    
    int contAl = 0;
    
    if(m >= 6){
        contAl = contAl + 1;
    }
    
    return(contAl);
    
    }

    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    
    notas[] aluno = new notas[5];
	float resMedia=0, media=0;
    
    for(int i = 0; i < 5; i++){
		    aluno[i] = new notas();
	}
    
    for(int i = 0; i < 5; i++){
		    System.out.print("\nNota 1 do " + (i+1) + "º aluno: " );
		    aluno[i].nota1 = leitor.nextFloat();
		    
		    System.out.print("Nota 1 do " + (i+1) + "º aluno: " );
		    aluno[i].nota2 = leitor.nextFloat();
		    
		    aluno[i].media = (aluno[i].nota1 + aluno[i].nota2) / 2;
		    
		    resMedia = aluno[i].media;
		    
		    media = media + statusAluno(resMedia);
	}
  
    System.out.println("Alunos que passaram acima de média: " + media);  
  
    }
}

