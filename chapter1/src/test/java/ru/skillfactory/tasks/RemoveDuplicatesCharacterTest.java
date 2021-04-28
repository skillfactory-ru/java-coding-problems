package ru.skillfactory.tasks;


import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class RemoveDuplicatesCharacterTest {

    private static final RemoveDuplicatesCharacter REMOVER = new RemoveDuplicatesCharacter();

    @Test
    public void testThatAllDuplicatesCharacterWasRemoved() {
        assertThat("Не все дублированные буквы удалены", REMOVER.removeDuplicates("aaaббб"), is("aб"));
        assertThat("Не все дублированные буквы удалены", REMOVER.removeDuplicates("бвававава"), is("бва"));
        assertThat("Не все дублированные буквы удалены", REMOVER.removeDuplicates("тест"), is("тес"));
        assertThat("Не все дублированные буквы удалены", REMOVER.removeDuplicates("github"), is("github"));
    }
}