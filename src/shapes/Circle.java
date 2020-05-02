package shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse{

    private Point center;
    private float radius;

    public Circle(Point center, float radius) {
        this.center = center;
        this.radius = radius;
    }



    public Point getCenter() {
        return center;
    }

    @Override
    public float getLengthEl() {
        return (float) (Math.PI * (2 * radius));
    }

    @Override
    public float getArea() {
         return (float) (Math.PI * Math.pow(radius, 2));
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
