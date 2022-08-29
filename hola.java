import java.util.Scanner;

class hola {
  public static void main (String [] args) {
    // Declaramos variables
    String campeon = "ARGENTINA";
    String equipo = "";
    String salida = "";
    // Instanceamos la clase scanner
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese su nombre "); // Mostramos por pantalla

    String nombre = leer.nextLine(); // El usuario ingresa por pantalla
    System.out.println("Hola " + nombre); // Mostramos el mensaje
    // Bucle while
    while(!(equipo.equals(campeon))) {
      System.out.println("Quien va a ganar el mundial? ");
      equipo = leer.nextLine().toUpperCase(); // ejecutamos el método para
      // poner el string en mayusculas y no afectar la lógica

      if (equipo.equals(campeon)) {
        System.out.println("SI OBVIO, VAMOS ARGENTINA!");
        break; // utilizamos break para terminar el bucle si se ingresa acá
      } else {
        System.out.println("NO");
      }

      System.out.println("Queres seguir intentando? S/N");
      salida = leer.nextLine().toUpperCase();
      System.out.println("El valor de salida es " + salida);

      if(salida.equals("N")) {
        System.out.println("Bueno, la respuesta era " + campeon);
        break;
      }

    }
  }
}