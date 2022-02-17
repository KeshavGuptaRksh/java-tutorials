import java.util.Scanner;

public class Magic_Number {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num, sum = 0, ld, temp;
        System.out.println("Enter a number");
        num = sc.nextInt();
        while (num > 9) {
            temp = num;
            while (temp > 0) {
                ld = temp % 10;
                sum = sum + ld;
                temp /= 10;
            }
            num = sum;
            sum = 0;
        }
        if (num == 1) {
            System.out.println("It is a magic number");
        } else {
            System.out.println("It is not a magic number");
        }
    }
}
