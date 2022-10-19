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