package codingbat;

/***
 *
 Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
 */

public class CountAbc {
    public static int run(String str) {
        if (str.length() == 1) return 0;
        if (String.valueOf(str.charAt(0)).equals("a") && String.valueOf(str.charAt(1)).equals("b")
                && (String.valueOf(str.charAt(2)).equals("c") || String.valueOf(str.charAt(2)).equals("a"))){
             return 1 + run(str.substring(1));
        } else {
            return run(str.substring(1));
        }
    }

}
