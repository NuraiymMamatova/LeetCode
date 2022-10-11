package daysecond;

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] numbers = {in.nextInt(), in.nextInt(), in.nextInt()};
    System.out.println(Arrays.toString(twoSum(numbers, in.nextInt())));
    }
    public static int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++)
                for (int j = i + 1; j < nums.length; j++)
                    if (nums[j] == target - nums[i])
                        return new int[] {i,j};
            return null;

        }

    }
