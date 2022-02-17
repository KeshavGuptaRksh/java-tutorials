package Nested_Loops;

public class Prime_1_to_100 {
    public static void main(String[] args) {
        int i, n, f;
        for (n = 1; n <= 100; n++) {
            f = 0;
            for (i = 1; i <= n; i++) {
                if (n % i == 0) {
                    f++;
                }
            }
            if (f == 2) {
                System.out.println(n);
            }
        }

    }
}
