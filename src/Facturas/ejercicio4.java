package Facturas;
import java.util.*;

import javax.swing.JOptionPane;

public class ejercicio4 {
	private String numeroPieza;
	private String description;
	private int cantidad;
	private double precio;
	
	
	public ejercicio4() {
	
		
	}
	
	public ejercicio4(String numeroPieza,String description,int cantidad,double precio) {
		
		this.numeroPieza = numeroPieza;
		this.description = description;
		this.cantidad = cantidad;
		this.precio = precio;
		
	}
	
	public String getNumeroPieza() {
		return numeroPieza;
	}
	
	public void setNumeroPieza(String numeroPieza) {
		this.numeroPieza = numeroPieza;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
		
	}
	
	public double getPrecio() {
	        return precio;
	}

	public void setPrecio(double precio) {
	        this.precio = precio;
	    }
	public int getCantidad () {
		return cantidad;
		
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
		
	}
	
	public double obtenerMontoFactura() {
		double product;
		if (this.cantidad > 0) {
			product = this.cantidad * this.precio;
			
		}
		else {
			product = 0;
			JOptionPane.showMessageDialog(null, "pendejito");
		
		}
		
		return product;
		
		
	}
	
	@Override
	public String toString() {
		return numeroPieza + "\n" + description + "\n" + cantidad + "\n" + precio;
	}

}
