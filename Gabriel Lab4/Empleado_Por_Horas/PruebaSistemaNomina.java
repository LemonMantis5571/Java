package Empleado_Por_Horas;
import javax.swing.JOptionPane;
public class PruebaSistemaNomina {
    public static void main(String[] args){
        String salida = "";
        Fecha fechaActual = new Fecha(02, 28, 2020);
       
        Fecha f1 = new Fecha(01, 02, 1990);
        Fecha f2 = new Fecha(02, 03, 1991);
        Fecha f3 = new Fecha(03, 04, 1992);
        Fecha f4 = new Fecha(04, 05, 1993);
        
       
        Empleado[] empleados = new Empleado[4];
        
        
        empleados[0] = new EmpleadoAsalariado("Jhon", "Smith", "111-11-1111", 800.00, f1);
        empleados[1] = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40, f2);
        empleados[2] = new EmpleadoPorComision("Sue", "Jones", "333-33-33330", 10000, 0.6, f3);
        empleados[3] = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, .04, 300, f4);
        
        
        for(Empleado empleadoActual: empleados){
            JOptionPane.showMessageDialog(null,empleadoActual);
            salida += String.format("ingresos $%,.2f%ningresos mas bono de cumpleaños $100: $%,.2f%n%n",
            empleadoActual.ingresos() * 4.0, (empleadoActual.ingresos() * 4.0) + 100);
            if(fechaActual.obtenerMes() == empleadoActual.obtenerFechaNacimiento().obtenerMes())
                JOptionPane.showMessageDialog(null,salida);
            else
                System.out.printf("ingresos $%,.2f%n%n", empleadoActual.ingresos() * 4.0);
        }
    }
}