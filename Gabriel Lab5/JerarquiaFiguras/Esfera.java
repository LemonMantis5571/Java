
public class Esfera extends FiguraTridimensional{
  
    private Circulo c;
    public Esfera(double radio){
        c = new Circulo(radio);
    }
   
    @Override
    public double obtenerArea(){
        return 4 * c.obtenerArea();
    }
  
    @Override
    public double obtenerVolumen(){
        return (4.0 / 3.0) * c.obtenerArea() * c.obtenerRadio();
    }
    /**
     * Representación String de la esfera
     * @return String
     */
    @Override
    public String toString(){
        return String.format("esfera");
    }
}
