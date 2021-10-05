package jm.tasks.FilePathStreams;
/**
 * Напишите метод void print(InputStream inputStream, OutputStream outputStream) который принимает InputStream и
 * OutputStream, считывает все байты из inputStream и записывает в OutputStream только четные.
 *
 * Пример ввода: 3, 10, 4, 5, 7
 *
 * Пример вывода: 10, 4
 *
 * Требования:
 * 1. Метод должен быть публичным.
 * 2. Параметры должны иметь тип InputStream inputStream и OutputStream outputStream.
 * 3. Сигнатура метода должна быть: print(InputStream inputStream, OutputStream outputStream)
 */

import java.io.*;

public class task528 {
    public static void main(String[] args) throws IOException {
        InputStream in = new ByteArrayInputStream(new byte[]{3, 10, 4, 5, 7});
        OutputStream out = new ByteArrayOutputStream();
        //int result = print(in, out);
        //System.out.println(result);

    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte even;
        int value;

        while ((value = inputStream.read()) != -1) {
            even = (byte) value;
            if ((even % 2) == 0) {
                outputStream.write(even);
            }
        }
        outputStream.flush();
    }
}
