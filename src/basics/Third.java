package basics;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите целое число:");
        a = in.nextInt();
        System.out.println("Введите целое число:");
        b = in.nextInt();
        System.out.println("Введите целое число:");
        c = in.nextInt();
        int temp = a * b * c;
        System.out.println("Произведение: " + temp);
        float ariphMean = (float)(a + b + c) / 3;
        System.out.println("Среднее арифметическое: " + ariphMean);
        int min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;
        int max = a;
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
