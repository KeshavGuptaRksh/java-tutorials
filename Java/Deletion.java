import java.util.Scanner;

public class Deletion {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = new int[100];
        int i, pos, n;
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        pos = sc.nextInt();
        for (i = pos - 1; i < n; i++) {
            a[i] = a[i + 1];
        }
        n--;
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
