package pruebas;

public class Temperatura {

  public double Celsius(double a){
    double resultado = (a * 9/ 5) + 32;
    return resultado;
  }

  public double Fahrenheit(double a){
    double resultado = (a - 32) * 5 / 9;
    return resultado;
  }
}
