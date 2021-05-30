package by.epam.unit03.main;

//Необходимо вывести на экран таблицу умножения на 3

public class Task01 {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println(x + "*3=" + x * 3);
            x = x + 1;
        }
        while (x < 11);
    }
}
