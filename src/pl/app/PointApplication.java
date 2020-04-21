package pl.app;

import pl.control.PointController;
import pl.data.Point;

public class PointApplication {
    public static void main(String[] args) {
        int choose = 1;
        Point point1 = new Point(4,5);
        PointController control = new PointController();
        System.out.println(point1);
        System.out.println("Choose options:");
        System.out.println("0 - exit");
        System.out.println("1 - add X");
        System.out.println("2 - add Y");
        System.out.println("3 - minus X");
        System.out.println("4 - minus Y");
        System.out.println(choose);
        switch (choose){
            case 0:
                System.out.println("Bye bye!");
                break;
            case 1:
                control.addX(point1);
                System.out.println(point1);
                break;
            case 2:
                control.addY(point1);
                System.out.println(point1);
                break;
            case 3:
                control.minusX(point1);
                System.out.println(point1);
                break;
            case 4:
                control.minusY(point1);
                System.out.println(point1);
                break;
            default:
                System.out.println(point1);

        }




    }
}
