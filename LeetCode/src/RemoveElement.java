/* 
* Exercise: https://leetcode.com/problems/remove-element/description/ 
* Author: Oliver McPheely 
* Date: 17/05/2018 
* Github: https://github.com/Pheels 
*/ 

public class RemoveElement {
    public static void run(int[] input){
        int length = removeElement(input, 2);
        System.out.println(length);
    }
    
    public static int removeElement(int[] nums, int val) {
        int length = 0;
        for (int i = 0; i < nums.length; i++){
            // if value matched, move on
            if (nums[i] == val) {
                continue;
            } else {
                // else add non value to internal list and increment pointer
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}
