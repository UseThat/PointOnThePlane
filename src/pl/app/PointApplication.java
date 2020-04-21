package pl.app;

import pl.control.PointController;
import pl.data.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point point1 = new Point(4,5);
        PointController control = new PointController();
        System.out.println(point1);
        control.addX(point1);
        System.out.println(point1);
        control.addY(point1);
        System.out.println(point1);
        control.minusX(point1);
        System.out.println(point1);
        control.minusY(point1);
        System.out.println(point1);
    }
}
