package ru.skillfactory.tasks;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class JoinMultipleStringsTest {

    private static final JoinMultipleStrings JOINER = new JoinMultipleStrings();

    @Test
    public void testThatStringJoinedWithAssignedDelimiter() {
        assertThat(JOINER.joinByDelimiter("&", "java", "python", "go"), is("java&python&go"));
        assertThat(JOINER.joinByDelimiter("?", "q", "paramName"), is("q?paramName"));
    }
}