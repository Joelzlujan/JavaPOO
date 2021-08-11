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
public class MatematicaServicio {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public double devolverMayor (Matematica m){
        if (m.getNumero1()>m.getNumero2()){
            return m.getNumero1();
        } else {
            return m.getNumero2();
        }
    }
    public double calcularPotencia(Matematica m){
        double max = Math.max(m.getNumero1(),m.getNumero2());
        double min = Math.min(m.getNumero1(),m.getNumero2());
        return Math.pow(Math.round(max), Math.round(min));
    }
    public double calcularRaiz(Matematica m ){
        double min = Math.min(m.getNumero1(),m.getNumero2());
        return Math.sqrt(Math.abs(min));
    }        
}
