package Jerarquia_De_Figuras;


public abstract class Punto extends Cuadrilatero{
    
    private int x;
    private int y;

    public Punto() {

    }
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void establecerX(int x) {
        this.x = x;
    }

    public void establecerY(int y) {
        this.y = y;
    }

    public int obtenerX() {
        return x;
    }

    public int obtenerY() {
        return y;
    }
    

    public String toString(){
        return "("+obtenerX()+","+obtenerY()+")";
    }


}
