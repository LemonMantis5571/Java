import javax.swing.JOptionPane;

/* Escriba una clase fecha que permita validar día, mes y año. Desde al año 1900 hasta el año  3000 y cree un método que imprima la fecha en el siguiente formato:  */
public class validarFecha {
    public static void main(String[] args) {
        int dia, mes, anio;
        boolean correcto = false;
        


        
        while(correcto==false) {
            dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dia"));
            mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes"));
            anio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el anio"));
            if(anio>=1900 && anio<=3000)
            { 
                if(mes>=1 && mes<=12)
                {
                    if (mes == 2) 
                    {
                        if (dia >= 1 && dia <= 28) 
                        {
                            
                            ImprimirFecha(dia, mes, anio);
                            correcto = true;
                        }
                    }
                    if(dia>=1 && dia<=31)
                    {
                        ImprimirFecha(dia, mes, anio);
                        correcto = true;
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null," Por favor Ingrese una fecha correcta");
            }
        }

    }
    
    
    
    
    public static void ImprimirFecha(int d, int m, int a) {
        String salida="";
        salida += String.format(d + "/" + m + "/" + a);
        JOptionPane.showMessageDialog(null, "Fecha: " + salida);
       
    }   
}

  


