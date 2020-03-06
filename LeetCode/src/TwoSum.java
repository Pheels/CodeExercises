/*
 * Exercise: https://leetcode.com/problems/two-sum
 * Author: Oliver McPheely
 * Date: 11/05/2018
 * Github: https://github.com/Pheels
 */

public class TwoSum {
	public static void run(int[] nums, int target){
		int[] solution = twoSum(nums, target);
		if (solution != null){
			for (int i = 0; i < solution.length; i++){
				System.out.println(solution[i]);
			}
		} else {
			System.out.println("Unable to find two numbers that add up to " + target);
		}
	}
	
    public static int[] twoSum(int[] nums, int target) {
    	for (int i = 0; i < nums.length; i++){
    		for (int x = 0; x < nums.length; x++){
    			if (nums[i] + nums[x] == target){
    				int[] results = {nums[i], nums[x]};
    				return results;
    			}
    		}
    	}
        return null;
    }
}
