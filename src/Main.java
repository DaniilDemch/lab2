import shapes.*;

public class Main {
    private static int index;


    private static double maxArea(Shape[] sh) {
        double max = sh[0].getArea();
        int ind = 0;
        for (int i = 1; i < sh.length; i++) {
            if (sh[i].getArea() > max) {
                max = sh[i].getArea();
                ind = i;
            }
        }
        index = ind;
        return sh[ind].getArea();
    }


    public static void main(String[] args) {
        Shape[] shapes;
        shapes = new Shape[10];

        shapes[0] = new Circle(new PointImplement(20, 10), 7);
        shapes[1] = new Circle(new PointImplement(200, 10), 434);
        shapes[2] = new Circle(new PointImplement(2022, 10), 182);

        shapes[3] = new Rectangle(new PointImplement(3, 7), new PointImplement(4, 3));
        shapes[4] = new Rectangle(new PointImplement(5, 4), new PointImplement(5, 3));
        shapes[5] = new Rectangle(new PointImplement(2, 1), new PointImplement(4, 7));
        shapes[6] = new Rectangle(new PointImplement(11, 98), new PointImplement(96, 11));

        shapes[7] = new Triangle(new PointImplement(53, 74), new PointImplement(92, 21), new PointImplement(12, 8));
        shapes[8] = new Triangle(new PointImplement(14, 13), new PointImplement(52, 10), new PointImplement(10, 7));
        shapes[9] = new Triangle(new PointImplement(53, 52), new PointImplement(1, 3), new PointImplement(15, 5));
        double size = maxArea(shapes);

        System.out.println("The maximum figure has index: " + index + ", its size is = " + size);
    }
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */

}
