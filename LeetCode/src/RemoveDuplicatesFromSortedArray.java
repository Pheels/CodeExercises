
/*
 * Exercise: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Author: Oliver McPheely
 * Date: 17/05/2018
 * Github: https://github.com/Pheels
 */

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] input =  {0,0,1,1,1,1,2,2,2,3,3,4,5};
        int length = removeDuplicates(input);
        System.out.println(length);
    }
    
    public static int removeDuplicates(int[] nums) {
        int length;
        if (nums.length > 0){
            length = 1;
            // iterate from second element
            for (int i = 1; i < nums.length; i++){
                // increment length if element larger than previous one
                if (nums[i] > nums[i-1]){
                    length++;
                }
                // append current element to list of sorted values
                nums[length] = nums[i];
            }
        } else {
            return 0;
        }
        return length;
    }
}
