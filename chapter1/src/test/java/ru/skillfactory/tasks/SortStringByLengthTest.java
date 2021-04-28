package ru.skillfactory.tasks;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.contains;


public class SortStringByLengthTest {

    private static final SortStringByLength SORTER = new SortStringByLength();

    @Test
    public void testThatStringSortedProperly() {
        assertThat(
                "Строки не отсортированы в восходящем порядке по длине",
                SORTER.sortStringByLength(Arrays.asList("ccc", "a", "bb"), "ASC"),
                contains("a", "bb", "ccc"));
        assertThat(
                "Строки не отсортированы в нисходящем порядке по длине",
                SORTER.sortStringByLength(Arrays.asList("ccc", "a", "bb"), "DESC"),
                contains("ccc", "bb", "a"));
    }

}