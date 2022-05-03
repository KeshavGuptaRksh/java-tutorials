
//import java.util.Scanner;
import java.util.StringTokenizer;

public class Q15 {
    // static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String txt = "NECESSITY IS THE MOTHER OF INVENTION.";
        int len;
        // txt = sc.nextLine();
        StringTokenizer st = new StringTokenizer(txt, " .!?");
        len = st.countTokens();
        String words[] = new String[len];
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            words[i] = st.nextToken();
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
