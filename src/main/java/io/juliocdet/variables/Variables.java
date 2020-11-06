package io.juliocdet.variables;

public class Variables {
    public static void main(String[] args) {
        boolean esVerdad = true; // Sirve para almacenar valores boleanos
        System.out.println("esVerdad = " + esVerdad);

        char vocal = 'c'; // Typo de dato utilizado para almacener caracteres
        System.out.println("vocal = " + vocal);

        byte byte1 = -128; // -128 a 128 (tamaño de 1 byte)
        System.out.println("byte1 = " + byte1);

        short numerito = 233; // Tamaño de 2 bytes
        System.out.println("numerito = " + numerito);

        int numeroX = 128000; // es de 4 bytes
        System.out.println("numeroX = " + numeroX);

        long numerote = 2000000L; // guarda hasta 8 bytes
        System.out.println("numerote = " + numerote);

        float numeroDecima = 200000.3F; //Nos guarda numeros decimaless
        System.out.println("numeroDecima = " + numeroDecima);

        double fraccionGrande = 3.141593; // Nos almacena numeros decimales con muchas mas precision.
        System.out.println("fraccionGrande = " + fraccionGrande);

        /// COnversiones ///
        System.out.println("********Conversiones******");

        int enteroCovertido;
        byte pequenito = 120;
        short numerito2 = 200;

        enteroCovertido = pequenito; // Casteo implicito dado que el tipo de dato que asignareemos es mas peuqño que donde se va a guardar
        System.out.println("enteroCovertido= " + enteroCovertido);
        enteroCovertido = numerito2;
        System.out.println("enteroCovertido= " + enteroCovertido);

        short numerito3 = 67;
        byte pequeñito2 = (byte) numerito3; // Casteos de short a byte. Convierte de un tipo de dato a otro
        System.out.println(pequeñito2);
    }
}
