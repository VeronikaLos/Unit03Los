package by.epam.unit03.main;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task06 {
    public static void main(String[] args) {
        int x = 123;
        int y = 615;

        while (x > 0) {
            System.out.println(x % 10);
            x = x / 10;
        }

        while (y > 0) {
            System.out.println(y % 10);
            y = y / 10;
        }
    }
}
