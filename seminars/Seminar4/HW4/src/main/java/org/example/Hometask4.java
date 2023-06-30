/*Организовать ввод и хранение данных пользователей. ФИО возраст и пол
вывод в формате Фамилия И.О. возраст пол
добавить возможность выхода или вывода списка отсортированного по возрасту!)
*реализовать сортировку по возрасту с использованием индексов
*реализовать сортировку по возрасту и полу с использованием индексов
 */

package org.example;

import org.example.user.User;

import java.util.Scanner;
import java.util.ArrayList;

public class Hometask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList users = new ArrayList<>();
        // Ввод данных пользователей
        while (true) {
            System.out.println("Введите ФИО (Фамилия Имя Отчество):");
            String fullName = scanner.nextLine();
            System.out.println("Введите возраст:");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите пол (М/Ж):");
            char gender = scanner.nextLine().charAt(0);

            User user = new User(fullName, age, gender);
            users.add(user);

            System.out.println("Продолжить ввод данных? (да/нет)");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("нет")) {
                break;
            }
        }

        // Вывод отсортированного списка пользователей
        System.out.println("Отсортированный список пользователей:");
        System.out.println("Фамилия И.О. Возраст Пол");
        System.out.println("==============================");

        // Выбор сортировки
        System.out.println("Выберите тип сортировки:");
        System.out.println("1 - По возрасту");
        System.out.println("2 - По возрасту и полу");
        int choice = Integer.parseInt(scanner.nextLine());

        // Сортировка по возрасту
        if (choice == 1) {
            int[] indexes = new int[users.size()];
            for (int i = 0; i < users.size(); i++) {
                indexes[i] = i;
            }

            for (int i = 0; i < users.size() - 1; i++) {
                for (int j = 0; j < users.size() - 1 - i; j++) {
                    if (users.get(indexes[j]).getAge() > users.get(indexes[j + 1]).getAge()) {
                        int temp = indexes[j];
                        indexes[j] = indexes[j + 1];
                        indexes[j + 1] = temp;
                    }
                }
            }

            for (int index : indexes) {
                User user = users.get(index);
                System.out.println(user.getFormattedInfo());
            }
        }

        // Сортировка по возрасту и полу
        else if (choice == 2) {
            int[] indexes = new int[users.size()];
            for (int i = 0; i < users.size(); i++) {
                indexes[i] = i;
            }

            for (int i = 0; i < users.size() - 1; i++) {
                for (int j = 0; j < users.size() - 1 - i; j++) {
                    User user1 = users.get(indexes[j]);
                    User user2 = users.get(indexes[j + 1]);
                    if (user1.getAge() > user2.getAge() || (user1.getAge() == user2.getAge() && user1.getGender() > user2.getGender())) {
                        int temp = indexes[j];
                        indexes[j] = indexes[j + 1];
                        indexes[j + 1] = temp;
                    }
                }
            }

            for (int index : indexes) {
                User user = users.get(index);
                System.out.println(user.getFormattedInfo());
            }
        }
    }

}