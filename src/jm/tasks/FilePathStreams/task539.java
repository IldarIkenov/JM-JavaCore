package jm.tasks.FilePathStreams;
/**
 * Какими байтами представляется символ 'Ы' в кодировке UTF-8?
 * Введите десятичные безнаковые значения байт через пробел, например, 10 34 254.
 */

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class task539 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String myString = "Ы";
        byte[] bytes = myString.getBytes("UTF-8");
        for (byte oneByte : bytes) System.out.println(Byte.toUnsignedInt(oneByte));
    }
    // https://ru.stackoverflow.com/questions/463550/как-узнать-байты-определенного-символа
}
