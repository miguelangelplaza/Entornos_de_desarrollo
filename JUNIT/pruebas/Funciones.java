package pruebas;

/**
 * Funciones
 * 
 * @author Francisco Javier Cabello Rueda
 */
public class Funciones {

  //INCIDENCIAS: Si b = 0 no se realiza, si a es negativo no se realiza correctamente
  // y el numero b no se tiene en cuenta en las operaciones

  //CORRECCIONES: Añadimos un if en casa de que "a" o "a y b" sean negativos
  //para realizar un cambio de signo y que el bucle se realice, ademas en el bucle "for"
  //sustituimos i = 1 por i = 0 para que la multiplicación se haga correctamente y cambiamos
  // "resultado += a" por "+= b" porque en el primer caso era como multiplicar "a" por "a"

  public int multiplicacion(int a, int b) {
      int resultado = 0;

      if ((a < 0) || (a < 0 && b < 0)) {
        a = -a;
        b = -b;
      }
      for (int i = 0; i < a; i++) {
          resultado += b;
      }
      return resultado;
  }

  //INCIDENCIAS: Se intentan sacar mas numeros de los que hay en el Array y en la variable "suma"
  //añade la cantidad que debería

  //CORRECCIONES: Se cambia el "i <= array.lenght" por "i < array.lenght" para que saque la cantidad
  //exacta de valores que hay almacenados y se cambia el signo - por un + que habia en la variable suma

  public double media(int[] array) {
      double suma = 0;

      for (int i = 0; i < array.length; i++) {
          suma += array[i];
      }
      return suma / array.length;  
  }
}
