package jm.tasks.oop;

/**
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y - снизу вверх. (Помните, как рисовали графики функций в школе?)
 * В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 * Требования:
 * 1. должен быть метод public static void moveRobot(Robot robot, int toX, int toY)
 * 2. метод moveRobot должен переместить робота в позицию int toX, int toY
 */
public class task3313 {
    public static void main(String[] args) {
        Robot robot = new Robot();
        moveRobot(robot, 3, 0);
    }
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x=0;
        int y=0;
        Direction direction = Direction.UP;

        public void getData(){
            System.out.println("X: " + x);
            System.out.println("Y: " + y);
        }


        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            System.out.println("Поворот против часовой стрелки");
            if (direction == Direction.DOWN){
                this.direction = Direction.RIGHT;
                return;
            }

            if (direction == Direction.UP){
                this.direction = Direction.LEFT;
                return;
            }

            if (direction == Direction.LEFT){
                this.direction = Direction.DOWN;
                return;
            }

            if (direction == Direction.RIGHT){
                this.direction = Direction.UP;
                return;
            }
        }

        public void turnRight() {
            System.out.println("поворот по часовой стрелке");
            if (this.direction == Direction.DOWN){
                System.out.println("Вниз -> влево");
                this.direction = Direction.LEFT;
                return;
            }

            if (this.direction == Direction.UP){
                System.out.println("Вверх -> вправо");
                this.direction = Direction.RIGHT;
                return;
            }

            if (this.direction == Direction.LEFT){
                System.out.println("Влево -> вверх");
                this.direction = Direction.UP;
                return;
            }

            if (this.direction == Direction.RIGHT){
                System.out.println("Вправо -> вниз");
                this.direction = Direction.DOWN;
                return;
            }
        }

        public void stepForward() {
            System.out.println("движение");
            if (direction == Direction.DOWN){
                System.out.println("вниз");
                this.y--;
            }

            if (direction == Direction.UP){
                System.out.println("вверх");
                this.y++;
            }

            if (direction == Direction.LEFT){
                System.out.println("налево");
                this.x--;
            }

            if (direction == Direction.RIGHT){
                System.out.println("направо");
                this.x++;
            }
        }
    }
    public static void moveRobot(Robot robot, int toX, int toY) {

        if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }
    }
}
