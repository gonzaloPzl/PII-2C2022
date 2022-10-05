import java.util.Arrays;

class Banco {

  public static void main (String [] args) {

    // CREACIÓN DE CLASE PERSONA
    class Persona {
      protected String nombre;
      protected String apellido;
      protected long dni;
      protected String direccion;
      protected String ciudad;
      protected String provincia;
  
      public Persona(String nombre, String apellido, long dni, String direccion, String ciudad, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
      }
  
      public String getData() {
        String data = "Nombre: " + nombre + "\nApellido: " + apellido + "\nDNI: " + dni + "\nDirección: " + direccion + "\nCiudad: " + ciudad + "\nProvincia";

        return data;
      }
    }

    class abstract Cuenta {
      protected static ultimaCbu = 1234567890;
      protected long cbu;
      protected Persona titular;
      protected double saldo;

      protected Cuenta(Persona cliente) {
        this.titular = clienta;
        this.cbu = ++ultimaCbu;
        this.saldo = 0.0;
      }

      // consulta de

    }

    // CREACIÓN DE USUARIO
    Persona usuario1 = new Persona("Gonzalo", "Pozzoli", 42463563, "Alsina 869", "Quilmes", "Buenos Aires");

    // IMPRIMIMOS LOS DATOS DEL USUARIO CON EL GET
    String datosDeAlguien = usuario1.getData();
    System.out.println(datosDeAlguien);


  } 
}