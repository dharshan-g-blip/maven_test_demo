package test.java;

import main.java.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testReverseString() {
        App obj = new App();

        assertEquals("olleH", obj.reverseString("Hello"));
        assertEquals("avaJ", obj.reverseString("Java"));
        assertEquals("", obj.reverseString(""));
        assertEquals("a", obj.reverseString("a"));
        assertEquals("321", obj.reverseString("123"));
    }
}