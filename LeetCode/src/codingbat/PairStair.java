package codingbat;

/***
 * Given a string, compute recursively a new string where identical chars that are adjacent in the original string
 * are separated from each other by a "*".
 *
 * pairStar("hello") → "hel*lo"
 */

public class PairStair {
    public static String run(String str) {
        if (str.length() <= 1) return str;

        if (str.charAt(0) == str.substring(1).charAt(0)) {
            return str.charAt(0) + "*" + run(str.substring(1));
        } else {
            return str.charAt(0) + run(str.substring(1));
        }
    }

}
