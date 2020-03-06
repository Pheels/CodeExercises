package leetcode;

/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 */


public class CountAndSay {
    public static void run(int n){
        if (n < 1) return;
        if (n == 1) return;
        // create result string buffer as strings are immutable and set to 11 initially.
        StringBuffer result = new StringBuffer("11");

        // loop over each element in the result stringbuffer
        for (int i = 2; i < n; i++){
            // create a temporary stringbuffer that will store the previous value and the current one
            StringBuffer tempString = new StringBuffer();
            // create count element that will keep track of the number of elements in a row
            int count = 1;
            // loop over the current result stringbuffer (11 initially)
            for ( int j = 1; j < result.length(); j++){
                // check if the current value equals the one before
                if(result.charAt(j-1) == result.charAt(j)){
                    // incremement the counter if so
                    count++;
            } else {
                    // other wise add the current counter to the temporary string
                    tempString.append(count);
                    // then add the actual figure
                    tempString.append(result.charAt(j-1));
                    // reset the count
                    count = 1;
                }
            }
            // add the last count to the temporary string
            tempString.append(count);
            // add the last value
            tempString.append(result.charAt(result.length()-1));
            // set the result
            result = tempString;
        }
        System.out.println(result.toString());
    }
}
