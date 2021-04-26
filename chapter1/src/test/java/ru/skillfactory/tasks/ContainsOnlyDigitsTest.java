package ru.skillfactory.tasks;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ContainsOnlyDigitsTest {

    private static final ContainsOnlyDigits CHECKER = new ContainsOnlyDigits();

    @Test
    public void testContainsOnlyDigits() {
        assertThat("В строчке нет цифр", CHECKER.containsOnlyDigits("ab"), is(false));
        assertThat("В строчке есть цифры цифр и буквы", CHECKER.containsOnlyDigits("1ab12"), is(false));
        assertThat("Строчка содержит только цифры", CHECKER.containsOnlyDigits("123"), is(true));
    }

}