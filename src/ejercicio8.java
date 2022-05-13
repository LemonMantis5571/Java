import javax.swing.*;
class ejercicio8 {
    public static void main(String[] args) {
        //ver si es multiplo o no
        int numero, multiplo;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        multiplo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su segundo número"));

        Multiplo(numero, multiplo);

    }

    public static boolean Multiplo(int numero, int multiplo) {
        if (numero % multiplo == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + multiplo  + " es multiplo de " + numero);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + multiplo  + " no es multiplo de " + numero);
            return false;
        }
    }
}