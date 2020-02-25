import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testCheckPalindrome1() {
        String s = "rotor";
        boolean expected = true;
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.checkPalindrome(s);
        assertEquals(expected,result);
    }

    @Test
    void testCheckPalindrome2() {
        String s = "matar";
        boolean expected = false;
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.checkPalindrome(s);
        assertEquals(expected,result);
    }
}