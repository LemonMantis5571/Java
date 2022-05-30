package Jerarquia_De_Figuras;

public class Trapezio  extends Cuadrilatero{
    private int base1;
    private int base2;
    private int altura;

    public Trapezio() {
    }

    public Trapezio(int base1, int base2, int altura) {
        this.base1 = base1;
        this.base2 = base2;
        this.altura = altura;
    }

    public void establecerBase1(int base1) {
        this.base1 = base1;
    }

    public void establecerBase2(int base2) {
        this.base2 = base2;
    }

    public void establecerAltura(int altura) {
        this.altura = altura;
    }

    public double obtenerBase1() {
        return base1;
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
