package by.epam.unit03.main;

//Написать программу, переводящую римские цифры в арабские

public class Task07 {
    public static void main(String[] args) {
        String rim1 ="I";
        String rim2 = "II";
        String rim3 = "III";
        String rim4 = "IV";
        String rim5 = "V";
        String rim6 = "VI";
        String rim7 = "VII";
        String rim8 = "VIII";
        String rim9 = "IX";
        int arab1 = 0;
        int arab2 = 0;
        int arab3 = 0;
        int arab4 = 0;
        int arab5 = 0;
        int arab6 = 0;
        int arab7 = 0;
        int arab8 = 0;
        int arab9 = 0;

        if (rim1 == "I") {// такая цепочка if-ов избыточка, произойдет проверка одного условия на истину, а остальные вынуждены буду отработать вхолостую
            arab1 = 1;
        }
        if (rim2 == "II") {
            arab2 = 2;
        }
        if (rim3 == "III") {
            arab3 = 3;
        }
        if (rim4 == "IV") {
            arab4 = 4;
        }
        if (rim5 == "V") {
            arab5 = 5;
        }
        if (rim6 == "VI") {
            arab6 = 6;
        }
        if (rim7 == "VII") {
            arab7 = 7;
        }
        if (rim8 == "VIII") {
            arab8 = 8;
        }
        if (rim9 == "IX") {
            arab9 = 9;
        }
        System.out.println("I=" + arab1);
        System.out.println("II=" + arab2);
        System.out.println("III=" + arab3);
        System.out.println("IV=" + arab4);
        System.out.println("V=" + arab5);
        System.out.println("VI=" + arab6);
        System.out.println("VII=" + arab7);
        System.out.println("VIII=" + arab8);
        System.out.println("IX=" + arab9);
    }// это задача решается через Switch
    // да и с количеством переменных у тебя перебор
}
