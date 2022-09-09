/*
Modifique la clase Cuenta (figura 3.8) para proporcionar un método llamado retirar
, que retire dinero de un objeto Cuenta. Asegúrese de que el monto a retirar no 
exceda el saldo de Cuenta. Si lo hace, el saldo debe permanecer sin cambio y el 
método debe imprimir un mensaje que indique “El monto a retirar excede el saldo 
de la cuenta”. Modifique la clase PruebaCuenta (figura 3.9) para probar el método retirar.
 */

// No cuenta con la clase main ya que está dentro de la clase PruebaCuenta

public class CuentaModificada {
  private String nombre;
  private double saldo;

  public CuentaModificada(String nombre, double saldo) {
    this.nombre = nombre;
    if (saldo > 0.0) {
      this.saldo = saldo;
    }
  }

  public void depositar (double montoDeposito) {
    if (montoDeposito > 0.0) {
      saldo += montoDeposito;
    }
  }

  // método retirar
  public void retirar (double montoRetiro) {
    if (montoRetiro > saldo) { // consultamos si el retiro es mayor al saldo
      // Si lo es se muestra el mensaje de error
      System.out.println("El monto a retirar excede el saldo de la cuenta");
    } else if (montoRetiro <= saldo) { // si no, se descuenta del saldo
      saldo -= montoRetiro;
    }
  }

  public double obtenerSaldo() {
    return saldo;
  }

  public void establecerNombre(String nombre) {
    this.nombre = nombre;
  }

  public String obtenerNombre() {
    return nombre;
  }

}
