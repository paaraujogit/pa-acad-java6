package pa.calc;

public class Calculadora {

	public static void main(String[] args) {
		
		// OperEx Example
		OperEx opex=new OperEx();
		double resEx = opex.oper(1, 2);
		System.out.println(resEx);
<<<<<<< HEAD
		
		// OperHVA Example
		OperHVA OperHVA = new OperHVA();
		double resHVA=OperHVA.oper(3,100);
		System.out.println(resHVA);
		
=======

		// - OperPA - Paulo
	    OperPA opePA=new OperPA();
	     double resPA = opePA.oper(2, 3);
	    System.out.println("Paulo: (2,3)"+resPA);
	    
	    OperSum sum = new OperSum();
	    double sumResult = sum.oper(1, 2);
	    System.out.println("The sum of the 2 numbers is: " + sumResult);
	    
>>>>>>> 8b36c098bcf9e3257fcf2166ccfe017f71cd92f2
		// ToDo - All Students Must Implement one Operation
		// - Oper0X - Name
	    // Oper0X ope0X=new Oper0X();
	    // double res0X = ope0X.oper(X, Y);
	    // System.out.println(res0X);
	}

}
