package basics;

import java.util.Scanner;

public class SLE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a11, a12, a21, a22, b1, b2;

        System.out.println("Введите коэффициенты первого уравнения (_a_x + _b_y = _c_):");
        a11 = in.nextDouble();
        a12 = in.nextDouble();
        b1 = in.nextDouble();
        System.out.println("Введите коэффициенты второго уравнения (_a_x + _b_y = _c_):");
        a21 = in.nextDouble();
        a22 = in.nextDouble();
        b2 = in.nextDouble();

        System.out.println(sle(a11, a12, b1, a21, a22, b2));
    }
    public static String sle(double a11, double a12, double b1, double a21, double a22, double b2){
        double x, y, d;
        d = (a11 * a22) - (a12 * a21);
        if (d != 0) {
            x = ((b1 * a22) - (a12 * b2)) / d;
            y = ((a11 * b2) - (b1 * a21)) / d;
            return ("x = " + x + " y = " + y);
        } else if (a11 == 0 && a12 == 0) {
            if (b1 != 0) {
                return ("Решений нет.");
            } else if (a21 != 0) {
                return ("x = " + b2 / a21 + " - " + a22 / a21 + "y");
            } else if (a22 != 0){
                return ("y = " + b2 / a22 + " - " + a21 / a22 + "x");
            } else if (b2 == 0) {
                return ("x, y - любые, независящие друг от друга.");
            } else {
                return ("Решений нет.");
            }
        } else if (a21 == 0 && a22 == 0) {
            if (b2 != 0) {
                return ("Решений нет.");
            } else if (a11 != 0) {
                return ("x = " + b1 / a11 + " - " + a12 / a11 + "y");
            } else {
                return ("y = " + b1 / a12 + " - " + a11 / a12 + "x");
            }
        } else if ((a11 == 0 && a21 == 0) || (a12 == 0 && a22 == 0)) {
            return ("Решений нет.");
        } else if (Double.compare(a11 / a21, a12/ a22) == Double.compare(a11/ a21, b1 / b2)) {
            return ("x = " + b1 / a11 + " - " + a12 / a11 + "y");
        } else {
            return ("Решений нет.");
        }
    }
}