public class PalindromeOrNot {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one string as an argument.");
            return;
        }

        String input = args[0];
        if (isPalindrome(input)) {
            System.out.println("'" + input + "' is a palindrome.");
        } else {
            System.out.println("'" + input + "' is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
