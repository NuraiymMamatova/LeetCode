package dayone;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindromme(in.nextInt()));
    }
    public boolean isPalindrome(int x) {
        int number = x;
        if (isPalindromme(number)) {
            return true;
        }
        else {
            return false;
        }
    } public static boolean isPalindromme(int number) {
        int number1 = number;
        int number2 = 0;
        while (number1 > 0) {
            int r = number1 % 10;
            number2 = number2 * 10 + r;
            number1 = number1 / 10;
        }

        return (number == number2);
    }



}