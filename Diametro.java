/*  Java también puede representar números de punto flotante que contienen puntos
 decimales, como 3.14159. Escriba una aplicación que reciba del usuario el radio 
 de un círculo como un entero, y que imprima el diámetro, la circunferencia y el 
 área del círculo mediante el uso del valor de punto flotante 3.14159 para π.
*/

import java.util.Scanner;

class Diametro {
  public static void main(String[]args) {
    // Declaramos las variables
    int radio;
    double diametro, circunferencia, area;

    // Instanceamos la clase scanner en el objeto leer
    Scanner leer = new Scanner(System.in);
    
    // Ingreso del radio
    System.out.println("Ingrese un numero entero como radio");
    radio = leer.nextInt();
    
    // Cuentas para obtener los resultados
    diametro = 2 * radio;
    circunferencia = 2 * Math.PI * radio;
    area = Math.PI * (radio*radio);

    // Muestro los resultados por pantalla
    System.out.println("El diametro para ese radio es " + diametro);
    System.out.println("La circunferencia para ese radio es " + circunferencia);
    System.out.println("El area para ese radio es " + area);


  }
}