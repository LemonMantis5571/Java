import javax.swing.JOptionPane;

public class PruebaFiguras {
    public static void main(String[] args){
        String salida ="";
        //Arreglo de objetos figuras
        Figura[] figuras = new Figura[6];
        
        //Creacion de tipos especificos de Figura
        figuras[0] = new Circulo(4);
        figuras[1] = new Cuadrado(3);
        figuras[2] = new Triangulo(5, 3);
        
        figuras[3] = new Esfera(5);
        figuras[4] = new Cubo(7);
        figuras[5] = new Tetraedro(6, 4);
        
        for(Figura figura: figuras){
            if(figura instanceof FiguraBidimensional){
                salida += String.format("Area de %s: %f%n%n", figura, ((FiguraBidimensional)figura).obtenerArea());
                JOptionPane.showMessageDialog(null,salida);
            }
            if(figura instanceof FiguraTridimensional){
                salida += String.format("Figura %s%narea superficial: %f%nvolumen: %f%n%n",
                        figura, ((FiguraTridimensional)figura).obtenerArea(), ((FiguraTridimensional)figura).obtenerVolumen());
                JOptionPane.showMessageDialog(null,salida);
            }
        }
    }
}
