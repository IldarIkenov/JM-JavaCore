package jm.tasks.functioninterfecesstreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Напишите программу, читающую из System.in текст в кодировке UTF-8, подсчитывающую в нем частоту появления слов, и
 * в конце выводящую 10 наиболее часто встречающихся слов.
 *
 * Словом будем считать любую непрерывную последовательность символов, состоящую только из букв и цифр. Например,
 * в строке "Мама мыла раму 33 раза!" ровно пять слов: "Мама", "мыла", "раму", "33" и "раза".
 *
 * Подсчет слов должен выполняться без учета регистра, т.е. "МАМА", "мама" и "Мама" — это одно и то же слово.
 * Выводите слова в нижнем регистре.
 *
 * Если в тексте меньше 10 уникальных слов, то выводите сколько есть.
 *
 * Если в тексте некоторые слова имеют одинаковую частоту, т.е. их нельзя однозначно упорядочить только по частоте,
 * то дополнительно упорядочите слова с одинаковой частотой в лексикографическом порядке.
 *
 * Задача имеет красивое решение через стримы без циклов и условных операторов. Попробуйте придумать его.
 *
 * Пример ввода  1:
 * Мама мыла-мыла-мыла раму!
 *
 * Пример вывода  1:
 * мыла
 * мама
 * раму
 *
 * Пример ввода 2:
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam,
 * tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus
 * imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur
 * adipiscing elit. Integer vel odio nec mi tempor dignissim.
 *
 * Пример вывода 2:
 * consectetur
 * faucibus
 * ipsum
 * lorem
 * adipiscing
 * amet
 * dolor
 * eget
 * elit
 * mi
 * Требования:
 * 1. Должен быть метод public static void main(String[] args)
 * 2. Программа должна читать данные с консоли
 * 2. Программа должна писать данные в консоль
 */
public class task7212 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        Arrays.stream(bufferedReader.readLine().toLowerCase().split("[^\\p{L}\\p{Digit}]+"))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
//                .limit(10)
//                .forEachOrdered(e -> System.out.println(e.getKey()));

        bufferedReader.lines()
                .flatMap(str -> Stream.of(str.split("[^a-zA-Zа-яА-Я0-9]")))
                .filter(str -> !str.isEmpty())
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .forEachOrdered(e -> System.out.println(e.getKey()));

//        Scanner sc = new Scanner(System.in).useDelimiter("[^\\p{L}\\p{Digit}]+");
//        Map<String, Integer> words = new HashMap<>();
//        sc.forEachRemaining(s -> words.merge(s.toLowerCase(), 1, Integer::sum));
//        words.entrySet().stream()
//                .sorted((val1, val2) -> val2.getValue().compareTo(val1.getValue()))
//                .limit(10)
//                .map(Map.Entry::getKey)
//                .forEach(System.out::println);

    }
}
