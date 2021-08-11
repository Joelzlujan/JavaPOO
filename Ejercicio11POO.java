/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date(); 
 */
package ejercicio11poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio11POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        int dia,mes,anio;
        do{
        System.out.println("Ingrese dia");
        dia = leer.nextInt();
        System.out.println("Ingrese mes");
        mes = leer.nextInt();
        System.out.println("Ingrese año");
        anio=leer.nextInt();
        }while (dia<0||dia>31 || mes<0||mes>12||anio<0); //se evalua que los numeros ingresados sean fechas validas
        
         //Se crea un objeto tipo Date y se pasan los valores.(el año empieza en 1900 por lo hay que restarle 1900 al año ingresado, y el mes empieza en 0 por lo que hay que restarle 1 al mes ingresado)
        Date fecha1= new Date(anio-1900,mes-1,dia);
        System.out.println(fecha1);
        
        //Se crea otro objeto de tipo Date, al ser el constructor vacio, los valores que toma es la fecha actual.
        Date fechaActual = new Date();
        int diferenciaanios = fecha1.getYear() - fechaActual.getYear();
        int diferenciaMeses = fecha1.getMonth()-fechaActual.getMonth();
        int diferenciaDias = fecha1.getDay()-fechaActual.getDay();
        System.out.println("La diferencia en años es "+diferenciaanios+" .La diferencia en meses es "+diferenciaMeses+" y la diferencia en dias es "+diferenciaDias);
    }
    
}
