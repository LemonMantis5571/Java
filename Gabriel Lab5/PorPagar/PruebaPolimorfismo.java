import javax.swing.JOptionPane;
public class PruebaPolimorfismo {
    public static void main(String[] args){
        String salida = "";
        String output = "";
        String finaloutput ="";
    
       
        Empleado[] empleados = new Empleado[4];
        
        
        empleados[0] = new EmpleadoAsalariado("Gabriel", "Lacayo", "01-88-U", 800.00);
        empleados[1] = new EmpleadoPorHoras("Juan", "Caldera", "14-16-07", 16.75, 40);
        empleados[2] = new EmpleadoPorComision("Susan", "Blandon", "49-23-21", 10000, 0.6);
        empleados[3] = new EmpleadoBaseMasComision("Chatel", "Pric", "70-05-23", 5000, .04, 300);
        
        for (Empleado empleadoActual: empleados) {
        	salida += empleadoActual;
        	
        	if(empleadoActual instanceof EmpleadoBaseMasComision) {
        		
        		EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision) empleadoActual;
        		
        		empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());
        		
        		salida += String.format("%nel nuevo salario base con 10%% de aumento es: $%,.2f%n", empleado.obtenerSalarioBase());
        		
        	}
        	salida += String.format("%nIngresos $%,.2f%n%n", empleadoActual.obtenerMontoPago());
        }
        for (int j = 0; j < empleados.length; j++) {
        	
        	salida += String.format("El empleado %d es un %s%n", j,empleados[j].getClass().getName());
        	
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}