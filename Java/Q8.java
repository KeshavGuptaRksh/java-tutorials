public class Q8 {
    public static void main(String[] args) {

        String string = "1234";

        if (isPalindrome(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");

        String string2 = "madam";

        if (isPalindrome(string2))
            System.out.println(string2 + " is a palindrome");
        else
            System.out.println(string2 + " is not a palindrome");

    }

    public static boolean isPalindrome(String s) {

        if (s.length() == 0 || s.length() == 1)
            return true;
        if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));

        return false;
    }

}
