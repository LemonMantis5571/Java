package Jerarquia_De_Figuras;

public abstract class Cuadrilatero extends Object{

    protected Double altura;
    protected Double base;
    protected int lado;

    public Cuadrilatero() {
    }

    public Cuadrilatero(Double base, Double altura) {
        this.altura = altura;
        this.base = base;
    }

    public Cuadrilatero(int lado) {
        this.lado = lado;
    }

    public Cuadrilatero (int lado, Double altura){
        this.lado = lado;
        this.altura = altura;
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