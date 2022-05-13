
package Temperaturas;
import javax.swing.JOptionPane;

public class ejercicio2 {
	public static void main(String[] args) {
		pruebaEjercicio2 conver = new pruebaEjercicio2();
		
		double temperaturaInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su temperatura inicial:"));
		conver.setC(temperaturaInicial);
		
		JOptionPane.showMessageDialog(null, String.format("Su temperatura en en Celsius es: " + conver.getC()));
		JOptionPane.showMessageDialog(null, String.format("Su temperatura en en Fahrenheit es: " + conver.getF()));
		JOptionPane.showMessageDialog(null, String.format("Su temperatura en en Kelvin es: " + conver.getK()));
		
	}
}
