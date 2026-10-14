
package test.java;

import main.java.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    App obj = new App();

    @Test
    public void testReverseHello() {
        assertEquals("olleH", obj.reverseString("Hello"));
    }

    @Test
    public void testReverseJava() {
        assertEquals("avaJ", obj.reverseString("Java"));
    }

    @Test
    public void testReverseEmptyString() {
        assertEquals("", obj.reverseString(""));
    }

    @Test
    public void testReverseSingleCharacter() {
        assertEquals("a", obj.reverseString("a"));
    }

    @Test
    public void testReverseNumbers() {
        assertEquals("321", obj.reverseString("123"));
    }
}
