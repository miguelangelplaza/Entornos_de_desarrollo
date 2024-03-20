package pruebas; 



public class Palindromo {

  public boolean palindromo(String cadena){
    // Convertir la cadena a minúsculas
     cadena = cadena.toLowerCase();
        
    // Comparar la cadena original con su reverso
    int longitud = cadena.length();

    for (int i = 0; i < longitud / 2; i++) {
      if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
        return false; 
      }
    }
    return true; 
  }
}
