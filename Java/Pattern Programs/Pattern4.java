/**
 * 54321
 * 5432
 * 543
 * 54
 * 5
 */
public class Pattern4 {

    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            int a = 5;
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                a--;
            }
            System.out.println();
        }
    }
}