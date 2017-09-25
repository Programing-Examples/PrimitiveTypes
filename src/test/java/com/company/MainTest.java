package test.java.com.company;

import main.java.com.company.Main;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


/**
 * Created by omar-laptop on 9/7/17.
 */
public class MainTest extends Main {


    @Test
    public void bytesSize() {
        // This is the amount of bits used to store an int
        assertEquals(1, Byte.BYTES);
    }

    @Test
    public void integerSize() {
        // This is the amount of bits used to store an int
        assertEquals(4, Integer.BYTES);
    }

    @Test
    public void floatSize() {
        // This is the amount of bits used to store an int
        assertEquals(4, Float.BYTES);
    }

    @Test
    public void doubleSize() {
        // This is the amount of bits used to store an int
        assertEquals(8, Double.BYTES);
    }

    @Test
    public void longSize() {
        // This is the amount of bits used to store an int
        assertEquals(8, Long.BYTES);
    }

    @Test
    public void characterSize() {
        // This is the amount of bits used to store an int
        assertEquals(2, Character.BYTES);
    }

}