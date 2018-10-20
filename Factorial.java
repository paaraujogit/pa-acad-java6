import java.util.ArrayList;

public class Factorial {

	 	public static void Calcular(int n) {
			
		 // size of ArrayList 
		 //int n = 7;
		 
		 //declarar ArrayList com tamanho "n" 
		 ArrayList<Integer> factorial = new ArrayList<Integer>(n); 

		 //Preencher array com inteiros de 1 até "n"
		 for (int i=1; i<=n; i++) {
			 factorial.add(i); 
		 }
		
		 //Loop

		//public static  calcularFactorial() {
			int m = 1;
			for (int values: factorial) {
				m *= values;

			}
		 System.out.println(m);
		}
} 	
		
		 //Loop recursivo
		 /*	   private int calcPower(int num1, int num2, int cacl) {
			   if (num2 ==0)
				   return 1;
			   else if (num2 ==1)
				   return cacl;
			   else 
				   cacl *= num1;    
			   cacl= calcPower(num1, num2-1, cacl);
			    return cacl;
		   }
		 */
		 




