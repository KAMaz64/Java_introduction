/* Название public class'а всегда должно совпадать с названием программы
При написании кода используем сниппеты (пишем, например class и выбираем готовый сценарий) 
Как это работает - смотри ниже результат написания class и выбора снипппета */

package Lectures.Lecture1;

import javax.swing.plaf.TreeUI;

/**
 * Program
 */
public class Program {
// формируем точку входа (базовый метод main) с помощью сниппета "main"
    public static void main(String[] args) {
        // Используем сниппет sysout
        System.out.println("Hello, World. Hey!"); // Комментарии можно прписыать по-разному, например через дабл слэш
        // Перед запуском кода всегда проверяем, что во встроенном терминале открыта папка, в которой находится запускаемый проект
        System.out.println();
        String s = "2"; // присваиваем значение переменной
        System.out.println(s);
        
        System.out.println();

        short age = 10;
        System.out.println(age);

        float e = 2.74634534f; // в типе данных float нужно обязательно на конце писать f
        double e1 = 3.1415;
        double e2 = 3.32323d; // в типе данных double суффикс d существует, но не является обязательным
        System.out.println(e);
        System.out.println(e1);
        System.out.println(e2);

        System.out.println();

        char ch = '1'; // тип данных, определяющий отдельный символ
        System.out.println(Character.isDigit(ch)); //true

        ch = 'a';

        System.out.println(Character.isDigit(ch)); //false

        boolean x = true && false;
        boolean y = true ^ false; // истинно тогда и только тогда, когда строго одно из значений истинно

        System.out.println();
        System.out.println(x);
        System.out.println(y);
        System.out.println();

        //Неявная типизация: если забыли какой тип данных использовать

        var a = 123;
        System.out.println(a);

        var d = 123.456;
        System.out.println(d);
        System.out.println();

        //выводим типы данных переменных, введенных выше
        System.out.println(getType(a));
        System.out.println(getType(d));

         /* Операции Java
         * 
         * Присваивание: =
         * Арифметические: *,/,+,-,%,++,--
         * Сравнение: <, >, ==, !=, >=, <=
         * Логические: ||, &&, ^, !
         * Побитовые: <<, >>, &, |, ^
         * 
         */

        int a1 = 123;
        a1++;
        System.out.println(a1);
        System.out.println();

        int a2 = 123;
        System.out.println(++a2); //Если поставить инкремент перед переменной (префиксный инкремент ++x), операция инкремента будет в приоритете, в противном случае (постфиксный инкремент x++), будет выведено изначальное значение.
       
        int a3 = 123;
        System.out.println(a3++); // Пример с постфиксным инкрементом
        System.out.println(a3);

        int a4 = 123;
        a4 = --a4-a4--;
        System.out.println(a4);

        System.out.println();

        boolean f = 123 > 100;
        System.out.println(f);

        //Побитовые сдвиги

        int a5 = 8;
        // 1000
        
        System.out.println(a5 << 1);
        // 10000

        System.out.println();


        //Побитовые операции:

        int ax = 5
        int bx = 2

        System.out.println(ax | bx);

        String s1 = "qwer";
        
                   
    }   

        //Неявная типизация: если забыли какой тип данных использовать
        


    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}

