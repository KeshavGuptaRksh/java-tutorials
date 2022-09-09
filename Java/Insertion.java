import java.util.Scanner;

public class Insertion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = new int[100];
        int n, i, pos, val;
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        pos = sc.nextInt();
        val = sc.nextInt();
        for (i = n - 1; i >= pos - 1; i--) {
            a[i + 1] = a[i];
        }
        a[pos - 1] = val;
        n++;
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
