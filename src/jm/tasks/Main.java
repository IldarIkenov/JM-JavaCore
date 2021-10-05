package jm.tasks;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    @FunctionalInterface
    public interface Foo {
        String method(String string);
    }
//    public static String add(String string, Foo foo) {
//        return foo.method(string);
//    }
    public static String add(String string, Function fn) {
        return (String) fn.apply(string);
    }

    public static void main(String[] args) {
//        Foo foo = parameter -> parameter + " from lambda";
//        String result = Main.add("Message ", foo);
//        System.out.println(result);

        Function fn =
                parameter -> parameter + " from lambda";
        String result = Main.add("Message ", fn);


    }
}

