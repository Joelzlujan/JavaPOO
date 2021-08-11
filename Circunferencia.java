/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Circunferencia {
    private double radi;
    
    public Circunferencia(){
        
    }
    
    public Circunferencia(double radi) {
    this.radi = radi;
}
   public double getRadi(){
    return radi;
}
   public void setRadi(double radi) {
       this.radi= radi;
}

 public void crearCircunferencia(){
     Scanner leer = new Scanner(System.in);
     System.out.println("Ingrese radio de la circunferencia");
     radi = leer.nextDouble();
 }
 public void area(){
     double area;
     area = Math.PI * Math.pow(radi, 2);
     System.out.println("El area de la circunferencia es "+area);
 }
 public void perimetro(){
     double perimetro;
     perimetro = 2 * Math.PI * radi;
     System.out.println("El perimetro de la circunferencia es "+perimetro);
 }
}

