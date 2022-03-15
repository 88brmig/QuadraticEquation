package mx.edu.uttijuana.exam;

public abstract class Equation {
    private final int a;
    private final int b;
    private final int c;

    public Equation(){
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public Equation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() { return a; }
    public int getB() { return b; }
    public int getC() { return c; }

    public abstract double getX1();
    public abstract double getX2();

    private void getDiscriminant() throws InvalidDiscriminantException { }
}
