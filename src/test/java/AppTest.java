
package test.java;

import main.java.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
         @Test
    public void testSimpleInterest() {
        App obj = new App();

        assertEquals(1000.0,
                     obj.simpleInterest(10000, 5, 2), 0.001);

        assertEquals(500.0,
                     obj.simpleInterest(5000, 5, 2), 0.001);

        assertEquals(0.0,
                     obj.simpleInterest(1000, 0, 2), 0.001);

        assertEquals(200.0,
                     obj.simpleInterest(2000, 5, 2), 0.001);
    }

}
