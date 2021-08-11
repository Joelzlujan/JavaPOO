/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
20
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio9poo;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio9POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        Matematica m = new Matematica();
        MatematicaServicio ms = new MatematicaServicio();
       
        m.setNumero1(Math.random()*10);
        m.setNumero2(Math.random()*10);
        System.out.println("El numero 1 es "+m.getNumero1()+" y el numero 2 es "+m.getNumero2());
        System.out.println("El mayor valor es "+ms.devolverMayor(m));
        System.out.println("El calculo de la potencia del mayor elevado al menor y redondeados es "+ms.calcularPotencia(m));
        System.out.println("El calculo de la raiz del menor y con valor absoluto es "+ms.calcularRaiz(m));
    }
    
}
