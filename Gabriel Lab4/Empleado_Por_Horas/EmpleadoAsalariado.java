package Empleado_Por_Horas;


public class EmpleadoAsalariado extends Empleado{
   
    private double salarioSemanal;
  
    public EmpleadoAsalariado(String primerNombre,
            String apellidoPaterno, String numeroSeguroSocial, double salarioSemanal, Fecha fechaNacimiento){
        
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);
        
        if(salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
        
        this.salarioSemanal = salarioSemanal;
    }
 
    public void establecerSalarioSemanal(double salarioSemanal){
        if(salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario semanl debe ser >= 0.0");
        
        this.salarioSemanal = salarioSemanal;
    }
   
    public double obtenerSalarioSemanal(){
        return salarioSemanal;
    }
   
    @Override
    public double ingresos(){
        return obtenerSalarioSemanal();
    }

    @Override
    public String toString(){
        return String.format("empleado asalariado: %s%n%s: $%.2f",
                super.toString(), "salario semanal", obtenerSalarioSemanal());
    }
}
