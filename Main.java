class Main {
  public static void main(String[] args) {
    System.out.println("Hello world");
    Persona persona1 = new Persona("Gonzalo", "Pozzoli", 40423123, "alsina", "Buenos Aires", "Quilmes");
    
    String datos = persona1.getData();

    System.out.println(datos);
  }  
}
