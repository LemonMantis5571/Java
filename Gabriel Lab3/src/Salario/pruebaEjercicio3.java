package Salario;

import javax.swing.JOptionPane;

/* Una empresa necesita calcular el salario semanal de sus trabajadores en base a las horas
trabajadas y el sueldo hora. Para esto es necesario encontrar el salario base, los impuestos y el
neto de cada trabajador. Se debe crear una clase que inicialice los campos (atributos) horas
trabajadas en cero y sueldo hora en cinco (no pueden ser negativos) además deberá tener
métodos que establezcan (SET) y obtengan (GET) los valores de estas variables, también deben
tener métodos para calcular el salario base, impuestos y neto.
*/

import javax.swing.*;
public class pruebaEjercicio3 {
    
    public static void main(String[] args) {
        ejercicio3 empleado1 = new ejercicio3(100, 10, 20, 100);
        ejercicio3 empleado2 = new ejercicio3(200, 20, 30, 200);

        
        JOptionPane.showMessageDialog(null, String.format("El salario de empleado 1 es: $ %.2f", empleado1.calcularSalarioNeto()));
        JOptionPane.showMessageDialog(null, String.format("El salario de empleado 2 es: $ %.2f", empleado2.calcularSalarioNeto()));

        

 

    }
}
