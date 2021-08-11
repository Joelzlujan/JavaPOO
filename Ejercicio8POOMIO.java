/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
• Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
• Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
• Método vecesRepetido(String letra), deberá recibir por parámetro un carácter
ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package ejercicio8poomio;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio8POOMIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Cadena cadena1 = new Cadena();
        CadenaServicio cs = new CadenaServicio();
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        cadena1.setFrase(frase);
        cadena1.setLongitud(frase.length());
        
        System.out.println("Ingrese una letra vocal a encontrar");
        char letra = leer.nextLine().charAt(0);
        cs.vecesRepetidas(frase, letra);
        
        System.out.println("Ingrese frase para comparar");
        String frase2 = leer.nextLine();
        cs.compararLongitud(frase, frase2);
        
        System.out.println("Ingrese frase a agregar");
        String frase3 = leer.nextLine();
        System.out.println(cs.unirFrases(frase, frase3));
        
        System.out.println("Ingrese letra para reemplazar por letra a");
        char letra2 = leer.nextLine().charAt(0);
        cs.reemplazarletra(frase, letra2);
        
        System.out.println("Ingrese letra para ver si se encuentra dentro de la frase");
        String letra3 = leer.nextLine();
        boolean contiene = cs.contiene(frase, letra3);
        if (contiene==true){
            System.out.println("La frase contiene el caracter ingresado");
        }else{
            System.out.println("La frase no contiene el caracter ingresado");
        }
        
    }
    
}
