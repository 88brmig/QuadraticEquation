package mx.edu.uttijuana.exam;

public class QuadraticEquation extends Equation{
    private double discriminant;

    public QuadraticEquation() {
        super();
    }

    public QuadraticEquation(int a, int b, int c) throws InvalidDiscriminantException {
        super(a, b, c);
        double result = ((getB() ^ 2) - (4 * (getA() * getC())));
        if (result < 0) throw new InvalidDiscriminantException();
        else this.discriminant = result;
    }

    public double getDiscriminant() {
        return this.discriminant;
    }

    @Override
    public double getX1() {
        return ((-getB() + Math.sqrt(getDiscriminant())) / 2 * getA());
    }

    @Override
    public double getX2() {
        return ((-getB() - Math.sqrt(getDiscriminant())) / 2 * getA());
    }

}
