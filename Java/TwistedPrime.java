import java.util.Scanner;

public class TwistedPrime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, f = 0, temp, rev = 0, revf = 0;
        System.out.println("Enter a number");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                f++;
            }
        }
        temp = n;
        while (temp != 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        for (i = 1; i <= rev; i++) {
            if (rev % i == 0) {
                revf++;
            }
        }
        if (f == 2 && revf == 2) {
            System.out.println("Twisted Prime");
        } else {
            System.out.println("Not Twisted Prime");
        }
    }

}