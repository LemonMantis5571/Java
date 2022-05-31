package Jerarquia_De_Figuras;

public class Rectangulo extends Cuadrilatero {

    public Rectangulo() { }
    
    public Rectangulo(Double base, Double altura) {
        super(base,altura);
    }

    public void establecerBase(Double base) {
        this.base = base;
    }

    public void establecerAltura(Double altura) {
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
