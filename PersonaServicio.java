/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Ejemplo Date como atributo: DateAtributo
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada.
Tener en cuenta que para conocer la edad de la persona también se debe
conocer la fecha actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro
otra edad y retorna true en caso de que el receptor tenga menor edad que la
persona que se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior
 */
package ejercicio12poo;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public void crearPersona(Persona p){
        System.out.println("Ingrese nombre de persona");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese fecha de nacimiento dia");
        int dia= leer.nextInt();
        System.out.println("Ingrese fecha de nacimiento mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese Año de nacimiento");
        int anio = leer.nextInt();
        Date fechaNacimiento = new Date(anio-1900,mes-1,dia);
        p.setDateAtribute(fechaNacimiento);

    }
    public int calcularEdad(Persona p){
        Date fechaActual = new Date();
        if ((fechaActual.getDay()<p.getDateAtribute().getDay())&&(fechaActual.getMonth()<=p.getDateAtribute().getMonth())){
         return (fechaActual.getYear()-1-p.getDateAtribute().getYear());   
        } else return (fechaActual.getYear()-p.getDateAtribute().getYear());
        
    }
    public boolean menorQue(int edadpropia,int edad){
        if (edadpropia>edad){
            return true; //true si la edad nueva es menor
        } else {
            return false;//false si la edad nueva es mayor
        }
        
    }
    public void mostrarPersona(Persona p){
        System.out.println("El nombre de la persona ingresada es "+p.getNombre());
        System.out.println("La fecha de nacimiento de la persona ingresada es "+p.getDateAtribute().getDate()+"-"+(p.getDateAtribute().getMonth()+1)+"-"+p.getDateAtribute().getYear());
    }
}
