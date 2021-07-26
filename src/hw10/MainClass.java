package hw10;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Estonia", "Finland", "Iceland", "Ireland", "Norway",
                "Scotland", "France", "Germany", "Ireland", "Norway",
                "Finland", "Iceland", "Ireland", "France", "France",
                "Iceland", "Ireland", "France", "France", "Ireland");

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Массив с набором слов");
        System.out.println(words.toString());
        System.out.println("Список уникальных слов");
        System.out.println(unique.toString());
        System.out.println("Сколько раз встречается каждое слово");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}