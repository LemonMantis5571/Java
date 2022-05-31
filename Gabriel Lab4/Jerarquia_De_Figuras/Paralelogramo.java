package Jerarquia_De_Figuras;

public class Paralelogramo extends Cuadrilatero {

    public Paralelogramo() {
    }
    
    public Paralelogramo(int lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public void establecerLado(int lado) {
        this.lado = lado;
    }

    public void establecerAltura(Double altura) {
        this.altura = altura;
    }

    public double obtenerLado() {
        return lado;
    }

    public double obtenerAltura() {
        return altura;
    }

    public double obtenerArea() {
        return obtenerLado() * obtenerAltura();
    }

    @Override
    public String toString(){
        return String.format("Paralelogramo");
    }
}
