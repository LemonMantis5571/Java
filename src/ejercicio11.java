import java.lang.Math;
import javax.swing.JOptionPane;
public class ejercicio11 {
    
    public static void main(String[] args) {
        //minimo de 3 numeros en static
        int numero1, numero2, numero3;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));

        Minimo(numero1, numero2, numero3);
    }

    public static void Minimo(int numero1, int numero2, int numero3) {
        // minimo de 3 numeros usando math.min
        double minimo = Math.min(Math.min(numero1, numero2), numero3);
        JOptionPane.showMessageDialog(null, "El numero minimo es: " + minimo);
    }
}
