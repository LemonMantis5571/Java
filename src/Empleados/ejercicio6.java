package Empleados;
import javax.swing.JOptionPane;

public class ejercicio6 {
    private String nombre; // Nombre del empleado
    private String apellido; // Apellido del empleado
    private double salarioMensual; //Salario mensual del empleado
    String salida = ""; // Variable para imprimir en pantalla

    
    // Constructor para inicializar las vars. de instancia
    public ejercicio6( String pNombre , String pApellido , double pSalarioMensual )
    {
        // Asignación de los valores de los parámetros a las variables de instancia
        nombre = pNombre;
        apellido = pApellido;
        if( pSalarioMensual > 0.0 )
        {
            salarioMensual = pSalarioMensual;
        }
    } // Fin del constructor

    public void establecerNombre( String pNombre )
    {
        nombre = pNombre;
    }

    public String obtenerNombre()
    {
        return nombre;
    }

    public void establecerApellido( String pApellido )
    {
        apellido = pApellido;
    }

    public String obtenerApellido()
    {
        return apellido;
    }

    public void establecerSalarioMensual( double salario )
    {
        if( salario < 0.0 )
        {
            System.out.print( "\nEl salario escrito no es válido." );
            return;
        }
        salarioMensual = salario;
    }

    public double obtenerSalarioMensual()
    {
        return salarioMensual;
    }

    public double obtenerSalarioAnual()
    {
        return obtenerSalarioMensual() * 12;
    }

    public double obtenerAumento()
    {
        return obtenerSalarioAnual() * 1.10;
    }

    public void mostrarResumen() {
        salida += String.format( "\nNombre: %s", obtenerNombre() );
        salida += String.format( "\nApellido: %s", obtenerApellido() );
        salida += String.format( "\nSalario mensual: %.2f", obtenerSalarioMensual() );
        salida += String.format( "\nSalario anual: %.2f", obtenerSalarioAnual() );
        salida += String.format( "\nAumento: %.2f", obtenerAumento() );
        JOptionPane.showMessageDialog( null, salida );
    }

}
