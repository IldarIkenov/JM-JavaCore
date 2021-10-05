package jm.tasks.primitivetypes;

import java.util.Scanner;

/**
 * В спортивном центре есть три возрастные группы для занятий волейболом 1 - от 7 до 13 лет 2 - от 14 до 17 лет 3 - от 18 до 65 лет.
 *
 *  Напишите публичный нестатичный метод determineGroup который принимает возраст человека и возвращает целое число, которое обозначает номер группы в которую его надо определить, если подходящей группы нет - верните -1.
 *
 * Пример ввода: 10
 * Пример вывода: 1
 *
 * Пример ввода: 60
 * Пример вывода: 3
 *
 * Пример ввода: 77
 * Пример вывода: -1
 * Требования:
 * Сигнатура метода должна быть: determineGroup(int age)
 * Метод должен возвращать int
 * Метод не должен быть статическим
 */
public class task2415 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(determineGroup(sc.nextInt()));
    }
    public static int determineGroup(int age) {
        if ((age >= 7) && (age <= 13)) {
            return 1;
        }
        if ((age >= 14) && (age <= 17)) {
            return 2;
        }
        if ((age >= 18) && (age <= 65)) {
            return 3;
        }
        return -1;
    }
}
