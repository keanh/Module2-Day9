import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PrimeTest {

    @Test
    void testIsPrime() {
        int expected = 97;
        Prime prime = new Prime();
        int result = prime.findValue(25);
        assertEquals(expected,result);
    }
}