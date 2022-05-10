import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    
	     double [] vartemp = new double[101];
	     double [] vartemp2 = new double[101];
	     double temmin=100, temmax=0, diafrio=0, diaquente=0, varvar, varmax=0, diavarmax=0, 
	     diavarmin=0, varmin=100;
	     
	     for (int i=1; i <=100; i++) {
	        System.out.print("Informe a temperatura mínima do dia " + i + ": ");  
	        vartemp[i] = leitor.nextDouble();
	        
	        System.out.print("Informe a temperatura máxima do dia " + i + ": ");  
	        vartemp2[i] = leitor.nextDouble();
	        
	        for (int j=0; j <100; j++) {
	            
	            if (vartemp2[i] > temmax) {
	                temmax = vartemp2[i];
	                diaquente = i;
	            }
	        }
	        
	        for (int k=0; k <100; k++) {
	            
	            if (vartemp[i] < temmin) {
	                temmin = vartemp[i];
	                diafrio= i;
	            }
	        }
	        
	        for (int m=0; m <100; m++) {
	            
	            varvar = vartemp2[i] - vartemp[i];
	            
	            if (varvar > varmax) {
	                varmax = varvar;
	                diavarmax = i;
	            }
	            
	            else if (varvar < varmin) {
	                varmin = varvar;
	                diavarmin = i;
	            }
	        }
	        
	    }
	    
	    System.out.print("\n A temperatura maxima foi de: " + temmax + " no dia: " + diaquente);
	    System.out.print("\n A temperatura mínima foi de: " + temmin + " no dia: " + diafrio);
	    System.out.print("\n O maior variação de temperatura foi: " + varmax + " no dia: " + diavarmax);
	    System.out.print("\n A temperatura mais caiu em relação ao dia anterior foi " + varmin + " no dia: " + diavarmin);
	    
	}
}

