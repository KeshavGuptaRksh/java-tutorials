package Loops;

import java.util.Scanner;

public class TwinPrime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2, f1 = 0, f2 = 0, i;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        for (i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                f1++;
            }
        }
        for (i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                f2++;
            }
        }
        if (f1 == 2 && f2 == 2 && (num1 - num2 == 2 || num2 - num1 == 2)) {
            System.out.println("Twin Prime");
        } else {
            System.out.println("Not Twin Prime");
        }
    }
}
