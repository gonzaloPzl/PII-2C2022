/*
 * Cree una clase llamada Empleado, que incluya tres variables de instancia: 
 * un primer nombre (tipoString), un apellido paterno (tipoString) y un salario 
 * mensual (double). Su clase debe tener un constructor que inicialice las tres
 * variables de instancia. Proporcione un método establecer y un método obtener 
 * para cada variable de instancia. Si el salario mensual no es positivo, no 
 * establezca su valor. Escriba una aplicación de prueba llamada PruebaEmpleado, 
 * que demuestre las capacidades de la clase Empleado. Cree dos objetos Empleado y 
 * muestre el salario anual de cada objeto. Después, proporcione a cada Empleado 
 * un aumento del 10% y muestre el salario anual de cada Empleado otra vez.
 */

class Empleado {
  private String nombre;
  private String apellido;
  private double salario;

  // Declaramos el constructor que incializa las variables con los valores de parametro
  public Empleado(String nombre, String apellido, double salario) {
    this.nombre = nombre;
    this.apellido = apellido;
    if (salario > 0.0) {
      this.salario = salario;
    }
  }

  // Declaramos los métodos que establecen las variables
  public void establecerNombre(String nombre) {
    this.nombre = nombre;
  }

  public void establecerApellido(String apellido) {
    this.apellido = nombre;
  }

  public void establecerSalario(double salario) {
    if (salario > 0.0) {
      this.salario = salario;
    } else {
      System.out.println("El salario establecido no puede ser menor a 0");
    }
  }

  // Declaramos los métodos para obtener los valores de las variables
  public String obtenerNombre() {
    return nombre;
  }

  public String obtenerApellido() {
    return apellido;
  }

  public double obtenerSalario() {
    return salario;
  }

}