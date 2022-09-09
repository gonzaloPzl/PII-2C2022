class PruebaFecha {
  public static void main(String[]args) {
    Fecha fecha1 = new Fecha(12, 25, 1999);
    Fecha fecha2 = new Fecha(11, 15, 1905);

    //Mostramos ambas fechas por pantalla
    fecha1.mostrarFecha();
    fecha2.mostrarFecha();

    // Cambiamos los años de ambas fechas
    fecha1.establecerAnnio(2000);
    fecha2.establecerAnnio(2015);

    // Mostramos las fechas cambiadas solo de los años
    System.out.println("El año de la fecha 1 ahora es " + fecha1.obtenerAnnio());
    System.out.println("El año de la fecha 2 ahora es " + fecha2.obtenerAnnio());

    // Cambiamos los días y mostramos las fechas enteras
    fecha1.establecerDia(02);
    fecha2.establecerDia(28);

    // Mostramos las 2 fechas
    System.out.println("Las fechas completas son ");
    fecha1.mostrarFecha();
    fecha2.mostrarFecha();
  }
}