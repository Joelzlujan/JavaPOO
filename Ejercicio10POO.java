/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package ejercicio10poo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio10POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        Arreglos a = new Arreglos();
        
        double arreglo1[] = new double[50];
        double arreglo2[] = new double[20];
        
        for (int i = 0; i < 50; i++) {
            arreglo1[i]=Math.random()*100;
            System.out.println(arreglo1[i]);
        }
        
        Arrays.sort(arreglo1);                           //ordeno el arreglo 1 
        System.out.println("El arreglo A ordenado es "); 
        for (int i = 0; i < 50; i++) {                                              
            
            System.out.println(arreglo1[i]);                //muestro el arreglo 1 ordenado
        }

        
        for (int i = 0; i < 10; i++) {              //lleno el arreglo 2 con los primeros 10 ordenados del arreglo1
            arreglo2[i]=arreglo1[i];
        }
        
        for (int i = 10 ; i < 20; i++) {            //lleno el arreglo 2 del 10 al 20 con 0.5
            arreglo2[i]= 0.5;
        }
        
        a.setArregloA(arreglo1);
        a.setArregloB(arreglo2);
        
        System.out.println("El arreglo A es ");
        System.out.println(Arrays.toString(a.getArregloA()));
        System.out.println("El arreglo B es ");
        System.out.println(Arrays.toString(a.getArregloB()));
    }
    
}
