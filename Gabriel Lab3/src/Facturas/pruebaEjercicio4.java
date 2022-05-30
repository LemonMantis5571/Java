package Facturas;

import javax.swing.JOptionPane;

public class pruebaEjercicio4 {
	public static void main(String[] args) {
		
		ejercicio4 f = new ejercicio4();
		
		f.setNumeroPieza("Clavo");
		f.setCantidad(20);
		f.setDescription("Martillo");
		f.setPrecio(4000);
		
		JOptionPane.showMessageDialog(null, f.obtenerMontoFactura() + "\n" + f.toString());
	
	}
	
}
