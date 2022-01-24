package lesson1;

import java.util.Scanner;

public class ExampleCondition {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите значение температуры на улице");
        int temperature = scanner.nextInt();
        if (temperature > 30) {
            System.out.println("Жарковато на улице");
        } else {
            System.out.println("Что-то прохладно");
        }

        ExampleMethod.printString();
    }
}
