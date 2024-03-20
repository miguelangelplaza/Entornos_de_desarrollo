package depurar;

/**
 * Calculadora
 */
public class Calculadora {
  public static int dividir(int numerador, int denominador) {
  int resultado = 0;
  try {
  resultado = numerador / denominador;
  } catch (ArithmeticException e) {
  System.out.println("Error: División por cero no permitida");
  }
  return resultado;
  }
  public static void main(String[] args) {
  int num1 = 10;
  int num2 = 2;
  int resultado = dividir(num1, num2);
  System.out.println("El resultado de la división es: " + resultado);
  }
  }
  