import java.util.Scanner;

// Esta clase ejecuta la clase de CuentaModificada

public class PruebaCuenta {

  public static void main(String[] args) {
    CuentaModificada cuenta1 = new CuentaModificada("Jane Green", 50.00);
    CuentaModificada cuenta2 = new CuentaModificada("Jonh Blue", -7.53);

    // Muestra el saldo incial de cada objeto
    System.out.println("Saldo de " + cuenta1.obtenerNombre() + " es de " + cuenta1.obtenerSaldo());
    System.out.println("Saldo de " + cuenta2.obtenerNombre() + " es de " + cuenta2.obtenerSaldo());

    // Crea un objeto scanner para obtener el precio por pantalla
    Scanner leer = new Scanner(System.in);

    System.out.println("Escriba el monto a depositar en la cuenta 1: ");
    double montoADepositar = leer.nextDouble();

    System.out.println("Sumndo " + montoADepositar + " al saldo de la cuenta 1");

    cuenta1.depositar(montoADepositar);

    // Muestra los saldos
    System.out.println("Saldo de " + cuenta1.obtenerNombre() + ": " + cuenta1.obtenerSaldo());
    System.out.println("Saldo de " + cuenta2.obtenerNombre() + ": " + cuenta2.obtenerSaldo());


    System.out.println("Escriba el monto a depositar en la cuenta 2: ");
    montoADepositar = leer.nextDouble();

    cuenta2.depositar(montoADepositar);

    // Muestra los saldos
    System.out.println("Saldo de " + cuenta1.obtenerNombre() + ": " + cuenta1.obtenerSaldo());
    System.out.println("Saldo de " + cuenta2.obtenerNombre() + ": " + cuenta2.obtenerSaldo());

    // Realizamos una simulación de un retiro 
    System.out.println("Escriba el monto a retirar de la cuenta 1: ");
    double montoRetiro = leer.nextDouble();

    cuenta1.retirar(montoRetiro);

    // Muestra los saldos 
    System.out.println("Saldo de " + cuenta1.obtenerNombre() + ": " + cuenta1.obtenerSaldo());
    System.out.println("Saldo de " + cuenta2.obtenerNombre() + ": " + cuenta2.obtenerSaldo());

  }
}