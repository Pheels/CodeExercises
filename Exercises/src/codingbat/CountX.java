package codingbat;

public class CountX {
    public static int run(String str) {
        if (str.length() == 0) return 0;
        if (String.valueOf(str.charAt(0)).equals("x")) {
            return run(str.substring(1)) + 1;
        } else {
        return run(str.substring(1));
     }
    }
}
