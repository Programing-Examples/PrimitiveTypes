package test.java.com.company;

import main.java.com.company.Main;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


/**
 * Created by omar-laptop on 9/7/17.
 */
public class MainTest extends Main {


    @Test
    public void integerSize() {
        assertEquals( 4, Integer.BYTES);  // This is the amount of bits used to store an int
        assertTrue(0 == Integer.BYTES);
    }

}