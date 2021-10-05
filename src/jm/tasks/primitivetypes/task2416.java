package jm.tasks.primitivetypes;

import java.util.Scanner;

/**
 * Напишите метод evenArray который принимает целое число типа int и возвращает массив заполненный четными числами от 1 до этого числа.
 *
 * Пример ввода: 8
 * Пример вывода: [2,4,6,8]
 *
 * Требования:
 * 1. Метод должен быть публичным.
 * 2. Параметр должен иметь тип int.
 * 3. Сигнатура метода должна быть: evenArray(int number)
 */
public class task2416 {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        System.out.print(evenArray(8));
    }
    public static int[] evenArray(int number) {
        int[] arr = new int[number / 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * 2;

        }
        return arr;
        // https://ru.stackoverflow.com/questions/1089963/Как-улучшить-генерацию-массива-четных-чисел
    }
}
