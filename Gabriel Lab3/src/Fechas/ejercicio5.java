package Fechas;
import java.text.SimpleDateFormat;


import javax.swing.JOptionPane;
public class ejercicio5 {
	private int mes;
	private int dia;
	private int anio;
	String salida = "";
	
	SimpleDateFormat strFormat1 = new   SimpleDateFormat("dd/MM/yyyy");
	
	public ejercicio5() {
		
	}
	
	public ejercicio5 (int mes, int dia, int anio) {
		this.mes = mes;
		this.dia = dia;
		this.anio = anio;
		
	}

	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	public void mostrarFecha() {
		
		salida += "La fecha es: " + dia + "/" + mes + "/" + anio;
        JOptionPane.showMessageDialog(null, salida);
        
		
	}
	
}
