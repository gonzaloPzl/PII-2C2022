public class Cuenta {
  protected static long ultimoCbu = 1234567890;
  protected long cbu;
  protected Persona titular;
  protected double saldo;

  protected Cuenta(Persona cliente) {
    this.titular = cliente;
    this.cbu = ++ultimoCbu;
    this.saldo = 0.0;
  }

  // Setters
  
  public long getCbu() {
    return cbu;
  }
  public double getSaldo() {
    return saldo;
  }
  public Persona getTitular() {
    return titular;
  }

  // definicion de metodos abstractos
  
}