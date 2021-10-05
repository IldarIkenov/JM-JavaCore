package jm.tasks.primitivetypes;

/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 *
 * Требования:
 * 1. Сигнатура метода должна быть: charExpression(int a)
 */
public class task222 {
    public static void main(String[] args) {
        System.out.println(charExpression(32)); // 32 = |, 2 = ^
    }
    public static char charExpression(int a) {
        return (char) ('\\' + a);
        //В таблице unicode символ '\' равняется 92 и с его расстояния начинаем, 92 + 32 = 124, результат порядка символа 124 = |
        //http://foxtools.ru/Unicode таблица unicode
    }
}
