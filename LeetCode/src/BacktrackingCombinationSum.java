
/*
 * Exercise: https://leetcode.com/problems/combination-sum/
 * Author: Oliver McPheely
 * Date: 17/05/2018
 * Github: https://github.com/Pheels
 */

import java.util.*;

public class CombinationSum {
    public static void main(String args[]) {
        int[] candidates = {2,3,5};
        int target = 8;
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        backTrackSearch(result, new ArrayList<Integer>(), candidates, target, 0);
        for (List<Integer> res : result){
            System.out.println(res);
        }
    }
    
    private static void backTrackSearch(List<List<Integer>> result, List<Integer> currentList, int candidates[], int target, int pointer){
    	if(target > 0){
    	    // for elements in shrinking array
    		for(int i = pointer; i < candidates.length; i++){
    		    if (target >= candidates[i]){
        		    // add the current candidate to the current list
        			currentList.add(candidates[i]);
        			// recursively call this method until target is equal to or smaller than 0
        			backTrackSearch(result, currentList, candidates, target - candidates[i], i);
        			//System.out.println("current list:" + currentList+  " target: " + target);
        			// remove last element of the list if previous call comes back with nothing (indicates value is under 0).
        			currentList.remove(currentList.size() - 1);
    		    }
    		}
    	}
    	else if(target == 0 ){
    		result.add(new ArrayList<Integer>(currentList));
    	}
    }
}
