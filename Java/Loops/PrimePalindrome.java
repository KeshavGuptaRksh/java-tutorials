package Loops;

import java.util.Scanner;

public class PrimePalindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num, i, f = 0, rev = 0, temp;
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                f++;
            }
        }
        temp = num;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }
        if (f == 2 && rev == num) {
            System.out.println("Prime Palindrome");
        } else {
            System.out.println("Not Prime Palindrome");
        }
    }
}
