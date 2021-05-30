package by.epam.unit03.main;

//Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5

public class Task04 {
    public static void main(String[] args) {
        double a;
        double b;
        double h;
        double y;
        a = -5;
        b = 5;
        h = 0.5;
        System.out.println("---------------------------------");
        System.out.printf("|\t%5s\t|\t%5s\t|\n", "x", "y");
        System.out.println("---------------------------------");
        for (double x = a; x <= b; x = x + h) {
            y = 5 - Math.pow(x, 2) / 2;
            System.out.printf("|\t%5.2f\t|\t%5.2f\t|\n", x, y);
        }
        System.out.println("---------------------------------");
    }
}
