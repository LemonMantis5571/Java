

import javax.swing.*;
/* Escriba una clase prueba y fecha que lea lo siguiente: nombre, apellido, día, mes y año de nacimiento para n personas. */
public class pruebaFechaPersona {
    static int n;
    public static void main(String[] args) {
        fechaPersona p = new fechaPersona();
 
    
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de personas a registrar"));

        for (int i = 0; i < n; i++) {
            p.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre"));
            p.setApellido(JOptionPane.showInputDialog(null, "Ingrese el apellido"));;
            p.setDia(Integer.parseInt((JOptionPane.showInputDialog(null, "Ingrese el dia:"))));
            p.setMes(Integer.parseInt((JOptionPane.showInputDialog(null, "Ingrese el mes"))));
            p.setAnio(Integer.parseInt((JOptionPane.showInputDialog(null, "Ingrese el anio"))));


             JOptionPane.showMessageDialog(null, "Nombre: " + p.getNombre() + "\nApellido: " + p.getApellido() + "\n\nFecha De nacimiento:"+ "\nDia: " + p.getDia() + "\nMes: " + p.getMes() + "\nAnio: " + p.getAnio());
           
            

        }
       
        



    }
}
            