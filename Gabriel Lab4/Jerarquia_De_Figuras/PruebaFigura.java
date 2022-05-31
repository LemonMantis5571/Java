package Jerarquia_De_Figuras;

// probar clases de las figuras trapezio, rectangulo, cuadrado
import javax.swing.JOptionPane;
public class PruebaFigura {
    public static void main(String[] args) {

        Cuadrilatero[] figuras = new Cuadrilatero[6];
        /*  Crear objetos de las  clases de las figuras trapezio, rectangulo, cuadrado */

        // trapezio

        figuras [0] = new Trapezio(10.0,5.0,5);

        // rectangulo

        figuras [1] = new Rectangulo(5.0,5.0);

        // cuadrado

        figuras [2] = new Cuadrado(5);

        // ParaleloGramo

        figuras [3] = new Paralelogramo(5,5.0);


        for(Cuadrilatero figura: figuras){
            JOptionPane.showMessageDialog(null, "El area de la figura "  + figura +  " es: "  + figura.obtenerArea());
        }
    




    }
}
