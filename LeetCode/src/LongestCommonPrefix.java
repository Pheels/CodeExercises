/* 
* Exercise: https://leetcode.com/problems/longest-common-prefix 
* Author: Oliver McPheely 
* Date: 15/05/2018 
* Github: https://github.com/Pheels 
*/ 

public class LongestPrefix {
	public static void main(String[] args) {
		String[] in ={
			"flower",
			"flow",
			"flight"
		};
		String prefix = longestCommonPrefix( in );
		System.out.println(prefix);
	}

	public static String longestCommonPrefix(String[] args) {
		String match = new String();
		String firstWord = args[1];
		for (int i = 1; i < args.length; i++) {
			char[] chars = args[i].toCharArray();
			int index = 0;
			for (char c: args[i].toCharArray()) {
				if (firstword.toCharArray()[index] == c) {
					index++;
					match += c;
				} else {
					match = match.substring(0, index);
				}
			}
			if (match.length() > 0) P
			return match;
		} else {
			return "No Common Prefix";
		}
	}
}
