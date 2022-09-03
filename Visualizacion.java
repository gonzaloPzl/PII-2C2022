/*Escriba una aplicación que muestre un cuadro, un óvalo, una flecha y un 
  diamante usando asteriscos (*) 
 */

class Visualizacion {
  // Creamos un método dibujar de la clase Visualización que va a imprimir
  // un arreglo de strings que le venga por parametro
  public static void dibujar (String[] forma) {
    for(int i = 0; i < forma.length; i++) {
      System.out.println(forma[i]);
    }
  }
  public static void main ( String[] args) {
    // Definimos las constantes con las diferentes formas
    String[] CUADRADO = {"*********","*        *","*        *","*        *",
    "*        *","*        *","*        *","*        *","*********"};
    String[] OVALO = {"   ***   "," *      * ","*        *","*        *",
    "*        *","*        *","*        *"," *      * ","   ***   "};
    String[] FLECHA = {"    *    ","   ***   ","  *****  ","    *    ",
    "    *    ","    *    ","    *    ","    *    ","    *    "};
    String[] DIAMANTE = {"    *    ","   * *   ","  *   *  "," *     * ",
    "*       *"," *     * ","  *   *  ","   * *   ","    *    "};

    // Dibujamos las formas con el método antes definido
    dibujar(CUADRADO);
    dibujar(OVALO);
    dibujar(FLECHA);
    dibujar(DIAMANTE);
  }
}