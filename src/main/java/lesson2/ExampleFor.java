package lesson2;

public class ExampleFor {
    public static void main(String[] args) {

        //найти сумму всех целых чисел от 0 до 1000
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println(sum);

        for (int i = 30; i > 0; i -= 2) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}
