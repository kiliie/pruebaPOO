package sintaxis;

import java.util.Scanner;

public class Condicionales {

    /**
     * Realizar un programa que permita determinar si un número es positivo y
     * par
     */
    public static void main(String[] args) {
        // 1. Declaración de variables y objetos
        Scanner leer = new Scanner(System.in);
        double numero;
        //2. Lectura de valores
        System.out.println("Introduzca un número:");
        numero = leer.nextDouble();
        //3. Condiciones
        if ((numero > 0) && (numero % 2 == 0)) {
            System.out.println("El número es par y positivo");
        }else{
            System.out.println("No cumple con las condiciones");
        }
        

    }

}
