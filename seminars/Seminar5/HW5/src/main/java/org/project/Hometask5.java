/*Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов*/

package org.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hometask5 {
    private Map<String, List<String>> contacts;

    public Hometask5() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        // Проверяем, есть ли уже контакт с данным именем
        if (contacts.containsKey(name)) {
            // Если есть, получаем список телефонов для этого имени и добавляем новый телефон
            List<String> phoneNumbers = contacts.get(name);
            phoneNumbers.add(phoneNumber);
        } else {
            // Если контакта с данным именем еще нет, создаем новый список телефонов
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            contacts.put(name, phoneNumbers);
        }
    }

    public void printContacts() {
        // Создаем список пар (имя, количество телефонов)
        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(contacts.entrySet());

        // Сортируем список по убыванию количества телефонов
        Collections.sort(sortedEntries, (entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());

        // Выводим отсортированный список контактов
        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            System.out.println(name + ": " + phoneNumbers);
        }
    }

    public static void main(String[] args) {
        Hometask5 phoneBook = new Hometask5();
        phoneBook.addContact("Макрон", "111-222-333");
        phoneBook.addContact("Шольц", "444-555-666");
        phoneBook.addContact("Макрон", "777-888-999");
        phoneBook.addContact("Макрон", "111-222-333");
        phoneBook.addContact("Байден", "000-111-222");
        phoneBook.addContact("Байден", "111-999-123");

        phoneBook.printContacts();
    }
}