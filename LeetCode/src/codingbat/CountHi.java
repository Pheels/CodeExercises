package codingbat;
/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
 */

public class CountHi {
    public static int run(String str) {
        if (str.length() <= 1) return 0;

        if (String.valueOf(str.charAt(0)).equals("h") && String.valueOf(str.charAt(1)).equals("i")){
            return run(str.substring(1)) + 1;
        } else {
            return run(str.substring(1));
        }
    }

}
