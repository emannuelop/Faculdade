import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		double kmin, kmfi, tempoin, tempofi, media, delt, dels;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual é sua distancia incial em Km: ");
		kmin = leitor.nextDouble();
		System.out.println("Qual é sua distancia final em Km: ");
		kmfi = leitor.nextDouble();
		System.out.println("Que horas você saiu? ");
		tempoin = leitor.nextDouble();
		System.out.println("Que horas você chegou? ");
		tempofi = leitor.nextDouble();
		
		delt = kmfi - kmin;
		dels = tempofi - tempoin; 
		media = delt / dels;
		System.out.println("Você percorreu uma distancia de " + delt + "km" + " e gastou " + dels + "h");
		System.out.println("A sua velocida media é " + media + " Km por hora");
	}
}



