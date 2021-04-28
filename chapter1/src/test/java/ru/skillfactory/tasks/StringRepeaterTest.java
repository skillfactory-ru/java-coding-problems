package ru.skillfactory.tasks;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringRepeaterTest {

    private static final StringRepeater REPEATER = new StringRepeater();

    @Test
    public void testThatStringRepeaterWorksProperly() {
        assertThat(
                REPEATER.repeatString("тест", 2),
                is("тест")
        );

        assertThat(
                REPEATER.repeatString("ок", 3),
                is("ококок")
        );

        assertThat(
                REPEATER.repeatString("12", 1),
                is("12")
        );
    }
}