package jm.tasks.primitivetypes;

/**
 * Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c ?
 * Допустимая погрешность – 0.0001 (1E-4)
 * Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 *
 * Требования:
 * Метод должен иметь сигнатуру: doubleExpression(double a, double b, double c)
 */
public class task2110 {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.1,0.2, 0.3));
    }
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) <= 1E-4;
        //return (float) (a + b) == (float) c;
    }
}
