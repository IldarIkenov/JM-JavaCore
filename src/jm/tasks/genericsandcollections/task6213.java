package jm.tasks.genericsandcollections;

import java.util.HashSet;
import java.util.Set;

/**
 * Реализуйте метод symmetricDifference, вычисляющий симметрическую разность двух множеств. Метод должен возвращать
 * результат в виде нового множества. Изменять переданные в него множества не допускается.
 *
 * Пример ввода: [1, 2, 3} и {0, 1, 2]
 * Пример вывода: [0, 3]
 *
 * Требования:
 * 1. должен быть метод public static Set symmetricDifference(Set set1, Set set2)
 * 2. метод symmetricDifference не должен изменять исходные множества
 * 3. метод symmetricDifference должен возвращать корректный результат
 *
 */
public class task6213 {
    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(0);
        num2.add(1);
        num2.add(2);

        Set<Integer> result = symmetricDifference(num1,num2);
        System.out.println(result);
    }
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
//        HashSet<T> s1 = new HashSet<>(set1);
//        HashSet<T> s2 = new HashSet<>(set2);
//        s1.removeAll(set2);
//        s2.removeAll(set1);
//        s1.addAll(s2);
//        return s1;


        HashSet<T> res = new HashSet<>(set1);
        res.addAll(set2);
        res.removeIf(el -> set1.contains(el) && set2.contains(el));
        return res;
    }
}
