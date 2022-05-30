import javax.swing.*;

class Ejercicio7{
    static double cateto1, cateto2, hipotenusa;
    public static void main(String[] args){
        


        JOptionPane.showMessageDialog(null, "Este programa calcula la hipotenusa de un triangulo Rectangulo", "Calculadora", JOptionPane.INFORMATION_MESSAGE);

        cateto1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Porte el primer cateto"));

        cateto2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Porte el segundo cateto"));

        hipotenusa = Hipotenusa(cateto1, cateto2);

        JOptionPane.showMessageDialog(null, "La hipotenusa es: " + hipotenusa, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
    }

    static double Hipotenusa(double a, double b){

        return Math.sqrt((Math.pow(a, 2) + Math.pow(b,2)));

    }
}