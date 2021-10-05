package jm.tasks.oop;

/**
 * Создайте класс Human с полями возраст (age), имя (name), фамилия (secondName) и любимый вид спорта (favoriteSport).
 *
 * Создайте 3 конструктора в классе Human, 1-ый - пустой, 2-ой, который конструирует Human’a от всех полей и третий, который конструирует Human’a, от всех полей, кроме любимого вида спорта. Для успешного тестирования решения важно объявлять аргументы в конструкторах именно в том порядке, в котором они написаны в данном описании (возраст (age), имя (name), фамилия (secondName) и любимый вид спорта (favoriteSport))
 *
 * В методе main создайте 3 экземпляра человека используя 3 этих разных конструктора. поля класса должны иметь размерность, не превышающую необходимую. Класс должен быть объявлен статическим, метод main не должен находиться в классе, поля класса должны иметь доступ только внутри класса
 *
 * Требования:
 * 1. Должен быть метод public static void main(String[] args)
 * 2. Должен быть public static class Human
 * 3. У класс Human должны быть поля
 * 4. Класс Human должен иметь 3 конструктора
 * 5. В методе main нужно создать три объекта класса Human тремя способами
 */
public class task3312 {
    public static void main(String[] args) {
        Human human1 = new Human((byte) 15, "Алекс", "Иванов", "Бег");
        Human human2 = new Human((byte) 30, "Михаил", "Сидоров");
        Human human3 = new Human((byte) 23, "Маша", "Николаева", "Стрельба");

        System.out.println(human1 + "\n");
        System.out.println(human2 + "\n");
        System.out.println(human3);

    }

    public static class Human {
        private byte age;
        private String name;
        private String secondName;
        private String favoriteSport;

        public Human () {

        }

        public Human (byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }

        public Human (byte age, String name, String secondName, String favoriteSport) {
            this (age, name, secondName);
            this.favoriteSport = favoriteSport;
        }
        @Override
        public String toString() {
            return "Name: " + name +
                    "\nSecondName: " + secondName +
                    "\nAge: " + age +
                    "\nSport: " + favoriteSport;
        }

    }
}
