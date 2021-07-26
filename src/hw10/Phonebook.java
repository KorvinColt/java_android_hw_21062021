package hw10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Phonebook {

    private HashMap<String, List<String>> book;

    public Phonebook() {
        this.book = new HashMap<>();
    }

    public void add(String name, String number) {
        if (book.containsKey(name)) {
            List<String> numbers = book.get(name);
            if (!numbers.contains(number)) {
                numbers.add(number);
                System.out.println(String.format("Номер %s добавлен для %s", number, name));
            } else {
                System.out.println(String.format("Номер %s уже существует для %s", number, name));
            }
        } else {
            book.put(name, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер %s добавлен для %s", number, name));
        }
    }

    public List<String> get(String name) {
        if (book.containsKey(name)) {
            return book.get(name);
        } else {
            System.out.println(String.format("Нет записи для %s", name));
            return new ArrayList<>();
        }
    }
}