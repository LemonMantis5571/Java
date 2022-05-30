/* Escriba una clase prueba y fecha que lea lo siguiente: nombre, apellido, día, mes y año de nacimiento para n personas. */

public class fechaPersona {
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;
    

    public fechaPersona(){

    }
    
    public fechaPersona(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAnio(){
        return anio;
    }

    public void setAnio(int anio){
        this.anio = anio;
    }
}