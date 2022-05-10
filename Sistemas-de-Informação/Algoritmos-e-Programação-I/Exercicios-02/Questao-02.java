import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		double celsius, kelvin, farenheit;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digita a sua temperatura em celsius: ");
		celsius = leitor.nextDouble();
		
		kelvin = celsius + 273;
		farenheit = (celsius * 1.8) + 32;
		
		System.out.println("A sua temperatura em celsius é " + celsius + "Cº");
		System.out.println("A sua temperatura em kelvin é " + kelvin + "Kº");
		System.out.println("A sua temperatura em farenheit é " + farenheit + "Fº");
	}
}

