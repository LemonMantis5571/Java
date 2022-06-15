
import javax.swing.JOptionPane;

public class PruebaInterfazPorPagar {

	public static void main(String[] args) {
		PorPagar[] objetosPorPagar = new PorPagar[4];
		
		objetosPorPagar[0]= new Factura("01234","Juguete",2,375.00);
		objetosPorPagar[1]= new Factura("56789","Boxer de Marilyn Monroe",4,79.95);
		objetosPorPagar[2]= new EmpleadoAsalariado("Eduardo","Mishi","2021-1999U",800.00);
		objetosPorPagar[3]= new EmpleadoAsalariado("GABRIEL","LACAYO","2021-1999U",1200.00);
		
		String salida = String.format("Facturas y Empleados Procesados en forma polimofica:%n");
	     
	     for(PorPagar porPagarActual : objetosPorPagar) {
	    	
	    	 
	    	 salida += String.format(" %n%s %n%s: $%,.2f%n",porPagarActual.toString(),"Pago Vencido",porPagarActual.obtenerMontoPago());
	    	 
	    	 
	     }
	     JOptionPane.showMessageDialog(null, salida);

	}

}
