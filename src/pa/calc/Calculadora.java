package pa.calc;

public class Calculadora {

	public static void main(String[] args) {
		
/*		// OperEx Example
		OperEx opex=new OperEx();
		double resEx = opex.oper(1, 3);
		System.out.println(resEx);
*/
		
		// OperHVA Example
		OperHVA OperHVA = new OperHVA();
		double resHVA=OperHVA.oper(3,100);
		System.out.println(resHVA);
		
		// OperExAn
        OperExAn opexan = new OperExAn();
        double resexan = opexan.oper(1, 2);
		System.out.println(resexan);

		// - OperPA - Paulo
	    OperPA opePA=new OperPA();
	     double resPA = opePA.oper(2, 3);
	    System.out.println("Paulo: (2,3)"+resPA);
	    
	    // OperSum
	    OperSum sum = new OperSum();
	    double sumResult = sum.oper(1, 2);
	    System.out.println("The sum of the 2 numbers is: " + sumResult);
	    
		// - OperSi - Simone
	     OperSi opex=new OperSi();
	     double res0X = opex.oper(2,15 );
	     System.out.println(res0X);
	}
}
