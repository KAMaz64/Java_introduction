/*Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент, метод toString возвращающий строку с элементами множества *и метод позволяющий читать элементы по индексу.
*Реализовать все методы из семинара.
Формат данных Integer.*/

package org.example;

import java.util.ArrayList;
import java.util.List;

public class HashSetSimulation {
    private List<Integer> elements;

    public HashSetSimulation() {
        elements = new ArrayList<>();
    }

    public void add(int element) {
        // Проверяем, если элемент уже присутствует в множестве, то не добавляем его повторно
        if (!elements.contains(element)) {
            elements.add(element);
        }
    }

    public String toString() {
        return elements.toString();
    }

    public Integer getElementByIndex(int index) {
        // Проверяем, что индекс находится в допустимом диапазоне
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        }
        return null;
    }

    public static void main(String[] args) {
        HashSetSimulation set = new HashSetSimulation();

        // Добавляем элементы
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Дубликат, не будет добавлен

        // Выводим элементы множества
        System.out.println(set.toString());

        // Читаем элемент по индексу
        int index = 1;
        Integer element = set.getElementByIndex(index);
        if (element != null) {
            System.out.println("Элемент по индексу " + index + ": " + element);
        } else {
            System.out.println("Неверный индекс");
        }
    }
}