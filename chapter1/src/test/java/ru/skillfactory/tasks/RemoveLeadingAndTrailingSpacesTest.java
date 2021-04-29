package ru.skillfactory.tasks;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class RemoveLeadingAndTrailingSpacesTest {

    private static final RemoveLeadingAndTrailingSpaces REMOVER = new RemoveLeadingAndTrailingSpaces();

    @Test
    public void testThatAllSpacesWasRemoved() {
        assertThat(
                "Не были удалены все пробелы",
                REMOVER.removeAllSpaces("   java  "),
                is("java"));
        assertThat(
                "Не были удалены лидирующие пробелы",
                REMOVER.removeAllSpaces('\u2002' + "jjjj"),
                is("jjjj")
        );
        assertThat(
                "Не были удалены хвостовые пробелы",
                REMOVER.removeAllSpaces("test" + '\u2002'),
                is("test")
        );
    }
}