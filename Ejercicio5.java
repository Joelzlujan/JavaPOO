/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicio5entidades;

import ejercicio5.servicios.ServiciosCuenta;
import ejercicio5entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosCuenta sc = new ServiciosCuenta();
        Cuenta c1 = new Cuenta();
        sc.crearCuenta(c1);
        System.out.println(c1.toString());
        sc.Operaciones(c1);
    }

  /*  public static void Operaciones(){
        ServiciosCuenta sc = new ServiciosCuenta();
        Cuenta cl = new Cuenta();
        
        Scanner leer = new Scanner (System.in);
        int opc;
        String verificacion = "";
        do{
        System.out.println("Menú Opciones");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Extraccion dinero");
        System.out.println("3. Extraccion Rápida");
        System.out.println("4. Consultar Saldo");
        System.out.println("5. Consultar Mis Datos");
        System.out.println("6. Salir");
        opc=leer.nextInt();
        
        switch (opc){
            case 1:
                System.out.println("Ingresar dinero");
                sc.ingresarSaldo(cl);
                break;
            case 2: 
                System.out.println("Extracción de dinero");
                sc.sacardinero(cl);
                break;
            case 3:
                System.out.println("Extracción rápida");
                sc.extraccionrapida(cl);
                break;
            case 4:
                System.out.println("Consultar Saldo");
                sc.consultarsaldo(cl);
                break;
            case 5:
                System.out.println("Consultar mis Datos");
                sc.consultardatos(cl);
                break;
            case 6:
                System.out.println("Usted selecciono salir. Seguro S/N?");
                verificacion = leer.next();
                verificacion = verificacion.toUpperCase();
                if (verificacion.equals("S")){
                break;
                } else {
                    break;
                }
        }       
                        
        } while ((opc!=6) || (verificacion.equals("S")));{
        System.out.println("Usted salió del programa");
    }
                
    }*/
    }
    

