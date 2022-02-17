import java.util.Scanner;
import java.util.StringTokenizer;

public class Ques_15 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Ques_15 ob = new Ques_15();
        String str, str2 = "";
        char ch;
        int c = 0, v = 0;
        System.out.println("Enter the text");
        str = sc.nextLine();
        System.out.println("Word\tVowel\tConsonants");
        StringTokenizer st = new StringTokenizer(str, " ");
        while (st.hasMoreTokens()) {
            str2 = st.nextToken();
            ch = str2.charAt(0);
            str2 = Character.toUpperCase(ch) + str2.substring(1, str2.length());
            v = ob.countvowels(str2);
            c = str2.length() - v;
            ob.display(str2, v, c);
        }

    }

    public int countvowels(String txt) {
        txt = txt.toLowerCase();
        int vowel = 0;

        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            if (c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'i')
                vowel++;
        }
        return vowel;
    }

    void display(String s, int vo, int co) {

        System.out.println(s + "\t" + vo + "\t" + co);
    }

}
