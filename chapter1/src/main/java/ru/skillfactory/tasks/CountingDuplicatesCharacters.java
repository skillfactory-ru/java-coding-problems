package ru.skillfactory.tasks;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicatesCharacters {

    /**
     * В данном методе необходимо реализовать подсчет дублирующихся букв в заданной строке
     * @param str - входная строка
     * @return - возвращает карту(Map) со списком дублированных букв и их количеством
     */
    public Map<Character, Integer> countDuplicatesCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
}
