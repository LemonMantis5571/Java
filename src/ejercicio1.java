
import javax.swing.JOptionPane;
public class ejercicio1 {

	private int tiempo;
	public int getTiempo() {
		return tiempo;
	}
	
	public void setTiempo(int tiempo) {
		this.tiempo=tiempo;
	}
	
	public static double calculo(double tiempo) {
		if (tiempo<=3) {
			return 2.0;	
		} else if(tiempo==24){
			return 10.0;
		}else if((tiempo>3) && (tiempo<24)){
			return (2.0+((tiempo-3.0)*0.50));
		}else {
			return 0;
		}	
	}
	public static void main(String[] args) {
		
		double time = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas que estuvo estacionado"));
		double horasE= calculo(time);
				
		JOptionPane.showMessageDialog(null, String.format("Debido a su tiempo en el estacionamiento el monto total a pagar es: $ %.2f",horasE));
	}

}
