import java.util.Scanner;

public class Arrange {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a[] = { 15, 21, -32, -41, 54, 61, 71, -19, -44, 52 };
        int i, k, j, val;

        for (i = 0; i < a.length - 1; i++) {

            for (j = i; j < a.length; j++) {
                if (a[j] < 0) {
                    val = a[j];
                    for (k = j; k > i; k--) {
                        a[k] = a[k - 1];
                    }
                    a[i] = val;
                }
            }
        }
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}
