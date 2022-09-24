package LeetCode.SearchInsertPosition_35;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};


        System.out.println(searchInsert(nums, 2));
    }



    public static int searchInsert(int[] nums, int target) {
        Arrays.sort(nums);
        int counter = 0;

        while (target > nums[counter]) {
            counter++;
            if (counter == nums.length) {
                break;
            }
        }
        return counter;
    }
}
