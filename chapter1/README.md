## Глава 1. Основы Java
## Задание 1
Необходимо написать программу для подсчета количества символов, которые продублированны в заданной строке
Пример такой строки `skill` - в ней буква **l** содержится два раза.

### Возможные решения:
#### Решение 1
1. Поскольку мы знаем, что строка представляет собой массив char'ов,
то мы можем по ней итерироваться и таким образом подсчитывать количество
символов
```
 Map<Character, Integer> result = new HashMap<>();

 for (int i = 0; i < str.length(); i++) {
   char ch = str.charAt(i);
   result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
 }
 return result;
```
Обратите внимание на строчку
`result.compute(ch, (k,v) -> (v == null) ? 1 : ++v`

В данной строчке используется метод compute для вычисления нового значения, которое будет установлено
заданному ключу. Если такого значения в карте нет, то будет установлена единица,
в противном случае произойдет инкремент значения
#### Решение 2
После выхода 8 версии Java мы можем воспользоваться Stream API, благодаря нему 
наш код будет выглядеть короче и лаконичнее
```
public Map<Character, Long> countDuplicateCharacters(String str) {

  Map<Character, Long> result = str.chars()
    .mapToObj(c -> (char) c)
    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

  return result;
}
```
Мы сначала получаем все символы из строки в виде stream'a, а далее делаем их
маппинг на объект, после чего с помощью класса Collectors группируем и подсчитываем количество
## Задание 2
В этом задании необходимо реализовать метод для нахождения в заданной строке
первой **неповторяющейся** буквы. Пример - `adddc`, в данном случае первой неповторяющей буквой
является буква `a`

### Возможные решения
#### Решение 1
Используя Java 8 можно написать следующий вариант решения
```
public static String firstNonRepeatedCharacter(String str) {
 
  Map<Integer, Long> chs = str.codePoints()
    .mapToObj(cp -> cp)
    .collect(Collectors.groupingBy(Function.identity(),
      LinkedHashMap::new, Collectors.counting()));

  int cp = chs.entrySet().stream()
   .filter(e -> e.getValue() == 1L)
   .findFirst()
   .map(Map.Entry::getKey)
   .orElse(Integer.valueOf(Character.MIN_VALUE));

  return String.valueOf(Character.toChars(cp));
}
```