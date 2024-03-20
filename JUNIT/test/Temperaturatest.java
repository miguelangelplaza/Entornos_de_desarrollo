package test;


/**
 * Casos de prueba para la Temperatura
 * 
 * @author Francisco Javier Cabello Rueda
 */

 import static org.junit.Assert.*;
 import org.junit.Test;

import pruebas.Temperatura;

public class Temperaturatest {
  
  @Test
  public void testCelsius() {
      Temperatura temperatura = new Temperatura();
      assertEquals(32,temperatura.Celsius(0),0.1);
      assertEquals(-58,temperatura.Celsius(-50),0.1);
      assertEquals(122,temperatura.Celsius(50),0.1);
  }
  
  @Test
  public void testFahrenheit() {
    Temperatura temperatura = new Temperatura();
    assertEquals(-17.778,temperatura.Fahrenheit(0),0.1);
    assertEquals(-45.556,temperatura.Fahrenheit(-50),0.1);
    assertEquals(10,temperatura.Fahrenheit(50),0.1);
  }
}
