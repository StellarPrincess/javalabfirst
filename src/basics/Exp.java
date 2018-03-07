package basics;

import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, temp = 1, precision, res = 0;
        System.out.println("Введите минимальную погрешность:");
        precision = in.nextDouble();
        while (precision <= 0) {
            System.out.println("Слишком малое значение погрешности/погрешность должна быть > 0, введите другое");
            precision = in.nextDouble();
        }
        System.out.println("Введите степень:");
        x = in.nextDouble();
        for (int i = 1; Math.abs(temp) > precision; i++) {
            res += temp;
            temp *= x / i;
        }
        System.out.println("e^x = " + res);
    }
}
