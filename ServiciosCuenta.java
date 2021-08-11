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
package ejercicio5.servicios;

import ejercicio5entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class ServiciosCuenta {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearCuenta(Cuenta c) {                 
        
        System.out.println("Ingrese numero de cuenta");
        c.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese DNI");
        c.setDni(leer.nextInt());
        System.out.println("Ingrese Saldo Actual");
        c.setSaldo(leer.nextInt());
                 

    }
    
  /*  public Cuenta crearCuenta(){                                    // para q esto funcione tienen q estar todas las paginas en la misma carpeta
        Cuenta c = New Cuenta();
        System.out.println("Ingrese su numero de cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese su numero de dni");
        long dni = leer.nextLong();
        System.out.println("Ingrese su saldo actual");
        double saldoActual = leer.nextDouble();
        c.setNumeroCuenta(numeroCuenta);
        c.setDni(dni);
        c.setSaldo(saldoActual);
    }
    
   */

    public double ingresarSaldo(Cuenta c) {                        //como parametro entra una cuenta aca, para usar una determinada cuenta, es generico, lo importante es el tipo de dato

        System.out.println("Ingrese Monto a depositar");
        int nuevoingreso = leer.nextInt();
        c.setSaldo(c.getSaldo() + nuevoingreso);
        return c.getSaldo();
    }

    public double sacardinero(Cuenta c) {
        System.out.println("Ingrese monto a retirar");
        int nuevoegreso = leer.nextInt();
        if (nuevoegreso > c.getSaldo()) {
            System.out.println("Saldo insuficiente");
            return 0;
        } else {
            c.setSaldo(c.getSaldo() - nuevoegreso);
        }
        return c.getSaldo();
    }

    public double extraccionrapida(Cuenta c) {
        System.out.println("Ingrese monto a retirar");
        int extraccion = leer.nextInt();
        if (extraccion >= (0.2 * c.getSaldo())) {
            System.out.println("No se puede extraer mas del 20 porciento del total");
        } else {
            c.setSaldo(extraccion - c.getSaldo());
        }
        return c.getSaldo();
    }

    public void consultarsaldo(Cuenta c) {
        System.out.println(c.getSaldo());
    }

    public void consultardatos(Cuenta c) {
        System.out.println(c.getNumeroCuenta());
        System.out.println(c.getDni());
        System.out.println(c.getSaldo());
    }
       public void Operaciones(Cuenta c){
        //Cuenta c1 = new Cuenta();
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
                ingresarSaldo(c);
                break;
            case 2: 
                System.out.println("Extracción de dinero");
                sacardinero(c);
                break;
            case 3:
                System.out.println("Extracción rápida");
                extraccionrapida(c);
                break;
            case 4:
                System.out.println("Consultar Saldo");
                consultarsaldo(c);
                break;
            case 5:
                System.out.println("Consultar mis Datos");
                consultardatos(c);
                break;
            case 6:
                System.out.println("Usted selecciono salir. Seguro S/N?");
                verificacion = leer.next();
                verificacion = verificacion.toUpperCase();
                if (verificacion.equals("S")){
                continue;
                } else {
                    break;
                }
        }       
                        
        } while ((opc!=6) || (verificacion.equals("N")));{
        System.out.println("Usted salió del programa");
    }
                
    }

}
