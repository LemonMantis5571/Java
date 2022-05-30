package Jerarquia_De_Figuras;

public abstract class Cuadrilatero extends Object{

    protected int altura;
    protected int base;
    protected int lado;

    public Cuadrilatero() {
    }

    public Cuadrilatero(int base, int altura) {
        this.altura = altura;
        this.base = base;
    }

    public Cuadrilatero(int lado) {
        this.lado = lado;
    }

    

    public double obtenerArea(){
        return 0.0;
    }

    public double obtenerPerimetro(){
        return 0.0;
    }
    
    public double obtenerVolumen()  {
        return 0.0;
    }

}