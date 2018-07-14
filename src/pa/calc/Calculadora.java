package pa.calc;

public class Calculadora {

	public static void main(String[] args) {
		
/*
		// ToDo - All Students Must Implement one Operation
		// OperEx Example
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
	    
		// - OperJV - JV
	    OperJV opeJV=new OperJV();
	     double resJV = opePA.oper(3, 4);
	    System.out.println("JV: (3,4)"+resJV);
	    
	    
	    
	    // OperSum
	    OperSum sum = new OperSum();
	    double sumResult = sum.oper(1, 2);
	    System.out.println("The sum of the 2 numbers is: " + sumResult);
	    
		// - Oper0X - Simone
	     OperSi opex=new OperSi();
	     double res0X = opex.oper(5, 4);
	     System.out.println(res0X);

             // Oper Plano Cartesiano - Rodrigo .
             OperRodrigo operR = new OperRodrigo();
             operR.oper(-5, 2);
	     
	}
}
