package Salario;


public class ejercicio3 {
    private int horas;
    private float impuestos;
    private float neto;
    private float salarioBase;
    private int horasExtras;

    public ejercicio3(float salario, int horas, int impuestos, float neto) {
        this.salarioBase = salario;
        this.horas = horas;
        this.impuestos = impuestos;
        this.neto = neto;

    }

  
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(float impuestos) {
        this.impuestos = impuestos;
    }

    public float getNeto() {
        return neto;
    }

    public void setNeto(float neto) {
        this.neto = neto;
    }

  
    public double calcularSalarioBruto() {
        double precioHoras = 200;
        return (salarioBase + (precioHoras * horasExtras));
    }

    public float calcularSalarioNeto() {
        float neto = (float) (calcularSalarioBruto() - calcularSeguro());
        return neto;
    }
    
    public double calcularSeguro() {
        return calcularSalarioBruto() * 0.07;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

   
}
