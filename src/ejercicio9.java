import javax.swing.*;
class ejercicio9 {
    
    static int numero = 0;
    static boolean esPar = false;
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            esPar(numero);
        }
        
    }

    public static boolean esPar(int a) {
        if (a%2 == 0){
            esPar = true;
            JOptionPane.showMessageDialog(null,"Su numero " + a + " es par");
            return esPar;
        }
        else{
            JOptionPane.showMessageDialog(null,"Su numero " + a + " es impar");
            esPar = false;
            return esPar;
        }
    }
}
