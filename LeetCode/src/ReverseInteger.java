/*
 * Exercise: https://leetcode.com/problems/reverse-integer
 * Author: Oliver McPheely
 * Date: 11/05/2018
 * Github: https://github.com/Pheels
 */

import java.util.ArrayList;

public class ReverseInteger {
	public static void run(int[] inputs){
		for (int i = 0; i < inputs.length; i ++){
			int result = reverseInt(inputs[i]);
			System.out.println(result);
		}
	}
	
	private static int reverseInt(int input){
		ArrayList<Integer> reversedInt = new ArrayList<Integer>();
		Boolean negative = false;
		if (input < 0){
			//flag negative, create positive version
			negative = true;
			input = input + 2*(-input);
		}
		while (input > 0) {
			reversedInt.add(input % 10);
			input = input/10;
			
		}
		String result = "";
		for (int x = 0; x < reversedInt.size(); x++){
			result += String.valueOf(reversedInt.get(x));
			
		}
		
		int solution = Integer.parseInt(result.replaceAll("\"",""));
		if (negative == true){
			solution =(solution + (-solution*2));
		}
		return solution;
	}
}
