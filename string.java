class PalindeomeCheck{
    public static boolean isPalindrome(String str) {
        int left=0,right=str.length() -1;

        while(left<right) {
            if(str.charAt(left) !=str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static boolean isPalindromeReverse(String str) {
        String reverse=new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
    public static void main(String[] args) {
        String[] testCases={"madam","racecar","noon","hello","java"};

        System.out.println("=== Palindrome Check ===");
        for(String test : testCases) {
            System.out.println(test + " is a palindrome: " + isPalindrome(test));
        }
    }
}