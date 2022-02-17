import java.util.Scanner;

public class PrimeNext {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, f, flag = 0;
        System.out.println("Enter a number");
        n = sc.nextInt();
        while (flag == 0) {
            f = 0;
            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    f++;
                }
            }
            if (f == 2) {
                flag = 1;
                break;
            }
            n++;
        }
        if (flag == 1) {
            System.out.println(n);
        }

    }
}
