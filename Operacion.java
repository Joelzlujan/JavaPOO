/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion() {                                //constructor vacio
    }

    public Operacion(int numero1, int numero2) {            //constructor parametrizado
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1(){                    //retorna el atributo q necesitamos
        return numero1;
    }
    public void setNumero1(int numero1){            //funcion q nos permite modificar 
        this.numero1 = numero1;     
    }
    
    public int getNumero2(){
        return numero2;
    }
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese numero 1");
        numero1 = leer.nextInt();
        System.out.println("Ingrese número 2");
        numero2 = leer.nextInt();
    }
    public void sumar(){
        int suma = numero1 + numero2;
        System.out.println("La suma de los dos números es "+suma);
    }
    public void restar(){
        int resta = numero1 - numero2;
        System.out.println("El resultado de la resta de los dos numeros es "+resta);
    }
    public void multiplicar(){
        int multiplicar;
        multiplicar = numero1 * numero2;
        if (numero1== 0 || numero2== 0){
            System.out.println("Uno de los números es 0, el resultado es "+multiplicar);
            
        } else System.out.println("El resultado de la multiplicación es "+multiplicar);
    }
    public void dividir(){
        int dividir;
        if (numero1==0 || numero2==0){
            System.out.println("Uno de los números es 0");
            dividir=0;
            System.out.println(""+dividir);
        } else dividir = numero1/numero2;
        System.out.println("El resultado de dividir ambos numeros es "+dividir);
    }
}
