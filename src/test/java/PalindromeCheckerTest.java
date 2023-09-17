import org.example.PalindromeChecker;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithPalindromeWord() {
        assertTrue(PalindromeChecker.isPalindrome("level"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeWord() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindromeWithPalindromePhrase() {
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromePhrase() {
        assertFalse(PalindromeChecker.isPalindrome("This is not a palindrome"));
    }
}