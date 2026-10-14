
package test.java;

import main.java.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void testPalindrome() {
        App obj = new App();

        assertTrue(obj.isPalindrome(121));
        assertTrue(obj.isPalindrome(1221));
        assertTrue(obj.isPalindrome(0));
        assertFalse(obj.isPalindrome(123));
        assertFalse(obj.isPalindrome(-121));
    }

}
