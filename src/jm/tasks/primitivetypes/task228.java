package jm.tasks.primitivetypes;

/**
 * Реализуйте метод isPowerOfTwo, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
 *
 * Решать можно разными способами:
 *
 * воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
 * применив пару трюков из двоичной арифметики;
 * написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
 * Пример ввода 1: 0
 * Пример возвращаемого значения 1: false
 *
 * Пример ввода 2: 1
 * Пример возвращаемого значения 2: true
 *
 * Пример ввода 3: -2
 * Пример возвращаемого значения 3: true
 *
 * Требования:
 * 1. Метод должен быть public.
 * 2. Метод должен быть static.
 * 3. Передаваемый параметр должен иметь тип int.
 */
public class task228 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3)); // 1 2 4 8 16 32 64 ... -> true, кроме этих двоичных представлений чисел будет возвращаться false
    }
    public static boolean isPowerOfTwo(int value) {
        //value = Math.abs(value); // преобразовываем в модуль
        return Integer.bitCount(Math.abs(value)) == 1; // при проверке должен равняться к 1, то есть true, если нет то false
        // Метод java.lang.Integer.bitCount () возвращает количество единичных битов в двоичном представлении с дополнением до двух указанного значения int i.
        //https://www.tutorialspoint.com/java/lang/integer_bitcount.htm и http://proglang.su/java/numbers-abs
        //video https://www.youtube.com/watch?v=zXQuqY3WQtM
    }


}
