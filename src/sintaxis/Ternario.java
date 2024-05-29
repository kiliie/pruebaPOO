
package sintaxis;

import java.util.Scanner;

public class Ternario {

    public static void main(String[] args) {
        // Ejercicio con ternario. Determinar si un 
        //número es múltiplo de 5
        // 1. Declaración de variables y objetos
        Scanner leer = new Scanner(System.in);
        double numero;
        //2. Lectura de valores
        System.out.println("Introduzca un número:");
        numero = leer.nextDouble();
        //3. Condición
        String msn = numero % 5 == 0 ? "Es múltiplo de 5" 
                : "No es múltiplo de 5";
        System.out.println(msn);
    }
    
}
