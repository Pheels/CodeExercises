/*
 * Exercise: https://leetcode.com/problems/fizz-buzz
 * Author: Oliver McPheely
 * Date: 14/05/2018
 * Github: https://github.com/Pheels
 */

public class FizzBuzz {
	public static void main(String[] args){
		for (int i =0; i < 101; i++){
			if (i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			}	else if (i % 3 ==0){
				System.out.println("Fizz");
			}	else if (i % 5 ==0){
				System.out.println("Buzz");
			}	else {
				System.out.println(i);
			}
			
		}
	}
	
}
