import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);

    static void calculator() {
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();

        System.out.println("Enter  the operation : ");
        char operation = sc.next().charAt(0);

        if (operation == '+') {
            System.out.println("Addition of these numbers is : " + (a + b));
        } else if (operation == '-') {
            System.out.println("Subtraction of these number is : " + (a - b));
        } else if (operation == '*') {
            System.out.println("Multiplication of these number is : " + (a * b));
        } else if (operation == '/') {
            System.out.println("Divide of these number is : " + (a / b));
        }

    }

    public static void main(String[] args) {
        calculator();
    }
}
