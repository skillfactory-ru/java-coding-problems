package ru.skillfactory.tasks;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class CountingDuplicatesCharactersTest {

    private static final CountingDuplicatesCharacters COUNTER = new CountingDuplicatesCharacters();

    @Test
    public void countDuplicatesCharacters() {
        Map<Character, Integer> emptyStr = COUNTER.countDuplicatesCharacters("");
        assertEquals("Пустая строчка должна возвращать пустую карту(Map)", 0, emptyStr.size());
        Map<Character, Integer> specificSymbols = COUNTER.countDuplicatesCharacters("$%$%skill");
        assertEquals("Неправильное количество символов $", specificSymbols.get("$"), is(2));
        assertEquals("Неправильное количество символов %", specificSymbols.get("%"), is(2));
        assertEquals("Неправильное количество символов l", specificSymbols.get("l"), is(2));

    }
}