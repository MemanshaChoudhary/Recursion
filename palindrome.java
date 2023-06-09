public class palindrome {
    static String isPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }

        char frst = s.charAt(0);

        return isPalindrome(s.substring(1)) + frst;

    }

    public static void main(String[] args) {
        String s1 = "nitin";
        String s = isPalindrome(s1);
        if (s.equals(s1)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
