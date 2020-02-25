import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FibonaciTest {

    @Test
    void testCheckFibonaci() {
        int n=5;
        int expected = 5;
        Fibonaci fibonaci = new Fibonaci();
        int result =fibonaci.checkFibonaci(n);
        assertEquals(expected,result);
    }
}