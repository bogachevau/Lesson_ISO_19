package lesson1;

public class ExampleMethod {
    public static int addNumber(int a, int b, int c) {
        return a + b + c;
    }

    public static void printString() {
        System.out.println("Какая-то строка)");
    }

    public static void main(String[] args) {
        System.out.println(addNumber(3, 5, 7));
        printString();
    }
}
