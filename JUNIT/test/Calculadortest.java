package test;

/**
 * Calculadortest
 */
import static org.junit.Assert.*;
import org.junit.Test;

import pruebas.Calculador;

public class Calculadortest {
 
  @Test
  public void testSuma() {
      Calculador calculador = new Calculador();
      assertEquals(9,calculador.suma(9, 0));
      assertEquals(5, calculador.suma(0, 5));
      assertEquals(-1, calculador.suma(1, -2));
      assertEquals(-8, calculador.suma(-3, -5));
      assertEquals(8, calculador.suma(5, 3));
      assertEquals(1, calculador.suma(-3, 4));
  }

  @Test
  public void testResta() {
      Calculador calculador = new Calculador();
      assertEquals(9,calculador.resta(9, 0));
      assertEquals(-5, calculador.resta(0, 5));
      assertEquals(3, calculador.resta(1, -2));
      assertEquals(2, calculador.resta(-3, -5));
      assertEquals(2, calculador.resta(5, 3));
      assertEquals(-7, calculador.resta(-3, 4));
  }

  @Test
  public void testMultiplicacion() {
      Calculador calculador = new Calculador();
      assertEquals(0,calculador.multiplicacion(9, 0));
      assertEquals(0, calculador.multiplicacion(0, 5));
      assertEquals(-2, calculador.multiplicacion(1, -2));
      assertEquals(15, calculador.multiplicacion(-3, -5));
      assertEquals(15, calculador.multiplicacion(5, 3));
      assertEquals(-12, calculador.multiplicacion(-3, 4));
  }

  @Test
  public void testDivision() {
      Calculador calculador = new Calculador();
      assertEquals(0,calculador.division(9, 0)); 
      assertEquals(0, calculador.division(0, 5));
      assertEquals(-2, calculador.division(4, -2));
      assertEquals(2, calculador.division(-10, -5));
      assertEquals(2, calculador.division(6, 3));
      assertEquals(-3, calculador.division(-12, 4));
  }
}
