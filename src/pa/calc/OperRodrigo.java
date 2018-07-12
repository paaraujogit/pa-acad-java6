package pa.calc;
/**
 * @author rform
 */
public final class OperRodrigo extends OperEx {
    private double n1, n2, n3, n4;
    
    public void metodo() {
        System.out.println("test");
    }
    
    @Override
    public double oper(double op1, double op2) {
        if (op1 < 0 && op2 < 0) {
            System.out.println("O ponto está abaixo do eixo \"x\" e à esquerda do eixo \"y\"");
        } else if (op1 < 0 && op2 > 0) {
            System.out.println("O ponto está acima do eixo \"x\" e à esquerda do eixo \"y\"");
        } else if (op1 > 0 && op2 < 0) {
            System.out.println("O ponto está abaixo do eixo \"x\" e à direita do eixo \"y\"");
        } else if (op1 > 0 && op2 > 0) {
            System.out.println("O ponto está acima do eixo \"x\" e à direita do eixo \"y\"");
        } else if (op1 == 0 && op2 > 0) {
            System.out.println("O ponto está sobre o eixo \"x\" e à direita do eixo \"y\"");
        } else if (op1 == 0 && op2 < 0) {
            System.out.println("O ponto está sobre o eixo \"x\" e à esquerda do eixo \"y\"");
        } else if (op1 < 0 && op2 == 0) {
            System.out.println("O ponto está abaixo do eixo \"x\" e sobre o eixo \"y\"");
        } else if (op1 > 0 && op2 == 0) {
            System.out.println("O ponto está acima do eixo \"x\" e sobre o eixo \"y\"");
        } else {
            System.out.println("O ponto está sobre o eixo \"x\" e sobre o eixo \"y\"");
        }
        return 0;
    }
    
}
