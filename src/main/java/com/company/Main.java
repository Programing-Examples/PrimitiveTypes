package main.java.com.company;

public class Main {

    public static void main(String[] args) {
        /* Declaracion de variables:
        /* Tipo_de_dato nombre_variable valor_inicial(opcional)
         */
        byte byteVar;
        char charVar = 'a';
        short shortVar;
        int intVar = 3;
        float floatVar;
        long longVar;
        double doubleVar = 4.1;

        System.out.println("El valor de charVar es: " + charVar);
        System.out.println("El valor de intVar es: " + intVar);
        System.out.println("El valor de doubleVar es: " + doubleVar);

        System.out.println("Un byte es: " + (Byte.BYTES) + " bytes.");
        System.out.println("Un short son: " + (Short.BYTES) + " bytes.");
        System.out.println("Un int son: " + (Integer.BYTES) + " bytes.");
        System.out.println("Un long son: " + (Long.BYTES) + " bytes.");
        System.out.println("Un char son: " + (Character.BYTES) + " bytes.");
        System.out.println("Un float son: " + (Float.BYTES) + " bytes.");
        System.out.println("Un double son: " + (Double.BYTES) + " bytes.");

        System.out.println("Maximo valor short: " + Short.MAX_VALUE);
        System.out.println("Minimo valor short: " + Short.MIN_VALUE);
        System.out.println("Maximo long: " + Long.MAX_VALUE);
        System.out.println("Minimo long: " + Long.MIN_VALUE);

    }
}
