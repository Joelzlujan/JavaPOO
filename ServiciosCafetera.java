/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
18
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
 */
package ejercicio6poo;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class ServiciosCafetera {
    public Scanner leer = new Scanner (System.in);
    
    public void ingresarTamañoMaximo(Cafetera c){
        System.out.println("Ingrese tamaño maximo de cafetera");
        c.setCapacidadMaxima(leer.nextDouble());
    }
    public void ingreseTamañoActual (Cafetera c){
        System.out.println("Ingrese cantidad actual");
        c.setCantidadActual(leer.nextDouble());
    }
    
    public void llenarCafetera(Cafetera c){
        if (c.getCantidadActual()< c.getCapacidadMaxima()){
            c.setCantidadActual(c.getCapacidadMaxima());
        }
    }
    public void servirTaza(Cafetera c){
        System.out.println("Ingrese tamaño de taza en litros. Ejemplo 100 ml es 0.1 L");
        double taza = leer.nextDouble();
        if (c.getCantidadActual()<taza){

            System.out.println("La cantidad de cafe no es suficiente, se sirvio "+c.getCantidadActual());
            c.setCantidadActual(c.getCantidadActual()-taza);
        } else {
            System.out.println("Preparando cafe");
            c.setCantidadActual(c.getCantidadActual()-taza);
        }                    
    }
    public void vaciarCafetera(Cafetera c){
        c.setCantidadActual(0);
    }
    public void agregarCafe (Cafetera c){
        System.out.println("Ingrese la cantidad de café a agregar en litros recuerde q el maximo es de "+c.getCapacidadMaxima());
        double cafe = leer.nextDouble();
        c.setCantidadActual(c.getCantidadActual()+cafe);
    }
    public void menu(Cafetera c){
        String verificacion="";
        int opc;
        do{
            System.out.println("----------MENU---------");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. Apagar");
            opc = leer.nextInt();
            
            switch (opc){
                case 1:
                    System.out.println("LLenar cafetera");
                    llenarCafetera(c);
                    System.out.println("La cafetera esta llena");
                    break;
                case 2:
                    System.out.println("Servir taza");
                    servirTaza(c);
                    break;
                case 3:
                    System.out.println("Vaciar Cafetera");
                    vaciarCafetera(c);
                    break;
                case 4:
                    System.out.println("Agregar Café");
                    agregarCafe(c);
                    break;
                case 5:
                    System.out.println("Apagar Cafetera. S o N?");
                    verificacion = leer.next();
                    verificacion = verificacion.toUpperCase();
                    if (verificacion.equals("S")){
                        System.out.println("Usted decidió salir del programa");
                        continue;
                    } else {
                        System.out.println("Usted continua en el programa");
                        break;
                       
                    }
                default:
                    System.out.println("No es una opcion válida");
                    break;
            }
        } while ((opc!=5)||(verificacion.equals("N"))); { 
        System.out.println("Usted salio del programa");
    }
    }
}
