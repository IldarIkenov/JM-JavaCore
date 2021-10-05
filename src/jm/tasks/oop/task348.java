package jm.tasks.oop;

//import java.util.Objects;

/**
 * Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals() сравнивал экземпляры
 * ComplexNumber по-содержимому полей re и im, а hashCode() был бы согласованным с реализацией equals().
 *
 * Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет
 *
 * Пример
 *
 * ComplexNumber a = new ComplexNumber(1, 1);
 * ComplexNumber b = new ComplexNumber(1, 1);
 * // a.equals(b) must return true
 * // a.hashCode() must be equal to b.hashCode()
 * Подсказка 1. Поищите в классе java.lang.Double статический метод, который поможет в решении задачи.
 *
 * Подсказка 2. Если задача никак не решается, можно позвать на помощь среду разработки, которая умеет сама генерировать
 * equals() и hashCode(). Если вы воспользовались помощью IDE, то разберитесь, что было сгенерировано и почему оно
 * выглядит именно так. Когда вас на собеседовании попросят на бумажке реализовать equals() и hashCode() для
 * какого-нибудь простого класса, то среда разработки помочь не сможет.
 *
 * Требования:
 * 1. Должен быть класс public static class ComplexNumber
 * 2. Класс ComplexNumber должен иметь поля re и im типа double
 * 3. Класс ComplexNumber должен переопределять public boolean equals(Object o) и public int hashCode()
 * 4. equals и hashcode должны корректно работать
 */
public class task348 {
    public static void main(String[] args) {
        ComplexNumber complexNumber1 = new ComplexNumber(2, 3);
        ComplexNumber complexNumber2 = new ComplexNumber(4, 3);
        if (complexNumber1.equals(complexNumber2)) {
            System.out.println("ok");
            System.out.println(complexNumber1.hashCode());
            System.out.println(complexNumber2.hashCode());
        } else {
            System.out.println("no");
            System.out.println(complexNumber1.hashCode());
            System.out.println(complexNumber2.hashCode());
        }

    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
        }

        @Override
        public int hashCode() {
             //return java.util.Objects.hash(getRe(), getIm());

//            double sum = Double.sum(getRe(), getIm());
//            return Double.hashCode(sum);

            final int prime = 31;
            int result = 1;
            result = prime * result + Double.hashCode(getRe());
            result = prime * result + Double.hashCode(getIm());
            return result;
        }
    }
}
