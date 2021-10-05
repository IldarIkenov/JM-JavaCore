package jm.tasks.functioninterfecesstreams;
/**
 * Напишите метод с названием sqrt, который возвращает реализацию функционального интерфейса UnaryOperator, который
 * принимает целое число(тип int) и возвращает его квадрат.
 *
 * Требования:
 * 1. Должен быть метод public UnaryOperator sqrt()
 * 2. Метод должен возвращать реализацию интерфейса UnaryOperator.
 * 3. Реализация должна соответствовать условию
 */

import java.util.function.UnaryOperator;

public class task717 {
    public static void main(String[] args) {
        System.out.println(sqrt().apply(5));
    }

    public static UnaryOperator<Integer> sqrt() {
        return x -> x * x;
    }

    // https://metanit.com/java/tutorial/9.3.php
    // https://techndeck.com/unaryoperator-interface-in-java-8-with-examples/
}
