/*
 * Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo 
 * del segundo e imprima el resultado. [Sugerencia: use el operador residuo].
 */

import java.util.Scanner;

class Multiplos {
  public static void main(String[]args) {
    // Declaramos las variables
    int num1, num2;

    // Mostramos por pantalla
    System.out.println("Programa para determinar si un numero es multiplo de otro");

    // Instanceamos la clase Scanner en leer
    Scanner leer = new Scanner(System.in);

    // Ingreso de datos por pantalla
    System.out.println("Ingrese el primero numero entero");
    num1 = leer.nextInt();

    System.out.println("Ingrese el segundo numero entero");
    num2 = leer.nextInt();

    // Mostramos por pantalla 
    if((num2%num1) == 0) {
      System.out.println(num1 + " Es multiplo de " + num2);
    } else {
      System.out.println(num1 + " No es multiplo de " + num2);
    }
  }
}