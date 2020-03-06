import codingbat.CountHi;
import codingbat.PairStair;
import codingbat.StringClean;
import leetcode.recursion.BacktrackingCombinationSum;
import leetcode.LongestCommonPrefix;

public class MainClass {
  public static void main (String[] args){
    runLeetCodeExercises();
    runOtherExercises();

  }
  private static void runOtherExercises(){
//    System.out.println(Factorial.run(6));
//    System.out.println(Array11.run(new int[]{0,0,11,1,11,1,2,2,2,3,3,4,5}, 0));
//    System.out.println(Fibonacci.run(3));
//    System.out.println(AllStar.run("RandomString"));
//    System.out.println(PairStair.run("Hello"));
//    System.out.println(CountHi.run("Hello hi hi hi Hello"));
    System.out.println(StringClean.run("yyzzza"));

  }

  private static void runLeetCodeExercises() {
    //    runLongestCommonPrefix();
    //    runBacktrackCombinationSum();
    //    LeetCode.DivideTwoIntegers.run(7, -3);
    //    LeetCode.FizzBuzz.run();
    //    LeetCode.RemoveDuplicatesFromSortedArray.run(new int[]{0,0,1,1,1,1,2,2,2,3,3,4,5});
    //    LeetCode.RemoveElement.run(new int[]{0,1,2,2,3,0,4,2});
    //    LeetCode.ReverseInteger.run(new int[]{123, -123, 120});
    //    LeetCode.TwoSum.run(new int[]{2, 7, 11, 15}, 9);
    //    LeetCode.CountAndSay.run(4);
    //    LeetCode.smallerNumberThanCurrent.run(new int[]{8,1,2,2,3});
    //    LeetCode.ToLowerCase.run("LisT oF CapITaLs AnD NON CAps");

  }

  public static void runLongestCommonPrefix(){
    String[] in =  {
            "flower",
            "flow",
            "flight"
    };

    LongestCommonPrefix.run(in);
  }

  public static void runBacktrackCombinationSum(){
    int[] candidates = {2,3,5};
    int target = 8;
    BacktrackingCombinationSum.run(candidates, target);
  }
}

