package test;

/**
 * Casos de prueba para las Funciones
 * 
 * @author Francisco Javier Cabello Rueda
 */

import static org.junit.Assert.*;
import org.junit.Test;

import pruebas.Funciones;

public class Funcionestest {

  @Test
  public void testMultiplicacion() {
      Funciones funciones = new Funciones();

      assertEquals(0,funciones.multiplicacion(9, 0));
      assertEquals(15, funciones.multiplicacion(3, 5));
      assertEquals(0, funciones.multiplicacion(0, 2));
      assertEquals(-15, funciones.multiplicacion(-3, 5));
      assertEquals(-15, funciones.multiplicacion(5, -3));
      assertEquals(12, funciones.multiplicacion(-3, -4));
  }

  @Test
  public void testMedia() {
      Funciones funciones = new Funciones();

      // Casos de prueba para la media
      assertEquals(0.0, funciones.media(new int[]{0, 0, 0}), 0.1);
      assertEquals(2.66, funciones.media(new int[]{1, 2, 5}), 0.1);
      assertEquals(-1.0, funciones.media(new int[]{-3, -1, 1}), 0.1);
      assertEquals(3.0, funciones.media(new int[]{4, 2, 2, 3, 4}), 0.1);
  }
}