
import java.util.Scanner;

/**
 *
 * @author Familia Garcia A
 */
public class Ejercicio_4 {

    
    public static void main(String[] args) {
        
     Scanner teclado = new Scanner (System.in);
       System.out.println("¿Usted utiliza redes sociales?");
        String respuesta;
        respuesta = teclado.nextLine();
        
       if ("si".equals(respuesta)){
           System.out.println("https://www.facebook.com/paola.aguirre3");
       }
       if ("no".equals(respuesta)){
           System.out.println("No utilizo redes sociales");
       }
  }
}

