package ru.skillfactory.tasks;

import java.util.regex.Pattern;

public class ReversingLettersAndWords {


    /**
     * Метод для разворачивания строки
     * @param reverse - входная строка
     * @return - строка перевернутая задом наперед
     */
    public String reverse(String reverse) {
        return new StringBuilder(reverse)
                .reverse()
                .toString();
    }
}
