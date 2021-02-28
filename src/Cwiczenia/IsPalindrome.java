package Cwiczenia;

public class IsPalindrome {

    public static void main(String[] args) {

        String word = "morze";
        System.out.println(isPalindrome(word));

    }

    public static boolean isPalindrome(String word) {

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;

    }
}
