package leetcode;
/*
 * Exercise: https://leetcode.com/problems/divide-two-integers/
 * Author: Oliver McPheely
 * Date: 17/05/2018
 * Github: https://github.com/Pheels
 */

public class DivideTwoIntegers {
    public static void run(int dividend, int divisor){
        int length = divideTwoIntegers(dividend, divisor);
        System.out.println(length);
    }
    
    public static int divideTwoIntegers(int dividend, int divisor) {
        boolean negative = false;
        // cater for instance where one value is negative without importing packages
        if (((dividend > 0 && divisor < 0)) || ((dividend < 0 && divisor > 0))){
            negative = true;
            if (dividend < 0){
                dividend = flipSign(dividend);
            } else {
                divisor = flipSign(divisor);
            }
        }
        
        // keep subtracting until dividend smaller than divisor 
        int quotient = 0;
        while (dividend > divisor){
            dividend -= divisor;
            quotient++;
        }
        
        // apply negative sign
        if (negative == true){
            quotient = flipSign(quotient);
        }
        return quotient;
    }   
    
    public static int flipSign(int value){
        return (value - (2*value));
    }
}
