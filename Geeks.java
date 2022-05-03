public class Geeks {

    int digts[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    String text[] = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };

    int arr[] = { 2, 4, 6, 5 };

    int findindex() {
        int vowels = 0;
        for (int i = 0; i < arr.length; i++) {
            String word;
            for (int j = 0; j < digts.length; j++) {
                if (arr[i] == digts[j]) {
                    word = text[j];
                    vowels += count_Vowels(word);
                }
            }
        }
        return vowels;
    }

    int count_Vowels(String w) {
        int count = 0;
        char ch;
        for (int i = 0; i < w.length(); i++) {
            ch = w.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    int sumFunc(int s) {
        int combo = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == s) {
                    combo++;
                }
            }
        }
        return combo;
    }

    public static void main(String[] args) {
        int v;
        Geeks ob = new Geeks();
        v = ob.findindex();
        System.out.println("Total Vowels: " + v);
        System.out.println("Total subsets: " + ob.sumFunc(v));

    }
}
