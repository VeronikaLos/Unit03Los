package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        char z = 0;


        while (z != '#') {
            //ввести x
            System.out.print("Введите операнд x > ");
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.print("Введите верный операнд x > ");
            }
            x = sc.nextInt();

            //ввести знак операции
            System.out.print("Введите знак операции > ");
            z = sc.next().charAt(0);
            if (z != '+' && z != '-' && z != '/' && z != '*') {
                System.out.println("Вы ввели неверный знак операции");
            }
            if (z == '#') {
                break;
            }

            //ввести y
            System.out.print("Введите операнд y > ");
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.print("Введите верный операнд y > ");
            }
            y = sc.nextInt();

            int result = 0;

            if (z == '+') {
                result = x + y;
            } else if (z == '-') {
                result = x - y;
            } else if (z == '/' && y != 0) {
                result = x / y;
            } else if (z == '/' && y == 0) {
                System.out.println("Ошибка деления");
            } else if (z == '*') {
                result = x * y;
            } else {
                System.out.println("Неверное выражение");
            }
            System.out.println(result);
        }
        System.out.println("Прекращение выполнения вычисления");
    }
}

