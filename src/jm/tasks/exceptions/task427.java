package jm.tasks.exceptions;

/**
 * Создайте статический класс Car, чтобы объекты этого типа можно было использовать в try-with-resources.
 *
 * Метод close() должен выводить на экран фразу "Машина закрывается...".
 *
 * Try должен ловить все непроверяемые исключения и игнорировать их.
 *
 * В методе main в блоке try вызови метод drive(). Метод drive должен выводить на экран сообщение "Машина поехала."
 */
public class task427 {
    public static class Car implements AutoCloseable {

        @Override
        public void close() throws RuntimeException {
            throw new RuntimeException("Машина закрывается...");
        }


        public void drive() {
            System.out.println("Машина поехала.");
        }
    }

    public static void main(String... args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
    // https://coderoad.ru/6889697/Закройте-ресурс-тихо-используя-try-with-resources
}
