/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author Familia Garcia A
 */
public class Ejercicio_1 {
    //atributos
    String marca;
    String modelo;
    int km;
    int pasajeros;
    String color;
    String disponible;
    
    public static void main (String [] args){
       Ejercicio_1 auto = new Ejercicio_1 ();
       
       auto.marca = "Audi";
       auto.modelo = "2022";
       auto.km = 0;
       auto.pasajeros = 4;
       auto.color = "negro";
       auto.disponible = "Si";
       
       
       System.out.println("La marca del carro es: " + auto.marca);
       System.out.println("El modelo del carro es: " + auto.modelo);
       System.out.println("El kilometraje del carro es: " + auto.km);
       System.out.println("El color del carro es: " + auto.color);
       System.out.println("El carro esta disponible en concesionario: " + auto.disponible);
    }
            
}


