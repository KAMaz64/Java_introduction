/* Задание

Пусть дан произвольный список из 100 целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение */

package Seminar3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Hometask3 {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listA.add(new Random().nextInt(-50, 50));
        }
        System.out.println("Произвольный список: " + listA);

        deleteOddNumbers(listA);
        getMaxMinAvgList(listA);

    }

    public static ArrayList<Integer> deleteOddNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> listB = new ArrayList<>();
        for (Integer i : list) {
            if (i % 2 != 0) listB.add(i);
        }
        System.out.println("Cписок нечетных чисел: " + listB);
        return listB;
    }

    public static void getMaxMinAvgList(ArrayList<Integer> list) {
        Collections.sort(list);
        int min = list.get(0);
        int sum = 0;
        int avg = 0;
        for (Integer i : list) {
            if (i < min) min = i;
            sum += i;
            avg = sum / list.size();
        }
        System.out.println("Максимальное значение: " + Collections.max(list));
        System.out.println("Минимальное значение: " + Collections.min(list));
        System.out.println("Среднее значение: " + avg);
    }
}

