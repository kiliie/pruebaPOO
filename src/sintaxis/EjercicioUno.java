
package sintaxis;

import java.util.Scanner;
public class EjercicioUno {
    /*
    Realizar un programa que permita sumar dos números
    */
    public static void main(String[] args) {
        //Leer datos desde Consola
        Scanner read = new Scanner(System.in);
        //Declaración de variables
        float suma = 0;
        float resta = 0;
        float numero1;
        float numero2;
        System.out.println("Introduzca el primer número:");
        numero1 = read.nextFloat();
        System.out.println("Introduzca el segundo número:");
        numero2 = read.nextFloat();
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        System.out.println("El resultado de la suma es:"+suma);
        
        
    }
    
}
