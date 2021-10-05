package jm.tasks.primitivetypes;

import java.math.BigInteger;

/**
 * Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
 *
 * Факториал N вычисляется как 1 ⋅ 2 ⋅ ... ⋅ N.
 *
 * Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
 *
 * Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
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
 * 4. Метод должен быть реализован через цикл.
 */

//    1! =  1
//    2! =  1 * 2 = 2
//    3! =  1 * 2 * 3 = 6
//    4! =  1 * 2 * 3 * 4 = 24
//    5! =  1 * 2 * 3 * 4 * 5  = 120

//    !0  = 1

public class task2413 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    public static BigInteger factorial(int value) {
        BigInteger res = BigInteger.ONE; // or BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
        // https://javarush.ru/groups/posts/2797-faktorial-v-java-programmirovanii
    }
}
