package lesson1;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        double y;
        System.out.println("Введите значение Х: ");
        x = scanner.nextInt();
        if (x > 3) {
            y = 27 + Math.pow((x -3), 3);
        } else if (x > 1) {
            y = Math.pow(x, 3);
        } else if (x > 0) {
            y = x;
        } else {
            y = Math.pow(Math.sin(x), 2) / 2;
        }
        System.out.println("Результат: " + " y = " + y);
    }
}
