package io.juliocdet.lambdas;

import io.juliocdet.models.Credencial;

import java.util.Scanner;
import java.util.UUID;
import java.util.function.Consumer; // Tomar valores y no retornar nada. void NommbreDeMiFun(parametro) {}
import java.util.function.Function; // Toma valores y retorna valores. double sumar(int, int)
import java.util.function.Predicate; // Tomar un valor, hace una evaludacion y retorna true false. boolean valdarEdad(int)
import java.util.function.Supplier; // Te retorna valores sin necesidead de que el pases algun valor. int generarid()

public class UsoDeLambas {

    public static void creacionDeLambdas() {
        /* Para este ejemplo declaramo primero todas las lambdas que necitaremos */

        /* Te genera un numero Random pasa ser usado como Id */
        Supplier<String> generarIDs = () -> UUID.randomUUID().toString();
        // Supplier<String> generarIDs2 = () -> { return UUID.randomUUID().toString(); }; esto es lo mismo que la linea de arriba

        /*
         * Ejemplo del formato que se espera de los datos
         * Nombre: Julio Edad: 24 Nacionalidad: Mexicana ID: 1242433214
         */
        Consumer<String> mostrarInfo = (datos) -> {
            String[] arrayDeDatos = datos.split(" ");
            for(int i = 0; i < arrayDeDatos.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(arrayDeDatos[i]);
                } else {
                    System.out.println(arrayDeDatos[i]);
                }
            }
        };

        /* Valida usando si la nacionalidad dada es valida o no */
        Predicate<String> validarNacionalidad = (nacionalidad) -> {
            return nacionalidad.equalsIgnoreCase("mexicana") ? true : false;
        };

        Predicate<String> validarEdad = (edad) -> {
            int edadInt = Integer.parseInt(edad);
            if (edadInt >= 0 && edadInt < 130) {
                return true;
            }
            return false;
        };

        Function<String, Credencial> getCredencial2 = (datos) -> Credencial.crearCredencial(datos);

        Function<String, Credencial> getCredencial3 = (datos) -> {
            return Credencial.crearCredencial(datos);
        };

        Function<String, Credencial> getCredencial = Credencial::crearCredencial;



        /* Logica de nuestro metodo */
        Scanner scanner = new Scanner(System.in);
        StringBuilder datos = new StringBuilder();

        /* Logica principal */
        System.out.println("Ingresa tus datos:");
        System.out.println(" Nombre: ");
        datos.append("Nombre: ").append(scanner.nextLine());
        System.out.println(" Edad: ");
        String edad = scanner.nextLine();
        datos.append(" Edad: ").append(edad);
        System.out.println(" Nacionalidad: ");
        String nacionalidad = scanner.nextLine();
        datos.append(" Nacionalidad: ").append(nacionalidad);
        datos.append(" ID: ").append(generarIDs.get());
        System.out.println();
        System.out.println("Valiendo tu informacion... ");

        if (!validarEdad.test(edad)) {
            System.out.println("Edad no correcta");
        } else {
            if (validarNacionalidad.test(nacionalidad)) {
                System.out.println("Muchas gracias, tu credencial es: ");
                System.out.println();
                mostrarInfo.accept(datos.toString());
                System.out.println();

                Credencial credencial = getCredencial.apply(datos.toString());
                System.out.println("Datos de Credencial:");
                System.out.println(credencial.getNombre() + " "
                        + credencial.getEdad() + " "
                        + credencial.getNacionalidad() + " "
                        + credencial.getId());
            }
            else {
                System.out.println("Lo sentimos, este tramite solo es valido para personas con nacionalidad mexicana");
            }
        }
    }

}
