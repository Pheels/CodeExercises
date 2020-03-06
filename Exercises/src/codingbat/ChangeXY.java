package codingbat;

/***
 *
 Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
 changeXY("codex") → "codey"
 */

public class ChangeXY {
    public static String run(String str) {
        if (str.length() <= 0) return str;
        if (String.valueOf(str.charAt(0)).equals("x")){
            return "y" + run(str.substring(1));
        }
        return str.charAt(0) + run(str.substring(1));
    }

}
