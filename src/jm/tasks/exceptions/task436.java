package jm.tasks.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Создайте в статичном публичном методе logging логгер с именем com.javamentor.logging.Test,
 * залогируйте им два сообщения: первое "Все хорошо" с уровнем INFO и второе "Произошла ошибка" с уровнем WARNING.
 */
public class task436 {

    public static void logging() {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.log(Level.INFO, "Все хорошо");
        logger.log(Level.WARNING, "Произошла ошибка");
    }
    // https://habr.com/ru/post/130195/
    // https://www.geeksforgeeks.org/logger-getlogger-method-in-java-with-examples/

}
