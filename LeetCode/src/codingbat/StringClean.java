package codingbat;

/**
 *
 Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char.
 So "yyzzza" yields "yza"
 */

public class StringClean {
    public static String run(String str) {
        if (str.length() <= 1) return str;
        if (str.charAt(0) == str.charAt(1)) return run(str.substring(1));
        return str.charAt(0) + run(str.substring(1));
    }

}
