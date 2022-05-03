import java.util.Scanner;

/**
 * Array
 */
public class Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}