package Jerarquia_De_Figuras;

public class Trapezio  extends Cuadrilatero{
    private double base2;

    public Trapezio() {
    }

    public Trapezio(Double base, Double base2, double altura) {
        super(base, altura);
        this.base2 = base2;
    }

    public void establecerBase1(Double base) {
        this.base = base;
    }

    public void establecerBase2(Double base2) {
        this.base2 = base2;
    }

    public void establecerAltura(Double altura) {
        this.altura = altura;
    }

    public double obtenerBase1() {
        return base;
    }

    public double obtenerBase2() {
        return base2;
    }

    public double obtenerAltura() {
        return altura;
    }

    public double obtenerArea() {
        return (obtenerBase1() + obtenerBase2()) * obtenerAltura() / 2;
    }

    @Override
    public String toString(){
        return String.format("Trapezio");
    }
}
