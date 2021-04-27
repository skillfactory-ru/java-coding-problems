package ru.skillfactory.tasks;

public class ContainsOnlyDigits {

    /**
     * Данный метод принимает в себя строчку и проверяет, что переданная строчка
     * содержит только цифры
     * @param input - входящая строка
     * @return - true, если в строчке только цифры, в любом другом случае false
     */
    public boolean containsOnlyDigits(String input) {
        for (int index = 0; index < input.length(); index++) {
            if (!Character.isDigit(input.charAt(index))) {
                return false;
            }
        }
        return true;
    }
}
