package io.juliocdet.funciones;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumerosRomanos {

    /*
    * Test data:
    * I = 1
    * II = 2
    * III = 3
    * IV = 4
    * IX = 9
    * XLIV = 44
    * LVIII = 58
    * MCMXCIV = 1994
    * MCCXLV = 1245
    * DCCCXXXVII = 837
    * */

    public static int romanToInt(String s) {
        // Crear mapa de los valores romandos a decimal
        Map<String, Integer> ROMAN_STRING_MAP = new HashMap<>();
        ROMAN_STRING_MAP.put("I", 1);
        ROMAN_STRING_MAP.put("V", 5);
        ROMAN_STRING_MAP.put("X", 10);
        ROMAN_STRING_MAP.put("L", 50);
        ROMAN_STRING_MAP.put("C", 100);
        ROMAN_STRING_MAP.put("D", 500);
        ROMAN_STRING_MAP.put("M", 1000);

        // Obtener lista de caracteres como string
        List<String> listaDeLetras = s.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.toList());

        // SI es de un solo elemento retornar directamente el numero del mapa
        if (listaDeLetras.size() == 1) {
            return ROMAN_STRING_MAP.get(listaDeLetras.get(0));
        }

        int numAnterior = 0;
        int numActual = 0;
        int total = 0;

        // Iterar y evaluar las letras
        for (int i = 0; i < listaDeLetras.size(); i++) {
            // obtener la representacion numerica decimal del romano actual
            numActual = ROMAN_STRING_MAP.get(listaDeLetras.get(i));
            // En caso de tener reiniciado el numero anterior asignar el valor
            // actual para no perderlo y utilizarlo en la siguiente iteraccion
            if (numAnterior == 0 && i != listaDeLetras.size() - 1 ) {
                numAnterior = numActual;
                continue;
            } else if (numAnterior < numActual) { // Si es el numero anterior
                total += numActual - numAnterior; // ejecutar la resta
                numAnterior = 0;
            } else {
                if (i == listaDeLetras.size() - 1) {  // Si no fue necesario hacer la resta
                    total += numActual + numAnterior; // sumar los dos ultimos numeros al total
                } else {
                    total += numAnterior; // Si no fue necesario hacer la resta sumar al total
                    numAnterior = numActual; // el valor anterior y setearlo como el avalor anterior
                }
            }
        }
        return total;
    }
}
