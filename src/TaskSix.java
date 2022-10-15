//При некоторых заданных x (допустимые значения x – интервал (-R, R)), n и e, определяемых
//вводом, вычислить:
//1) сумму n слагаемых заданного вида;
//2) сумму тех слагаемых, которые по абсолютной величине больше e;
//3) сумму тех слагаемых, которые по абсолютной величине больше e/10;
//4) значение функции с помощью методов Math.

import java.util.Scanner;
import java.util.Locale;

public class TaskSix {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите X: ");
        double x = sc.nextDouble();
        System.out.print("Введите N: ");
        int n = sc.nextInt();
        System.out.print("Введите E: ");
        double e = sc.nextDouble();
        System.out.println("Сумма n слагаемых: " + sum1(x, n));
        System.out.println("Сумма слагаемых >e: " + sum2(x, e, n));
        System.out.println("Сумма слагаемых >e/10: " + sum3(x, e, n));
        System.out.println("значение функции с помощью методов Math: " + (Math.exp(x)));
    }

    static double sum1(double x, int n) {
        return sum2(x, 0, n);
    }

    static double sum2(double x, double e, int n) {
        double sum = 0;
        int fact = 1;
        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                fact *= i;
            }
            double s = Math.pow(x, i)/ fact;
            System.out.println(fact);
            sum += ((Math.abs(s) > e)) ? s : 0;

            System.out.println(s);
        }
        return sum;
    }

    static double sum3(double x, double e, int n) {
        return sum2(x, e / 10, n);
    }
}
