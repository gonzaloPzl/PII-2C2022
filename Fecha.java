/*
 * Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes
 * (tipo int), un día (tipo int) y un año (tipo int). Su clase debe tener un 
 * constructor que inicialice las tres variables de instancia, y debe asumir que 
 * los valores que se proporcionan son correctos. Proporcione un método establecer 
 * y un método obtener para cada variable de instancia. Proporcione un método 
 * mostrarFecha, que muestre el mes, día y año, separados por barras diagonales 
 * (/). Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las 
 * capacidades de la clase Fecha.
 */

class Fecha {
  private int mes;
  private int dia;
  private int annio;

  public Fecha(int mes, int dia, int annio) {
    this.mes = mes;
    this.dia = dia;
    this.annio = annio;
  }

  // Métodos establecer para cada variable
  public void establecerMes(int mes) {
    this.mes = mes;
  }

  public void establecerDia(int dia) {
    this.dia = dia;
  }

  public void establecerAnnio(int annio) {
    this.annio = annio;
  }

  // Métodos para obtener los diferentes datos
  public int obtenerMes() {
    return mes;
  }

  public int obtenerDia() {
    return dia;
  }
  
  public int obtenerAnnio() {
    return annio;
  }

  // Método para mostrar la fecha
  public String mostrarFecha() {
    String fecha = mes + "/" + dia + "/" + annio;
    System.out.println(fecha);    
    return fecha;
  }
}