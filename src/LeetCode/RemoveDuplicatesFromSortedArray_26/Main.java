package LeetCode.RemoveDuplicatesFromSortedArray_26;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        /*int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);*/


        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = new int[removeDuplicates(nums)];

        int x = removeDuplicates(nums); // Calls your implementation

        assert x == expectedNums.length;
        for (int i = 0; i < x; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    public static int removeDuplicates(int[] nums) {

        ArrayList arrayList = new ArrayList();
        Arrays.sort(nums);

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            if (!arrayList.contains(nums[i])) {
                arrayList.add(nums[i]);
            } else {
                counter++;
            }
        }
        int k = arrayList.size();

        for (int i = 0; i < counter; i++) {
            arrayList.add("_ ");
        }

        /*System.out.print(k + ",");
        System.out.println(" nums = " + arrayList);*/
        return k;
    }



}
