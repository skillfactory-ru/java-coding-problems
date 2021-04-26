package ru.skillfactory.tasks;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindFirstNonRepeatedCharacterTest {

    private static final FindFirstNonRepeatedCharacter FINDER = new FindFirstNonRepeatedCharacter();

    @Test
    public void testFirstNonRepeatingCharacter() {
        assertThat(FINDER.firstNonRepeatedCharacter("adaaaaa"), is("d"));
        assertThat(FINDER.firstNonRepeatedCharacter("dadadayaasdad"), is("y"));
    }
}