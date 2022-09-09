public class Vowels {
    public static void main(String[] args) {
        String str = "computer";
        String str2 = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                str2 = str2 + (char) (ch + 1);
            else
                str2 = str2 + ch;
        }
        System.out.println(str2);
    }
}
