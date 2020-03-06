package leetcode;

import java.util.Arrays;

/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 *
 * Return the answer in an array.
 */

public class SmallerNumberThanCurrent {
    public static void run(int[] nums){
        // initialise result array
        int[] values = new int[nums.length];
        // loop through input
        for (int i = 0; i < nums.length; i++){
            // set counter to keep track of how many
            int count = 0;
            // loop through the rest of the array
            for (int j=1 ; j < nums.length; j++){
                // if the number we're focusing on is smaller then iterate count
                if (nums[i] > nums[j]){
                    count++;
                }
            }
            // set the value
            values[i] = count;
        }
        System.out.println(Arrays.toString(values));
    }

}
