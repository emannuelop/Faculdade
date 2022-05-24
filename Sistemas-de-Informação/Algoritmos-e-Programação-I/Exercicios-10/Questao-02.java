import java.util.Scanner;

public class Main
{

    public static float temperatura (float celsius) {
    
    float kelvin=0;    
        
    kelvin = celsius + 273;
    
    return kelvin;
    
}

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float  celsius, resultado;
	    
        System.out.print("Digita a sua temperatura em celsius: ");
		celsius = leitor.nextFloat();
		
		resultado = temperatura(celsius);
		
		System.out.println("A sua temperatura em celsius é " + celsius + "Cº");
		System.out.println("A sua temperatura em kelvin é " + resultado + "Kº");
    }
   
}

