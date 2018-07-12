package pa.calc;

public class Calculadora {

	public static void main(String[] args) {
		
		// OperEx Example
		OperEx opex=new OperEx();
		double resEx = opex.oper(1, 2);
		System.out.println(resEx);

		// - OperPA - Paulo
	    OperPA opePA=new OperPA();
	     double resPA = opePA.oper(2, 3);
	    System.out.println("Paulo: (2,3)"+resPA);
	    
		// ToDo - All Students Must Implement one Operation
		// - Oper0X - Name
	    // Oper0X ope0X=new Oper0X();
	    // double res0X = ope0X.oper(X, Y);
	    // System.out.println(res0X);
	}

}
