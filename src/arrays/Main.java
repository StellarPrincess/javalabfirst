package arrays;

import java.util.Scanner;

public class Main {
    private static void showArray(int[] arr) {
        for (int anArr : arr)
            System.out.print(anArr + " ");
    }

    private static int sumOfArray(int[] arr) {
        int res = 0;
        for (int anArr : arr) {
            res += anArr;
        }
        return res;
    }

    private static int numberOfEvens(int[] arr) {
        int res = 0;
        for (int anArr : arr)
            if (anArr % 2 == 0)
                res++;
        return res;
    }

    private static int numberOfIncludesOfAB(int[] arr, float a, float b) {
        int res = 0;
        for (int anArr : arr)
            if (anArr >= a && anArr <= b)
                res++;
        return res;
    }

    private static boolean isAllPositive(int[] arr) {
        for (int anArr : arr) if (anArr <= 0) return false;
        return true;
    }

    private static void reverseArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length * 0.5; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        while (size <= 0) {
            System.out.println("Размер массива не может быть меньше или равен нулю. Введите другое число:");
            size = in.nextInt();
        }
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите " + i + "-й элемент массива: ");
            arr[i] = in.nextInt();
        }

        System.out.println("Введите нижнюю границу отрезка:");
        float min = in.nextFloat();
        System.out.println("Введите верхнюю границу отрезка:");
        float max = in.nextFloat();
        while (max < min) {
            System.out.println("Верхняя граница должна быть больше нижней. Введите другой максимум:");
            max = in.nextFloat();
        }

        System.out.println("Массив:");
        showArray(arr);
        System.out.println("\nСумма его элементов:\n" + sumOfArray(arr));
        System.out.println("Количество чётных чисел в нём:\n" + numberOfEvens(arr));
        System.out.println("Количество входящих в [" + min + ", " + max + "] элементов:\n"
                + numberOfIncludesOfAB(arr, min, max));
        System.out.println((isAllPositive(arr) ? "Все" : "Не все") + " элементы этого массива положительны");
        reverseArray(arr);
        System.out.println("Развёрнутый в обратном порядке массив:");
        showArray(arr);
    }
}
