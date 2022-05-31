package Jerarquia_De_Figuras;

public class Cuadrado extends Cuadrilatero {
    

    public Cuadrado() { }
    
    public Cuadrado(int lado) {
        super(lado);
    }

    public void establecerLado(int lado) {
        this.lado = lado;
    }

    public double obtenerLado() {
        return lado;
    }

    public double obtenerArea() {
        return obtenerLado() * obtenerLado();
    }

    @Override
    public String toString(){
        return String.format("Cuadrado");
    }
}