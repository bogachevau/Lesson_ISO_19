package lesson2;

public class ExampleWhileAndDoWhile {
    public static void main(String[] args) {
        int a = 5;
        while (a < 100_000) {
            a = (a + 4) + a * 6;
            System.out.println(a);
        }

        int b = 25;
        do {
            b = b + 10;
            System.out.println(b);
        } while (b < 20);
    }
}
