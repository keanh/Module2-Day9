import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void checkFizzBuzz1() {
        int num = 3;
        String expected = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkFizzBuzz(num);
        assertEquals(expected,result);
    }

    @Test
    void checkFizzBuzz2() {
        int num = 5;
        String expected = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkFizzBuzz(num);
        assertEquals(expected,result);
    }

    @Test
    void checkFizzBuzz3() {
        int num = 15;
        String expected = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkFizzBuzz(num);
        assertEquals(expected,result);
    }

    @Test
    void checkFizzBuzz4() {
        int num = 13;
        String expected = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.checkNumber(num);
        assertEquals(expected,result);
    }

    @Test
    void checkFizzBuzz5() {
        int num = 52;
        String expected = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result;
        result = FizzBuzz.checkNumber(num);
        assertEquals(expected,result);
    }

    @Test
    void checkFizzBuzz6() {
        int num = 30;
        String expected = "ba không";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result;
        result = FizzBuzz.readNumber(num);
        assertEquals(expected,result);
    }
}