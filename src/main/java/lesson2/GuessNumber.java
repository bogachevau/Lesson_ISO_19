package lesson2;

import java.util.Scanner;

/**
 * Написать программу, которая загадывает случайное число от 0 до 9
 * и пользователю дается 3 попытки угадать это число. При каждой попытке
 * компьютер должен сообщить, больше ли указанное пользователем число,
 * чем загаданное, или меньше. После победы или проигрыша выводится запрос –
 * «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
 */

public class GuessNumber {
    public static void main(String[] args) {
        int replay = 1;
        while (replay == 1) {
            System.out.println("Добро пожаловать в игру угадай число!");
            int number = (int) (Math.random() * 9);
            for (int attempt = 3; attempt >= 0; ) {
                System.out.println("Вам нужно угадать число от 0 до 9. У Вас "
                        + attempt + " попытки");
                Scanner scanner = new Scanner(System.in);
                int scannerNum = scanner.nextInt();
                if (scannerNum == number) {
                    System.out.println("Поздравляем Вы выиграли");
                    break;
                } else if (scannerNum < number) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("Загаданное число меньше");

                }
                attempt--;
                if (attempt < 1) {
                    System.out.println("Вы проиграли :(");
                    break;
                }
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            Scanner scanner = new Scanner(System.in);
            replay = scanner.nextInt();
        }
    }
}
