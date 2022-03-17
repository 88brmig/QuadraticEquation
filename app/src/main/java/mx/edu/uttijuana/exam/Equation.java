package mx.edu.uttijuana.exam;

public class Equation {
    private int a;
    private int b;
    private int c;

    public Equation(int a, int b, int c) throws InvalidEquationException {
        setA(a); setB(b); setC(c);
        if (getDiscriminant() < 0) throw new InvalidEquationException();
    }

    public int getA() { return a; }
    public int getB() { return b; }
    public int getC() { return c; }

    public void setA(int a) { this.a = a; }
    public void setB(int b) { this.b = b; }
    public void setC(int c) { this.c = c; }

    public double getX1(){
        return (-getB() + Math.pow(getDiscriminant(), 0.5)) / (2.0 * getA());
    }
    public double getX2() {
        return (-getB() - Math.pow(getDiscriminant(), 0.5)) / (2.0 * getA());
    }
    private double getDiscriminant() {
        return getB() * getB() - 4.0 * getA() * getC();
    }
}
