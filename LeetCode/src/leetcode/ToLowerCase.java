package leetcode;

import java.util.HashMap;

public class ToLowerCase {
    public static void run(String s){
        // create hashmap documenting the alphabet
        HashMap<String, String> alphabet = new HashMap<String,String>();
        // add values with the capital as the key
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            alphabet.put(String.valueOf(ch), String.valueOf(ch).toLowerCase());
        }

        // split the string into characters
        char[] strSplit = s.toCharArray();
        // string buffer to store the result
        StringBuffer result = new StringBuffer();

        // loop through chars
        for (int i=0; i < strSplit.length; i++){
            // check if the char is a key in the hashmap, add it to the result if so
            if(alphabet.containsKey(String.valueOf(strSplit[i]))){
                result.append(alphabet.get(String.valueOf(strSplit[i])));
            } else {
                // if char not in hashmap, add it to the result
                result.append(strSplit[i]);
            }
        }
        System.out.println(result.toString());
    }
}
