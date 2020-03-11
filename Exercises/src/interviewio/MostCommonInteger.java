package interviewio;

import java.util.HashMap;

/***
 * (1,2,3,3,3,4) -> = 3
 * (1,4,2,2,3,7) -> = 2
 */

/***
 * A more efficient way is to sort the array and then loop it once, keeping the most common value and the count.
 */
public class MostCommonInteger {

    public static Integer run(int[] ints) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for (int y : ints) {
            if (hmap.containsKey(y)) {
                int count = hmap.get(y);
                count++;
                hmap.put(y, count);

            } else {
                hmap.put(y, 1);
            }
        }

        int mostCommon = 0;
        int count = 0;
        for (HashMap.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                mostCommon = entry.getKey();
            }
        }
        return mostCommon;
    }
}
