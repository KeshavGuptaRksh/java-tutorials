package Loops;

import java.util.Scanner;

/**
 * PrimeNumber
 */
public class PrimeNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num, factors = 0, i;
        System.out.println("Enter a number");
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors++;
            }
        }
        if (factors == 2) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }
    }
}