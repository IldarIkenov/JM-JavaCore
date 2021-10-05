package jm.tasks.FilePathStreams;
/**
 * Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.
 *
 * Пример:
 * InputStream последовательно возвращает четыре байта: 48 49 50 51.
 * Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку: "0123".
 *
 * Требования:
 * 1. Метод должен быть публичным.
 * 2. Сигнатура метода должна быть: readAsString(InputStream inputStream, Charset charset)
 */

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class task5311 {
    public static void main(String[] args) throws IOException {
        byte[] bb = new byte[] {48, 49, 50, 51}; //0, 1, 2, 3
        ByteArrayInputStream bis = new ByteArrayInputStream(bb);
        System.out.println(readAsString(bis, Charset.forName("ASCII")));
    }
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();
        int b;

        while ((b = inputStreamReader.read()) != -1) {
            stringBuilder.append((char) b);
        }

        return stringBuilder.toString();
    }
}
