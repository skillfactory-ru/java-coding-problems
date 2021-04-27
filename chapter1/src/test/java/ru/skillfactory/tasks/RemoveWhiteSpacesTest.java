package ru.skillfactory.tasks;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class RemoveWhiteSpacesTest {

    private static final RemoveWhiteSpaces REMOVER = new RemoveWhiteSpaces();

    @Test
    public void testThatAllWhitespacesWasRemoved() {
        assertThat("Не удалены пробелы", REMOVER.removeWhitespaces("I am developer"), is("Iamdeveloper"));
        assertThat("Не удален специальный символ", REMOVER.removeWhitespaces("Hello\nJava"), is("HelloJava"));
        assertThat("Не удален специальный символ", REMOVER.removeWhitespaces("Hello\t"), is("Hello"));
    }
}