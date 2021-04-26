package ru.skillfactory.tasks;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReversingLettersAndWordsTest {

    private static final ReversingLettersAndWords REVERSER = new ReversingLettersAndWords();

    @Test
    public void testReverseMethodWorksProperly() {
        assertThat("Ожидаемая строка отличается от актуальной", REVERSER.reverse("ba"), is("ab"));
        assertThat("Ожидаемая строка отличается от актуальной", REVERSER.reverse("Мама мыла раму"), is("умар алым амаМ"));
        assertThat("Ожидаемая строка отличается от актуальной", REVERSER.reverse("На дворе трава, на траве дрова"), is("аворд еварт ан ,аварт еровд аН"));
    }
}