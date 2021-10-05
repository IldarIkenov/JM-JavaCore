package jm.tasks.genericsandcollections;

import java.util.Arrays;
import java.util.Objects;

/**
 * Массивы в Java имеют фиксированную длину. Попробуем обойти это ограничение. Создайте класс DynamicArray, который
 * хранит в себе массив, и имеет методы для добавления void add(T el), void remove(int index) удаления и
 * извлечения T get(int index) из него элементов, при переполнении текущего массива, должен создаваться новый, большего размера.
 *
 * Для возможности работы с различными классами DynamicArray должен быть дженериком. Для решения задачи можно воспользоваться
 * методами из класса java.util.Arrays. Импорт этого класса уже объявлен в тестирующей системе. Добавлять его явно не нужно
 *
 * Требования:
 * 1. должен быть класс public static class DynamicArray
 * 2. класс DynamicArray должен иметь методы публичные void add(T el), void remove(int index) и T get(int index)
 * 3. класс DynamicArray должен иметь публичный конструктор по умолчанию
 * 3. работа методов должна соответствовать условию
 */
public class task6113 {

    public static void main(String[] args) {
        DynamicArray<String> array = new DynamicArray<>();
        int count = 0;
        while (count < 20) {

            array.add("hello");
            count++;
        }
        array.remove(5);
        for (int i = 0; i < array.size; i++) {
            System.out.println(array.get(i));
        }
    }
    public static class DynamicArray<T> {
        private int size;
        private T[] array = (T[]) new Object[10];

        public DynamicArray() {}

        public void add(T el) {
            if (size == array.length) {
                array = Arrays.copyOf(array, array.length * 2);
            }
            array[size] = el;
            size++;
        }

        public void remove(int index) {
            if ((index >= size) || (index < 0) ) {
                throw new IndexOutOfBoundsException();
            } else {
                if ((array.length - 1 - index) >= 0) {
                    System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
                }
                size--;
            }
        }

        public T get(int index) {
            return array[index];
        }
    }
    // https://examples.javacodegeeks.com/dynamic-array-java-example/
    // https://stackoverflow.com/questions/48356333/creating-dynamic-array-in-java-without-using-collection/48356589
    // https://stackoverflow.com/questions/642897/removing-an-element-from-an-array-java
    // https://javarush.ru/groups/posts/2472-podrobnihy-razbor-klassa-arraylist
}
