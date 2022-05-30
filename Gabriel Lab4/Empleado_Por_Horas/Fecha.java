package Empleado_Por_Horas;

public class Fecha {
   
    private int mes;
   
    private int dia;
  
    private int anio;
   
    private static final int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
    public Fecha(int mes, int dia, int anio){
        if(mes <= 0 || mes > 12)
            throw new IllegalArgumentException("mes (" + mes + ") debe ser 1-12");
        //Validacion de dia excepto cuando es bisiesto
        if(dia <= 0 || (dia > diasPorMes[mes] &&  !(mes == 2 && dia == 29)))
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y año especificados");
        
        //Validacion de año bisiesto
        if(mes == 2 && dia == 29 && !(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y año especificados");
        
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
  
    public int obtenerMes(){
        return mes;
    }
   
    public int obtenerDia(){
        return dia;
    }
    
    public int obtenerAnio(){
        return anio;
    }
   
    
    @Override
    public String toString(){
        return String.format("%d/%d/%d", mes, dia, anio);
    }
}
