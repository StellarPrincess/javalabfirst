package basics;

import java.util.Scanner;

public class SinX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, step, res;

        System.out.println("Введите нижнюю границу отрезка:");
        a = in.nextFloat();
        System.out.println("Введите верхнюю границу отрезка:");
        b = in.nextFloat();
        while (b < a) {
            System.out.println("Верхняя граница должна быть не меньше нижней.");
            System.out.println("Введите верхнюю границу отрезка:");
            b = in.nextFloat();
        }
        System.out.println("Введите шаг табуляции:");
        step = in.nextFloat();
        while (Math.abs(step) <= 0) {
            System.out.println("Слишком маленький шаг, введите другой:");
            step = in.nextFloat();
        }
        if (step > 0) {
            for (double i = a; i < b + step * 0.5; i += step) {
                res = Math.sin(i);
                System.out.println("sin(" + i + ") = " + res);
            }
        } else {
            for (double i = b; i > a + step * 0.5; i += step) {
                res = Math.sin(i);
                System.out.println("sin(" + i + ") = " + res);
            }
        }
    }
}
