import javax.swing.*;
public class ejercicio12{

    public static void main(String[] args) {
        //invertir un numero
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        invertir(numero);

    }

    public static void invertir(int a) {
        int res = 0;
        while (a != 0) {
            int dig  = a % 10;
            res = (res*10) + dig;
            a = a / 10;
        }
        JOptionPane.showMessageDialog(null, "El numero invertido es: " + res);


    }
}