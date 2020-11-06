package io.juliocdet.funciones;

public class Palindromo {

    /**
     * Valida si una palabra dada es palindromo o no.
     * Utiliza iteracion y comparacion de los caracteres de las dos mitades
     * para corroborar que sean iguales.
     * @param palabra (String) La palabra a validar
     * @return boolean Regresa true si la palabra dada es palindromo
     * y retorna false en caso contrario.
     */
    public static boolean esPalindromo(String palabra) {
        char[] palabraAsCharArray = palabra.toCharArray();
        for (int i = 0; i < palabraAsCharArray.length / 2; i++) {
            if (palabraAsCharArray[i] != palabraAsCharArray[palabraAsCharArray.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Valida si una palabra dada es palindromo o no.
     * Utiliza un StringBuilder para usar el metodo revers de este, y
     * comparar los invertidos.
     * @param palabra (String) La palabra a validar
     * @return boolean Regresa true si la palabra dada es palindromo
     * y retorna false en caso contrario.
     */
    public static boolean esPalindromoUsingList(String palabra) {
        StringBuilder palabraRevers = new StringBuilder(palabra).reverse();
        return palabra.equals(palabraRevers.toString());
    }
}
