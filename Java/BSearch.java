import java.util.Scanner;

public class BSearch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int i, val, start = 0, end = 9, mid, flag = 0;
        System.out.println("Enter the value to be searched");
        val = sc.nextInt();

        while (start <= end) {
            mid = (start + end) / 2;
            if (val > a[mid]) {
                start = mid + 1;
            }
            if (val < a[mid]) {
                end = mid - 1;
            }
            if (val == a[mid]) {
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
