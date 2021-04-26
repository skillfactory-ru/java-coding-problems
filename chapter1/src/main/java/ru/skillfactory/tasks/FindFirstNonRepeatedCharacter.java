package ru.skillfactory.tasks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {

    /**
     * Метод для нахождения первой неповторяющейся буквы в переданной строке
     * @param str - входящая строчка
     * @return - возвращает первую неповторяющуюся строчку
     */
    public String firstNonRepeatedCharacter(String str) {
        Map<Integer, Long> chars = str.codePoints()
                .mapToObj(cp -> cp)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()));
        int codePoints = chars.entrySet().stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(Integer.valueOf(Character.MIN_VALUE));

        return String.valueOf(Character.toChars(codePoints));
    }
}
