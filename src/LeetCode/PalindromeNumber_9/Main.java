package LeetCode.PalindromeNumber_9;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234));
    }

    public static boolean isPalindrome(int x) {

        // x = 1234
        // y = 4321


        int temp = x;
        int remainder = 0;
        int reversed = 0;




        while (temp > 0) {
            remainder = temp % 10;
            reversed = (reversed * 10) + remainder;
            temp /= 10; // reversed = 123
        }
        if (reversed != x) {
            return false;
        }
        return true;
    }


}
