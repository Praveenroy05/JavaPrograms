package Programs;

public class LongestPalindrome {

    public static void main(String[] args) {
        String input = "bababcdababababad";
        System.out.println("Longest palindrome substring is: " + findLongestPalindrome(input));
    }

    public static String findLongestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, maxLength = 1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j)) {
                    if (j - i + 1 > maxLength) {
                        start = i;
                        maxLength = j - i + 1;
                    }
                }
            }
        }

        return s.substring(start, start + maxLength);
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}

