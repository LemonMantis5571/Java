
public class Tetraedro extends FiguraTridimensional{
    /**
     * Triangulo que sirve como base del tetraedro
     */
    private Triangulo c;
   
    public Tetraedro(double base, double altura){
        c = new Triangulo(base, altura);
    }
    /**
     * Devuelve el area de la superficie del tetraedro
     * @return double
     */
    @Override
    public double obtenerArea(){
        return c.obtenerArea() * 4;
    }
    /**
     * Devuelve el volumen del tetraedro
     * @return double
     */
    @Override
    public double obtenerVolumen(){
        return (1.0 / 3.0) * c.obtenerArea() * c.obtenerAltura();
    }
    /**
     * Devuelve la representación String del objeto
     * @return String
     */
    @Override
    public String toString(){
        return String.format("tetraedro");
    }
}
