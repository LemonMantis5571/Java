package Jerarquia_De_Figuras;

public class Rectangulo extends Cuadrilatero {

    public Rectangulo() { }
    
    public Rectangulo(int base, int altura) {
        super(base,altura);
    }

    public void establecerBase(int base) {
        this.base = base;
    }

    public void establecerAltura(int altura) {
        this.altura = altura;
    }

    public double obtenerBase() {
        return base;
    }

    public double obtenerAltura() {
        return altura;
    }

    public double obtenerArea() {
        return obtenerBase() * obtenerAltura();
    }

    @Override
    public String toString(){
        return String.format("Rectangulo");
    }
}
