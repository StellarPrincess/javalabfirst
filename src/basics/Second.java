package basics;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a, b, c;
        System.out.println("Введите вещественное число:");
        a = in.nextFloat();
        System.out.println("Введите вещественное число:");
        b = in.nextFloat();
        System.out.println("Введите вещественное число:");
        c = in.nextFloat();
        float temp = a * b * c;
        System.out.println("Произведение: " + temp);
        temp = (a + b + c) / 3;
        System.out.println("Среднее арифметическое: " + temp);
        float min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;
        float max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        System.out.print("Числа в порядке возрастания: " + min + " ");
        if (a > min && a < max)
            System.out.print(a + " ");
        else if (b > min && b < max)
            System.out.print(b + " ");
        else
            System.out.print(c + " ");
        System.out.println(max);
    }
}
