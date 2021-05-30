package by.epam.unit03.main;

// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10)

public class Task03 {
    public static void main(String[] args) {
        long x = 2;
        long sum;
        long multi;
        multi = 1;
        sum = 1;
        while (x < 11) {
            sum = sum + x;
            multi = multi * sum;
            x = x + 1;
        }
        System.out.println("multi=" + multi);
    }
}


