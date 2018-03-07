package basics;

import java.util.Scanner;

public class SquareEquality{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b, c;
        System.out.println("Введите коэффициент при x^2:");
        a = in.nextFloat();
        System.out.println("Введите коэффициент при x:");
        b = in.nextFloat();
        System.out.println("Введите свободную константу:");
        c = in.nextFloat();

        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println("В этом уравнении один корень:\nx = " + x);
            } else if (c == 0){
                System.out.println("Бесконечное количество решений.");
            } else
                System.out.println("В этом уравнении нет вещественных корней");
        } else {
            float d = b * b - 4 * a * c;

            if (d > 0) {
                System.out.println("В этом уравнении 2 корня:");
                double x1 = 0.5 * (-b + Math.sqrt(d)) / a;
                double x2 = 0.5 * (-b - Math.sqrt(d)) / a;
                System.out.println("x1 = " + x1 + ", x2 = " + x2);
            } else if (d < 0)
                System.out.println("В этом уравнении нет вещественных корней.");
            else {
                System.out.println("В этом уравнении один корень:");
                double x = -0.5 * b / a;
                if (x == -0)
                    x = 0;
                System.out.println("x = " + x);
            }
        }
    }
}
