class PruebaEmpleado {
  public static void main (String[] args) {
    // Instanceamos la clase Empleado en 2 objetos, empleado1 y empleado2
    Empleado empleado1 = new Empleado("Esteban", "Luke", 175050);
    Empleado empleado2 = new Empleado("Camila", "Holms", 255000);

    // Mostramos sus salarios anuales
    // Multiplicamos por 12 el salario devuelto para obtener el anual
    System.out.println("El salario anual de " + empleado1.obtenerNombre() + " " + empleado1.obtenerApellido() + " es $" + empleado1.obtenerSalario() * 12);
    System.out.println("El salario anual de " + empleado2.obtenerNombre() + " " + empleado2.obtenerApellido() + " es $" + empleado2.obtenerSalario() * 12);

    // llamamos a los metodos para modificar los valores del salario

    // Multiplicamos el salario actual por 0.1 para obtener el 10% del mismo
    // Luego lo sumamos al salario actual para obtener el salario final
    empleado1.establecerSalario((empleado1.obtenerSalario()* 0.10) + empleado1.obtenerSalario());
    empleado2.establecerSalario((empleado2.obtenerSalario()* 0.10) + empleado2.obtenerSalario());

    // Mostramos por pantalla los salarios con el incremento del 10%
    System.out.println("El salario anual con incremento del 10% de " + empleado1.obtenerNombre() + " " + empleado1.obtenerApellido() + " es $" + empleado1.obtenerSalario() * 12);
    
    System.out.println("El salario anual con incremento del 10% de " + empleado2.obtenerNombre() + " " + empleado2.obtenerApellido() + " es $" + empleado2.obtenerSalario() * 12);
  }
}