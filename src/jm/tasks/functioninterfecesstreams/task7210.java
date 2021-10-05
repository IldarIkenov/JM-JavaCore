package jm.tasks.functioninterfecesstreams;

import java.util.stream.IntStream;

/**
 * Напишите метод, возвращающий стрим псевдослучайных целых чисел. Алгоритм генерации чисел следующий:
 *
 * Берется какое-то начальное неотрицательное число (оно будет передаваться в ваш метод проверяющей системой).
 * Первый элемент последовательности устанавливается равным этому числу.
 * Следующие элементы вычисляются по рекуррентной формуле Rn+1=mid(Rn2), где mid — это функция, выделяющая второй,
 * третий и четвертый разряд переданного числа. Например, mid(123456)=345.
 * Алгоритм, конечно, дурацкий и не выдерживающий никакой критики, но для практики работы со стримами сойдет :)
 *
 * Пример ввода: 13
 * Пример вывода: 13, 16, 25, 62, 384, 745, 502, 200, 0, ... (дальше бесконечное количество нулей)
 *
 * Требования:
 * 1. Должен быть метод public static IntStream pseudoRandomStream(int seed)
 * 2. Метод должен возвращать поток, удовлетворяющий условию
 */
public class task7210 {
    public static void main(String[] args) {
        IntStream res = pseudoRandomStream(13);
        res.limit(10).forEach(System.out::println);
    }
    public static IntStream pseudoRandomStream(int seed) {
        //return IntStream.iterate(seed, x -> (int) (Math.pow(x, 2) / 10) % 1000);
        return IntStream.iterate(seed, x -> {
            String str = String.valueOf((int) Math.pow(x, 2));
            int end = (str.length() < 1) ? 0 : str.length() - 1;
            int begin = (str.length() < 4) ? 0 : end - 3;
            return ((end - begin) == 0) ? 0 : Integer.valueOf(str.substring(begin, end), 10);
        });
    }
}
