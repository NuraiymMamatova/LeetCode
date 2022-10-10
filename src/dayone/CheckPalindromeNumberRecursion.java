package dayone;
class Solution {
    public boolean isPalindrome(int x) {
        int n = x;

        if (isPalindromme(n)) {
            return true;
        }
        else {
            return false;
        }
    } public static boolean isPalindromme(int num) {
        int n = num;

        int rev = 0;

        while (n > 0)
        {
            int r = n % 10;

            rev = rev * 10 + r;

            n = n / 10;
        }

        return (num == rev);
    }



}