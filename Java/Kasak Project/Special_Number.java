import java.util.Scanner;

/**
 * Special_Number
 */
public class Special_Number {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int num, i, fact = 1, sum = 0, temp, ld;
        System.out.println("Enter a number");
        num = sc.nextInt();
        temp = num;
        while (temp != 0) {
            ld = temp % 10;
            fact = 1;
            for (i = ld; i >= 1; i--) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if (num == sum) {
            System.out.println("Special Number");
        } else {
            System.out.println("Not a special numbers");
        }
    }
}