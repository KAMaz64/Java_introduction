/* 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

Пункты реализовать в методе main
*Пункты реализовать в разных методах

int i = new Random().nextInt(k); //это кидалка случайных чисел!) */

import java.util.Random;

public class Hometask1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2000);
        System.out.println("Случайное число i = " + i);

        int n = 0;
        int temp = i;
        while (temp != 0) {
            temp = temp >> 1; // битовый сдвиг вправа, пока temp не будет равен 0
            n++;
        }
        System.out.println("Номер старшего значащего бита выпавшего числа равен " + n);

        int[] m1 = new int[Short.MAX_VALUE - i];
        int[] m2 = new int[i - Short.MIN_VALUE];

        int idx1 = 0;
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[idx1] = j;
                idx1++;
            }
        }
        System.out.println("Длина массива m1: " + idx1);
        

        int idx2 = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                m2[idx2] = j;
                idx2++;
            }
        }
        System.out.println("Длина массива m2: " + idx2);
    }
}