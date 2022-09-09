import java.util.Scanner;

public class LSearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = { 1, 3, 56, 78, 34, 23, 89, 5, 12, 4 };
        int i, val, flag = 0;
        System.out.println("Enter the value to be searched");
        val = sc.nextInt();
        for (i = 0; i < 10; i++) {
            if (val == a[i]) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }
    }
}
