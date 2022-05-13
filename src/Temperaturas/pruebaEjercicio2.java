package Temperaturas;
public class pruebaEjercicio2 {
	private double temperaturaC;
	
	public pruebaEjercicio2() {
		if(temperaturaC< -273.1) {
			temperaturaC = -273.15;}
		else {}
	}

	public void setC(double c) {
		temperaturaC = c;
	}
	
	public double getC() {
		return temperaturaC;
	}
	
	public double getF() {
		return (temperaturaC * 1.8) + 32;
	}
	
	public double getK() {
		return temperaturaC + 273.15;
	}
	
}
