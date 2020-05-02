package shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    private Point A;
    private Point B;
    private int corner;
    private Point center;


    public Rectangle(Point A, Point B) {
        this.A = A;
        this.B = B;
    }

    public float getArea() {
        return Math.abs(A.getX() - B.getX()) * Math.abs(A.getY() - B.getY());
    }

    public float getPerimeter() {
        return 2 * (Math.abs(A.getX() - B.getX()) + Math.abs(A.getY() - B.getY()));
    }

    public Point getCenter() {
        return center;
    }
    public int getRotation() {
        return corner;
    }

    public void rotate(int rotationAngle) {
        int angle = this.corner + rotationAngle;
        var angleInRads = Math.toRadians(angle);

        float x1 =
                (float) (center.getX() + (A.getX() - center.getX()) * Math.cos(angleInRads) - (A.getY()
                        - center.getY()) * Math.sin(angleInRads));
        float y1 =
                (float) (center.getY() + (A.getY() - center.getY()) * Math.cos(angleInRads) + (A.getX()
                        - center.getX()) * Math.sin(angleInRads));
        float x2 =
                (float) (center.getX() + (B.getX() - center.getX()) * Math.cos(angleInRads) - (B.getY()
                        - center.getY()) * Math.sin(angleInRads));
        float y2 =
                (float) (center.getY() + (B.getY() - center.getY()) * Math.cos(angleInRads) + (B.getX()
                        - center.getX()) * Math.sin(angleInRads));

        A = new PointImplement(x1, y1);
        B = new PointImplement(x2, y2);

        this.corner = angle;
    }


    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
