/*
 Escriba una aplicación que pida al usuario que escriba dos números,
que obtenga los números del usuario e imprima la suma, producto, 
diferencia y cociente (división) de los números. Use las técnicas 
que se muestran en la figura 2.7.
*/
import java.util.Scanner;

class Aritmetica {
  public static void main(String []args) {
    Scanner leer = new Scanner(System.in);
    // Se declaran las variables de numeros de netrada y resultados
    int num1, num2, suma, producto, diferencia;
    double division;

    // Mensaje e ingreso de datos
    System.out.println("Escriba el primer numero entero");
    num1 = leer.nextInt();
    
    System.out.println("Escriba el segundo numero entero");
    num2 = leer.nextInt();
    
    // Cuentas realizadas
    suma = num1 + num2;
    producto = num1 * num2;
    diferencia = num1 - num2;
    division = num1 / num2;
    
    // Resultados por pantalla
    System.out.println("La suma entre los 2 numeros es " + suma);
    System.out.println("El producto entre los 2 numeros es " + producto);
    System.out.println("La diferencia entre los 2 numeros es " + diferencia);
    System.out.println("La division entre los 2 numeros es " + division);

  }
}