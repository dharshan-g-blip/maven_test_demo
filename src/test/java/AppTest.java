
package test.java;

import main.java.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    App obj = new App();

    @Test
    public void testPalindrome() {
        

        assertTrue(obj.isPalindrome(121));
    }
    @Test
    public void testPalindrome() {
        assertTrue(obj.isPalindrome(1221));
    }
    @Test
    public void testPalindrome() {
        assertTrue(obj.isPalindrome(0));
    }
    @Test
    public void testPalindrome() {
        assertFalse(obj.isPalindrome(123));
    }
    @Test
    public void testPalindrome() {
        assertFalse(obj.isPalindrome(-121));
    }

}
