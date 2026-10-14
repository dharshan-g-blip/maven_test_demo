
package test.java;

import main.java.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
     @Test
    public void testPalindrome121() {
        App obj = new App();
        assertTrue(obj.isPalindrome(121));
    }

    @Test
    public void testPalindrome1221() {
        App obj = new App();
        assertTrue(obj.isPalindrome(1221));
    }

    @Test
    public void testPalindromeZero() {
        App obj = new App();
        assertTrue(obj.isPalindrome(0));
    }

    @Test
    public void testNotPalindrome123() {
        App obj = new App();
        assertFalse(obj.isPalindrome(123));
    }

    @Test
    public void testNegativeNumber() {
        App obj = new App();
        assertFalse(obj.isPalindrome(-121));
    }

}
