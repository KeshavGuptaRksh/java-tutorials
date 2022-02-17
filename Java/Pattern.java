/**
 * Pattern
 */
public class Pattern {

    public static void main(String[] args) {
        String str = "ABCDE";
        int i, j;
        for (i = str.length(); i >= 0; i = i - 2) {
            for (j = 0; j <= i - 1; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}