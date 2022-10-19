import java.util.Arrays;

class Banco {

  public static void main (String [] args) {

    // CREACIÓN DE USUARIO
    Persona usuario1 = new Persona("Gonzalo", "Pozzoli", 42463563, "Alsina 869", "Quilmes", "Buenos Aires");

    // IMPRIMIMOS LOS DATOS DEL USUARIO CON EL GET
    String datosDeAlguien = usuario1.getData();
    System.out.println(datosDeAlguien);


  } 
}