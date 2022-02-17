import java.util.Scanner;

/**
 * Q21
 */
public class Q21 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name[] = new String[5];
        int marks[][] = new int[5][5];
        String n;
        int i, j, k = 1, sum = 0, flag = 0;
        for (i = 0; i < 5; i++) {

            System.out.println("Enter the name of students");
            name[i] = sc.next();
            for (j = 0; j < 5; j++) {
                System.out.println("Enter marks of " + k + " subject");
                marks[i][j] = sc.nextInt();
                k++;
            }
            k = 1;
        }
        for (i = 0; i < 5; i++) {
            System.out.println(name[i]);
            for (j = 0; j < 5; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Enter the student name");
        n = sc.next();
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                if (n.equalsIgnoreCase(name[i])) {
                    flag = 1;
                    sum += marks[i][j];
                }
            }
        }
        if (flag == 1) {
            System.out.println("Total Marks = " + sum);
        } else {
            System.out.println("Name does not exist");
        }
    }
}