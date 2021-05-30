package by.epam.unit03.main;

public class Task05 {
    public static void main(String[] args) {
        double a;
        double b;
        double h;
        double y;
        a = 2;
        b = 3.5;
        h = 0.1;
        System.out.println("---------------------------------");
        System.out.printf("|\t%5s\t|\t%5s\t|\n", "x", "y");
        System.out.println("---------------------------------");
        for (double x = a; x <= b; x = x + h) {
            y = 2 * Math.tan(x/2) +1;
            System.out.printf("|\t%5.2f\t|\t%5.2f\t|\n", x, y);
        }
        System.out.println("---------------------------------");
    }
}
