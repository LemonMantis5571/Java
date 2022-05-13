import javax.swing.*;
class ejercicio10 {
    
    static double area;
    static double radio;
    public static void main(String[] args) {
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));

        area = calcularArea(radio);
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);

    }

  

    public static double calcularArea(Double r) {

        return Math.PI*Math.pow(r,2);
        
    }
}
