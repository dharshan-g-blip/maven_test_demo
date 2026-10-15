
package test.java;

import main.java.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
      @Test
    public void testGrade() {
        App obj = new App();

        assertEquals("A", obj.calculateGrade(95));
        assertEquals("B", obj.calculateGrade(85));
        assertEquals("C", obj.calculateGrade(75));
        assertEquals("D", obj.calculateGrade(65));
        assertEquals("E", obj.calculateGrade(55));
        assertEquals("F", obj.calculateGrade(35));

        assertThrows(IllegalArgumentException.class,
                     () -> obj.calculateGrade(110));
    }

     @Test
    public void testGrade() {
        App obj = new App();

        assertEquals("A", obj.calculateGrade(95));
        assertEquals("B", obj.calculateGrade(85));
        assertEquals("C", obj.calculateGrade(75));
        assertEquals("D", obj.calculateGrade(65));
        assertEquals("E", obj.calculateGrade(55));
        assertEquals("F", obj.calculateGrade(35));

        assertThrows(IllegalArgumentException.class,
                     () -> obj.calculateGrade(110)); 
    }

}
