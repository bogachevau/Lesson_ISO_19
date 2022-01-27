package lesson2;

public class ExampleSwitch {
    public static void main(String[] args) {
        int code = 2;

        switch (code) {
            case 0:
                System.out.println("Код ноль");
                break;
            case 1:
                System.out.println("Код один");
                break;
            case 2:
                System.out.println("Код два");
                break;
            default:
                System.out.println("Недопустимое значение");
        }

        if (code == 0) {
            System.out.println("Код ноль");
        } else if (code == 1) {
            System.out.println("Код один");
        } else if (code == 2) {
            System.out.println("Код два");
        } else {
            System.out.println("Недопустимое значение");
        }
    }
}
