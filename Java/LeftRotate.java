import java.util.Scanner;

/**
 * LeftRotate
 */
public class LeftRotate {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a[] = new int[10];
        int i, f;
        System.out.println("Enter Array elements");
        for (i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        f = a[0];
        for (i = 0; i < 9; i++) {
            // System.out.print(a[i] + "\t");
            a[i] = a[i + 1];
        }
        a[9] = f;
        for (i = 0; i < 10; i++) {
            System.out.print(a[i] + "\t");
        }
    }
}