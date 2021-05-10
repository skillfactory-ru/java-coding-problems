package ru.skillfactory.tasks;

public class ContainsOnlyDigits {

    /**
     * Данный метод принимает в себя строчку и проверяет, что переданная строчка
     * содержит только цифры
     * @param input - входящая строка
     * @return - true, если в строчке только цифры, в любом другом случае false
     */
    public boolean containsOnlyDigits(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
