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

/**
 *
 * @author Joel
 */
public class CadenaServicio {
    public void mostrarVocales (String frase){
        int cont=0;
        frase=frase.toUpperCase();
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)=='A'||frase.charAt(i)=='E'||frase.charAt(i)=='I'||frase.charAt(i)=='O'||frase.charAt(i)=='U'){
        cont++;    
        }
        }
        System.out.println("La frase contiene "+cont+" vocales.");
    }
    public void invertirFrase(String frase){
        for (int i = frase.length()-1; i < 0; i--) {
            System.out.println(frase.charAt(i));
        }
        System.out.println("");
    }
    public void vecesRepetidas (String frase, char letra){
        frase = frase.toLowerCase();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i)==letra)
                contador++;
        }
        System.out.println("La letra "+letra+" se encuentra "+contador+" veces.");
    }
    public void compararLongitud(String frase, String frase2){
        if (frase.length()<frase2.length()){
            System.out.println("La frase ingresada tiene mas caracteres que la frase "+frase);
        }else{
            System.out.println("La frase ingresada tiene menos caracteres que la frase "+frase);
        }        
    }
    public String unirFrases(String frase,String frase3){
        String frases = frase+" "+frase3;
        return frases;
    }
    public void reemplazarletra(String frase, char letra2){
        System.out.println(frase.replace('a', letra2));
    }
    public boolean contiene(String frase, String letra3){
        if(frase.contains(letra3)){
            return true;
        } else {
            return false;
        }
    }
   
    
}
