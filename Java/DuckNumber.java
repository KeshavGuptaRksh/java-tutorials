import java.util.Scanner;

public class DuckNumber {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, flag = 0, ld;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        while (n != 0) {
            ld = n % 10;
            if (ld == 0) {
                flag = 1;
            }
            n /= 10;
        }
        if (flag == 1) {
            System.out.println("Duck Number");
        } else {
            System.out.println("Not a Duck Number");
        }
    }
}
