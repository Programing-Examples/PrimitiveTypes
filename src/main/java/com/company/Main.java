package main.java.com.company;

public class Main {

    public static void main(String[] args) {
        byte byteVar;
        char charVar;
        short shortVar;
        int intVar;
        float floatVar;
        long longVar;
        double doubleVar;

        System.out.println("Size of byte: " + (Byte.BYTES) + " bytes.");
        System.out.println("Size of short: " + (Short.BYTES) + " bytes.");
        System.out.println("Size of int: " + (Integer.BYTES) + " bytes.");
        System.out.println("Size of long: " + (Long.BYTES) + " bytes.");
        System.out.println("Size of char: " + (Character.BYTES) + " bytes.");
        System.out.println("Size of float: " + (Float.BYTES) + " bytes.");
        System.out.println("Size of double: " + (Double.BYTES) + " bytes.");

        System.out.println("Maximo short: " + Short.MAX_VALUE);
        System.out.println("Maximo short: " + Short.MIN_VALUE);
        System.out.println("Maximo long: " + Long.MAX_VALUE);

        charVar = 'a';

        System.out.println("Nuestro caracter es: " + Integer.valueOf(charVar));
        System.out.println("Nuestro caracter es: " + Integer.valueOf('b'));
        System.out.println("Nuestro caracter es: " + Character.toChars(1));

        intVar = 2;
        floatVar = (float) 2.5;

        System.out.println("2 / 3 = " + (2.0/3.0));



    }
}
