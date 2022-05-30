package Empleado_Por_Horas;

public abstract class Empleado {
  
    private final String primerNombre;
   
    private final String apellidoPaterno;
  
    private final String numeroSeguroSocial;
    
    private Fecha fechaNacimiento;
   
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial){
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

     
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento){
        this(primerNombre, apellidoPaterno, numeroSeguroSocial);
        
        this.fechaNacimiento = fechaNacimiento;
    }

    public String obtenerPrimerNombre(){
        return primerNombre;
    }
 
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }

    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
  
    
    public Fecha obtenerFechaNacimiento(){
        return fechaNacimiento;
    }
   
    @Override
    public String toString(){
        return String.format("%s %s%nnúmero de seguro social: %s%nFecha de nacimiento: %s",
                obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial(), fechaNacimiento.toString());
    }
    
    public abstract double ingresos();
}
