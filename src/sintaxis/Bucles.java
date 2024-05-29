
package sintaxis;

import java.util.Scanner;

public class Bucles {
    /**
     * Crear un programa que permita leer N
     * cantidades de edades y saque un promedio
     * de las edades
     */
    public static void main(String[] args) {
         // 1. Declaración de variables y objetos
        Scanner leer = new Scanner(System.in);
        int edad;
        int cantEdades;
        int i = 0; // variable iteradora para while
        int sumaEdades = 0;
        double promedio = 0;
        System.out.println("Cantidad de edades a promediar:");
        cantEdades = leer.nextInt();
        //2. Con while
       /* while(i < cantEdades){
            //Leer las edades
            System.out.println("Introduzca la edad "+(i+1)+":");
            edad = leer.nextInt();
            //sumaEdades = sumaEdades + edad;
            sumaEdades+=edad;
            i++; //iteración         
        }
        //3. Con do while
        do{
             //Leer las edades
            System.out.println("Introduzca la edad "+(i+1)+":");
            edad = leer.nextInt();
            //sumaEdades = sumaEdades + edad;
            sumaEdades+=edad;
            i++; //iteración     
        }while(i < cantEdades);*/
        //4. Con el for
        for(int y=0;y<cantEdades;y++){
            System.out.println("Introduzca la edad "+(y+1)+":");
            edad = leer.nextInt();
            //sumaEdades = sumaEdades + edad;
            sumaEdades+=edad;
        }
        promedio = sumaEdades / cantEdades;
        System.out.println("EL promedio de edades es:"+promedio);       
        
    }
    
}
