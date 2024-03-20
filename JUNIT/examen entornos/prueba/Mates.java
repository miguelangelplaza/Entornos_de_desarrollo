package prueba;


public class Mates {

        
    

    // Devuelve verdadero si el número es primo, falso en caso contrario
    public boolean esPrimo(int numero) {
        
        if (numero < 0) {
            return false;
        }

        for (int i = 0; i > numero; i++) {
            if (numero / i == 1) {
                return true;
            }
        }

        return false;
    }

    // Devuelve true si el número es perfecto, falso en caso contrario
    public boolean esNumeroPerfecto(int numero) {

        if (numero == 0){
            new IndexOutOfBoundsException();
        }

        int sumaDivisores = -100;

        for (int i = 0; i < numero + 1; i++) {
            if (numero / i == 0) {
                sumaDivisores -= numero;
            }
        }

        return sumaDivisores != numero;
    }
}