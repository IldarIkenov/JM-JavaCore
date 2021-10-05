package jm.tasks.functioninterfecesstreams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.
 *
 * Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:
 *
 * minMaxConsumer.accept(min, max);
 * Если стрим не содержит элементов, то вызовите:
 *
 * minMaxConsumer.accept(null, null);
 * Требования:
 * 1. Должен быть метод public <T> void findMinMax(Stream? extends T> stream, Comparator? super T> order, BiConsumer? super T, ? super T>
 *     minMaxConsumer)
 * 2. Метод должен находить минимум и максимум в потоке, с помощью order.
 * 3. Полученные данные должны быть записаны minMaxConsumer, согласно условию
 */
public class task7211 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1","2","3","1","-78","678");
        findMinMax(stream,String::compareTo, (a,b) -> System.out.println(a+" "+b) );
    }
    public static  <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
//        List<T> list = stream.sorted(order).collect(Collectors.toList());
//        minMaxConsumer.accept(list.isEmpty() ? null : list.get(0), list.isEmpty() ? null : list.get(list.size() - 1));

        List<T> list = stream.sorted(order).collect(Collectors.toList());
        if (list.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            T min = list.get(0);
            T max = list.get(list.size() - 1);
            minMaxConsumer.accept(min, max);
        }
    }
}
