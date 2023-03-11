package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    // uzupełnij metodę. Używaj scannera przekazanego w parametrze.
    void run(Scanner scanner) {
        Point point = new Point();
        System.out.println("Podaj X");
        point.setX(scanner.nextInt());
        System.out.println("Podaj Y");
        point.setY(scanner.nextInt());
        location(point.getX(), point.getY());
    }

    private void location(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.printf("Punkt (%d, %d) leży na środku układu współrzędnych", x, y);
        } else if (x == 0) {
            System.out.printf("Punkt (%d, %d) leży na osi Y", x, y);
        } else if (y == 0) {
            System.out.printf("Punkt (%d, %d) leży na osi X", x, y);
        } else if (x > 0 && y > 0) {
            System.out.printf("Punkt (%d, %d) leży w I ćwiartce układu współrzędnych", x, y);
        } else if (x < 0 && y > 0) {
            System.out.printf("Punkt (%d, %d) leży w II ćwiartce układu współrzędnych", x, y);
        } else if (x < 0) {
            System.out.printf("Punkt (%d, %d) leży w III ćwiartce układu współrzędnych", x, y);
        } else {
            System.out.printf("Punkt (%d, %d) leży w IV ćwiartce układu współrzędnych", x, y);
        }
    }
}
