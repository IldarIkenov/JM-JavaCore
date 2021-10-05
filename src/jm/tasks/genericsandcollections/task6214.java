package jm.tasks.genericsandcollections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами,
 * затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность
 * в обратном порядке в System.out.
 *
 * Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.
 *
 * Все import объявлены за вас.
 *
 * Пример ввода: 1 2 3 4 5 6 7 8 9 10
 * Пример вывода: 10 8 6 4 2
 *
 * Требования:
 * 1. Необходимо наличие метода public static void main(String[] args)
 * 2. Программа должна читать данные из консоли
 * 3. Программа должна выводить текст в консоль
 */
public class task6214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> arr = new ArrayDeque<>();
        int n = 0;
        while (sc.hasNextInt()) {
            if (n % 2 != 0) {
                arr.addFirst(sc.nextInt());
            } else {
              sc.next();
            }
            n++;
        }
        for (Integer el : arr) {
            System.out.println(el + " ");
        }
    }
}
