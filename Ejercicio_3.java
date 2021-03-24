
import java.util.Scanner;



/**
 *
 * @author Familia Garcia A
 */
public class Ejercicio_3 {


    public static void main(String[] args) {
            Scanner teclado = new Scanner (System.in);
       System.out.println("Por favor digite su edad");
       int edad = teclado.nextInt();
       
       if (edad >= 18){
           System.out.println("Bienvenido al sistema");
       }
       else {
           System.out.println("No cumple con  el requisito de ser mayor de edad");
    }
        
    }

}