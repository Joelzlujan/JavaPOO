/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de
nacimiento (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los
siguientes métodos:
Ejemplo Date como atributo: DateAtributo
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta
al usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos
que la fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
21
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

/**
 *
 * @author Joel
 */
public class Persona {
    private String nombre;
    private Date DateAtribute;

    public Persona() {
    }

    public Persona(String nombre, Date DateAtribute) {
        this.nombre = nombre;
        this.DateAtribute = DateAtribute;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getDateAtribute() {
        return DateAtribute;
    }

    public void setDateAtribute(Date DateAtribute) {
        this.DateAtribute = DateAtribute;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", DateAtribute=" + DateAtribute + '}';
    }
    
    
}
