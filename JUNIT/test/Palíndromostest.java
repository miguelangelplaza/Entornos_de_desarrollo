package test;

/**
 * Casos de prueba para los palíndromos
 * 
 * @author Francisco Javier Cabello Rueda
 */

 import static org.junit.Assert.*;
 import org.junit.Test;

import pruebas.Palindromo;

public class Palíndromostest {

   @Test
  public void testPalindromo() {
      Palindromo palindromo = new Palindromo();
      assertTrue(palindromo.palindromo("ana"));
      assertFalse(palindromo.palindromo("mesa"));
      assertTrue(palindromo.palindromo("10aa01"));
  }
}
