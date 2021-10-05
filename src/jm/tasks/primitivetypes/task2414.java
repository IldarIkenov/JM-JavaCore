package jm.tasks.primitivetypes;

import java.math.BigInteger;

/**
 * Реализуйте предыдущую задачу "task2213" с использованием рекурсии
 *
 * Пример ввода 1: 1
 * Пример возвращаемого значения 1: 1
 *
 * Пример ввода 2: 3
 * Пример возвращаемого значения 2: 6
 *
 * Требования:
 * 1. Метод должен быть public.
 * 1. Метод должен быть static.
 * 3. Передаваемый параметр должен иметь тип int.
 * 4. Реализация метода должна быть через рекурсию.
 */
public class task2414 {
    public static void main(String[] args) {
        System.out.println(factorial(1));
    }
    public static BigInteger factorial(int value) {
        if (value == 1 || value == 0) {
            return BigInteger.ONE; // or BigInteger.valueOf(1)
        } else {
            return BigInteger.valueOf(value).multiply(factorial(value - 1));
        }
        // https://javarush.ru/groups/posts/1895-rekursija-v-java
        // https://javarush.ru/groups/posts/2797-faktorial-v-java-programmirovanii
    }
}
