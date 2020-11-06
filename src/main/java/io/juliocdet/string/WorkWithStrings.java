package io.juliocdet.string;

import io.juliocdet.models.Carro;

import java.util.Arrays;
import java.util.Scanner;

public class WorkWithStrings {

    public static final String BASE_EMAIL = "@gmail.com";
    public static final int MAYORIA_DE_EDAD = 18;

    public static void metodosDeLasStrings() {
        String saludo = "hola como estan?";
        String nombre = "Pablo";

        // String .getbytes  y Arrays
        byte[] misHeadersARetornar = saludo.getBytes();
        System.out.println("La cadena original es: " + saludo);
        System.out.println("La cadena como byteArray: " + Arrays.toString(misHeadersARetornar));

        // Concadenaciones usando .concat, String.format, y StringBuilder.
        System.out.println(saludo.concat(nombre));

        System.out.println(String.format("%s%s", saludo, nombre));

        Carro carro = new Carro("Ford", 1963);
        StringBuilder stringBuilder = new StringBuilder()
                .append(carro)
                .append(" ").append("Descriptions:")
                .append("Esta carro es muy buen");
        System.out.println(stringBuilder.toString());

        // Split
        String[] saludoSeparado = saludo.split(" ");
        System.out.println(Arrays.toString(saludoSeparado));

        // Lenght y substring
        String palindromo = "anitalabalatina";
        String miniString = palindromo.substring(6); // Iniciando desde el index especificado
        System.out.println(miniString);
        int mitad = palindromo.length() / 2; // Nos retorna el tamaño de la string y en este caso el valor lo partimos por mitad
        String palindromoPrimeraMitad = palindromo.substring(0, mitad); // Desde (incluyendo, hasta excluyendo) index
        String palindromoSegundamitad = palindromo.substring(mitad + 1); // Te retorna la string desde el index dado hasta donde termine
        System.out.println(palindromoPrimeraMitad); // Mostramos la primera mitad de la string
        System.out.println(palindromoSegundamitad); // Mostramos la segunda mitad de la string
        StringBuilder palindromoSegundaMitadStringBulder = new StringBuilder(palindromoSegundamitad);
        boolean esPalindromo = palindromoPrimeraMitad.equals(palindromoSegundaMitadStringBulder.reverse().toString());
        System.out.println(esPalindromo);


        // CharAt, toUpperCase(), toLoweCase, LastIndexOF, contains
        String pais = "Irlanda";
        String json = "{\"message\": \"\"Hola como estan\"}";
        System.out.println(pais.toUpperCase());
        System.out.println(pais.toLowerCase());
        System.out.println(pais.lastIndexOf("a"));
        System.out.println(json.startsWith("{"));
        System.out.println(json.endsWith("}"));
        System.out.println(json.contains("message"));
    }

    public static String constuirNombre(String nombre, String apeido) {
        return nombre + apeido;
    }

    public static void stringLiteralesVsVariables() {

        String myString = "Esta es una String literal..."; // String creado usando
        String myString2 = new String("fsaafs"); // String creado atravez de constructor
        String variable1 = Float.toString(121.2F); // String creadda atravez de un metodo.

        // int mayoriaDeEdad = 18; // Este es un int literal
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu apeido: ");
        String apeido = sc.nextLine();
        String nombreCompleto = constuirNombre(nombre, apeido);
        System.out.println(nombreCompleto);
        System.out.println("ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad >= MAYORIA_DE_EDAD) {
            System.out.println("Puede entrar");
        } else {
            System.out.println("Sorry no entras");
        }

    }
}
