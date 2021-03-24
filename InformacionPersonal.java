package InformacionPersonal;

/**
 *
 * @author Familia Garcia A
 */
public class InformacionPersonal {
    String datos_personales() {
        String nombre="Paola";
        int edad=35;
        char genero = 'F';
        String tipo_doc = "C.C";
        int nro_doc = 34002959;
        boolean hijos = true;
        boolean casado = true;
        
        if (hijos == true)
            System.out.println("Si tengo hijos");
        else
            System.out.println("No tengo hijos");
        
        if (casado == true)
            System.out.println("Si estoy casada");
        else
            System.out.println("No estoy casada");
        
        return  nombre + "\n" + edad + "años" + "\n" + genero + "\n" + tipo_doc + "\n" + nro_doc + "\n" + hijos + "\n" + casado;

        
                
    }  
    
    public static void main(String[] args) {
        
        InformacionPersonal instClass = new InformacionPersonal();
        System.out.println(instClass.datos_personales());
    }
    
}