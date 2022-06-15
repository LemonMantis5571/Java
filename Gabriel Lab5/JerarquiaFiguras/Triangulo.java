public class Triangulo extends FiguraBidimensional{
    /**
     * Tamaño de la base del triángulo
     */
    private double base;
    /**
     * Altura del triángulo
     */
    private double altura;

     
    public Triangulo(double base, double altura){
        if(base < 0.0)
            throw new IllegalArgumentException("La base debe ser >= 0.0");
        if(altura < 0.0)
            throw new IllegalArgumentException("La altura debe ser >= 0.0");
        
        this.base = base;
        this.altura = altura;
    }
    /**
     * Devuelve la altura del triángulo
     * @return double
     */
    public double obtenerAltura(){
        return altura;
    }
    /**
     * Devuelve el area del triángulo
     * @return double
     */
    @Override
    public double obtenerArea(){
        return (base * altura) / 2.0;
    }
    /**
     * Devuelve la representación String del triángulo
     * @return String
     */
    @Override
    public String toString(){
        return String.format("triángulo");
    }
}
