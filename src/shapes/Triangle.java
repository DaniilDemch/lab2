package shapes;

import static java.lang.Math.cos;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon{
    private Point A;
    private Point B;
    private Point C;

    private Point center;
    private int corner;

    public Triangle(Point a, Point b, Point c) {
        A = a;
        B = b;
        C = c;
        setCenter();
    }

    public Point getCenter() {
        return center;
    }

    private void setCenter() {
        this.center = new PointImplement ((A.getX() + B.getX() + C.getX()) / 3,
                (A.getY() + B.getY() + C.getY()) / 3);
    }

    @Override
    public float getPerimeter() {
        var per1 = (Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2)));
        var per2 = (Math.sqrt(Math.pow(B.getX() - C.getX(), 2) + Math.pow(B.getY() - C.getY(), 2)));
        var per3 = (Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2)));
        var per = per1 + per2 + per3;

        return (float) per;
    }

    @Override
    public float getArea() {
        double p = this.getPerimeter();
        p = p / 2;

        var p1 = (Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2)));
        var p2 = (Math.sqrt(Math.pow(B.getX() - C.getX(), 2) + Math.pow(B.getY() - C.getY(), 2)));
        var p3 = (Math.sqrt(Math.pow(C.getX() - A.getX(), 2) + Math.pow(C.getY() - A.getY(), 2)));

        return (float) (Math.sqrt(p - p1) * (p - p2) * (p - p3));
    }

    public int getRotation() {
        return corner;
    }

    public void rotate(int rotationCorner) {
        int newCorner = this.corner + rotationCorner;
        var сornerInRads = Math.toRadians(newCorner);

        float newCentreX1 =
                (float) (center.getX() + (A.getX() - center.getX()) * cos(сornerInRads) - (A.getY() - center.getY()) * Math.sin(сornerInRads));
        float newCentreY1 =
                (float) (center.getY() + (A.getY() - center.getY()) * cos(сornerInRads) + (A.getX() - center.getX()) * Math.sin(сornerInRads));

        float newCentreX2 =
                (float) (center.getX() + (B.getX() - center.getX()) * cos(сornerInRads) - (B.getY() - center.getY()) * Math.sin(сornerInRads));
        float newCentreY2 =
                (float) (center.getY() + (B.getY() - center.getY()) * cos(сornerInRads) + (B.getX() - center.getX()) * Math.sin(сornerInRads));

        float newCentreX3 =
                (float) (center.getX() + (C.getX() - center.getX()) * cos(сornerInRads) - (C.getY() - center.getY()) * Math.sin(сornerInRads));
        float newCentreY3 =
                (float) (center.getY() + (C.getY() - center.getY()) * cos(сornerInRads) + (C.getX() - center.getX()) * Math.sin(сornerInRads));


        A = new PointImplement (newCentreX1, newCentreY1);
        B = new PointImplement (newCentreX2, newCentreY2);
        C = new PointImplement (newCentreX3, newCentreY3);

        this.corner = newCorner;
    }

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
