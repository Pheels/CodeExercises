package codingbat;

/***
 Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".


 allStar("hello") → "h*e*l*l*o"
 allStar("abc") → "a*b*c"
 allStar("ab") → "a*b"
 */

public class AllStar {
    public static String run(String str) {
        System.out.println(str);
        if (str.length() <= 1) return str;
        return str.charAt(0) + "*" + run(str.substring(1));
    }

}
