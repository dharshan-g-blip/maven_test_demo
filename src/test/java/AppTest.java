
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
    }
    @Test
    public void testGrade() {
        App obj = new App();
        assertEquals("B", obj.calculateGrade(85));
    }
    @Test
    public void testGrade() {
        App obj = new App();
        assertEquals("C", obj.calculateGrade(75));
    }
    @Test
    public void testGrade() {
        App obj = new App();
        assertEquals("D", obj.calculateGrade(65));
    }
    @Test
    public void testGrade() {
        App obj = new App();
        assertEquals("E", obj.calculateGrade(55));
    }
    @Test
    public void testGrade() {
        App obj = new App();
        assertEquals("F", obj.calculateGrade(35));
    

        assertThrows(IllegalArgumentException.class,
                     () -> obj.calculateGrade(110));
    }



}
