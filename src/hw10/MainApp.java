package hw10;

public class MainApp {
    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook();
        phonebook.add("Логачёв", "89248341122");
        phonebook.add("Логачёв", "89248342233");
        phonebook.add("Изаксон", "89248343344");
        phonebook.add("Прокопчук", "89248344455");
        phonebook.add("Логачёв", "89248345566");

        System.out.println("Номера");
        System.out.println("Логачёв");
        System.out.println(phonebook.get("Логачёв"));
        System.out.println("Изаксон");
        System.out.println(phonebook.get("Изаксон"));
        System.out.println("Прокопчук");
        System.out.println(phonebook.get("Прокопчук"));

        System.out.println("Записываем существующий номер");
        phonebook.add("Логачёв", "89248341122");
        System.out.println("Логачёв");
        System.out.println(phonebook.get("Логачёв"));
    }
}