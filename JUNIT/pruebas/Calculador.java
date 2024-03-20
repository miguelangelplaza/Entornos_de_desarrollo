package pruebas;
/**
 * Calculador
 */
public class Calculador {
  public int suma (int a,int b){
    int resultado = a + b;
    return resultado;
  }

  public int resta (int a,int b){
    int resultado = a - b;
    return resultado;
  }

  public int multiplicacion (int a,int b){
    int resultado = a * b;
    return resultado;
  }

  public int division (int a,int b){
    if (b == 0) {
      return 0 ;
    } else {
      int resultado = a / b;
    return resultado;
    }
    
  }
}
