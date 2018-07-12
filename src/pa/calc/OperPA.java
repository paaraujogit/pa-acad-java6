package pa.calc;

public class OperPA implements ItfOper {

		@Override
		public double oper(double op1, double op2) {
			return Math.sqrt(op1*op1+op2*op2); // Teorema pitágoras
		}
}
