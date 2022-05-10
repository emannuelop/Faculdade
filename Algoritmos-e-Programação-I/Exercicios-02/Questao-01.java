import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		int totalvt, vtbrancos, vtnulos, vtvalidos;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos votos tiveram no total? ");
		totalvt = leitor.nextInt();
		System.out.println("Quantos votos brancos tiveram? ");
		vtbrancos = leitor.nextInt();
		System.out.println("Quantos votos nulos tiveram? ");
		vtnulos = leitor.nextInt();
		System.out.println("Quantos votos validos tiveram? ");
		vtvalidos = leitor.nextInt();
		
		System.out.println("O percentual de votos brancos foi " + (vtbrancos * 100) / totalvt + "%");
		System.out.println("O percentual de votos nulos foi " + (vtnulos * 100) / totalvt + "%");
		System.out.println("O percentual de votos validos foi " + (vtvalidos * 100) / totalvt + "%");
		System.out.println(totalvt + " pessoas votaram");
	}
}


