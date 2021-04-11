package week_1.task01;


import java.util.Arrays;
import java.util.Scanner;

public class QuadraticEquation {
    private final double a;
    private final double b;
    private final double c;

    //конструктор, в аргументах коэффициенты Уравнение вида: a*x^2 + b*x + c = 0
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


// главный метод для решения уравнения
    public double[] solve() {
        double discriminant = Discriminant.find(a, b, c);
        if (discriminant > 0) {
            double[] result = new double[2];
            result[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            result[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            return result;
        } else if (discriminant == 0) {
            return new double[]{(-b) / (2 * a)};
        }
        return null;
    }

    //Lля вычисления дискриминанта
    private static class Discriminant {
        public static double find(double a, double b, double c) {
            return b * b - 4 * a * c;
        }

    }
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ввод уравнения вида: a*x^2 + b*x + c = 0");
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите a: ");
            double a = sc.nextDouble();
            System.out.println();
            System.out.print("Введите b: ");
            double b = sc.nextDouble();
            System.out.println();
            System.out.print("Введите c: ");
            double c = sc.nextDouble();
            System.out.println();
            System.out.print("Результаты вычисления: ");
            System.out.println(Arrays.toString(new QuadraticEquation(a, b, c).solve()));

        }
    }
}

