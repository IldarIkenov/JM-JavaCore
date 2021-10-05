package jm.tasks.FilePathStreams;
/**
 * Реализуйте метод, который из переданного массива байт восстановит массив объектов Animal. Массив байт устроен
 * следующим образом. Сначала идет число типа int, записанное при помощи ObjectOutputStream.writeInt(size).
 * Далее подряд записано указанное количество объектов типа Animal, сериализованных при помощи ObjectOutputStream.writeObject(animal).
 *
 * Если вдруг массив байт не является корректным представлением массива экземпляров Animal, то метод должен бросить
 * исключение java.lang.IllegalArgumentException.
 *
 * Причины некорректности могут быть разные. Попробуйте подать на вход методу разные некорректные данные и посмотрите,
 * какие исключения будут возникать. Вот их-то и нужно превратить в IllegalArgumentException и выбросить. Если что-то
 * забудете, то проверяющая система подскажет. Главное не глотать никаких исключений, т.е. не оставлять нигде пустой catch.
 *
 * Требования:
 * 1. Метод должен быть публичным.
 * 2. Сигнатура метода должна быть: Animal[] deserializeAnimalArray(byte[] data)
 */

import java.io.*;
import java.util.Objects;

public class task547 {
    public static void main (String[] args){
//        Animal[] animalM1 = { new Animal("Cat"), new Animal("Dog"), new Animal("Elephant"),
//                new Animal("Cock"), new Animal("Bull"), new Animal("Ant"),
//                new Animal("Tentecles"), new Animal("Worm")};
//        ByteArrayOutputStream bai = new ByteArrayOutputStream();
//        ObjectOutputStream oos = new ObjectOutputStream(bai);
//        oos.writeInt(animalM1.length);
//        for (int i = 0; i < animalM1.length; i++) {
//            oos.writeObject(animalM1[i]);
//        }
//        oos.flush();
//        oos.close();
//        Animal[] animalM2 = deserializeAnimalArray(bai.toByteArray());
//        for (int i = 0; i < animalM2.length; i++) {
//            System.out.printf("%d. %s \n", i+1, animalM2[i].getName());
//        }
    }


//


    static class Animal implements Serializable {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }
    }
    // Создал объект ObjectInputStream через ByteArrayInputStream. Прочитал int из потока и создал массив соответствующего
    // размера, заполнил в цикле и вернул его в качестве результата. Про исключение не заморачивайтесь,
    // я обернул все в try-catch. Ловил обычный Exception, а обработал его одной строкой - выбросив требуемое
    // исключение по условию задачи. И тест мейна, кому понадобится в идее
    // https://docs.oracle.com/javase/7/docs/api/java/io/ObjectInputStream.html
    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animals = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            int size = objectInputStream.readInt();
            animals = new Animal[size];
            for (int i = 0; i < animals.length; i++) {
                animals[i] = (Animal) objectInputStream.readObject();
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException();
        }
        return animals;
    }


}
