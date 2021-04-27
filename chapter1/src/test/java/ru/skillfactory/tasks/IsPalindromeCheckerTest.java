package ru.skillfactory.tasks;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class IsPalindromeCheckerTest {

    private static final IsPalindromeChecker CHECKER = new IsPalindromeChecker();
    @Test
    public void testThatIsInputStringPalindrome() {
        assertThat("Переданное слово является палиндромом", CHECKER.isPalindrome("шалаш"), is(true));
        assertThat("Переданное слово является палиндромом", CHECKER.isPalindrome("оно"), is(true));
        assertThat("Переданное слово не является палиндромом", CHECKER.isPalindrome("тест"), is(false));
    }

}