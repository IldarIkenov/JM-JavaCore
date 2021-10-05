package jm.tasks.primitivetypes;

/**
 * Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.
 *
 * Пример ввода: [3,5,20,8,7,3,100]
 *
 * Пример вывода: 3,5,7,3
 *
 *
 *
 * Требования:
 * Сигнатура метода должна быть: printOddNumbers(int[] arr)
 */
public class task2417 {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(numbers);

    }
    public static void printOddNumbers(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                stringBuilder.append(arr[i] + ",");
            }
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        // https://qastack.ru/programming/3395286/remove-last-character-of-a-stringbuilder

        //stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.println(stringBuilder);


    }
}
