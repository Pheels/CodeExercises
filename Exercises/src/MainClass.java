import codingbat.CountX;
import codingbat.Fibonacci;
import interviewio.MostCommonInteger;
import leetcode.recursion.BacktrackingCombinationSum;

public class MainClass {
  public static void main (String[] args){
    runLeetCodeExercises();
//    runCodingBatExercises();
//    runInterviewIoExercises();

  }

  private static void runInterviewIoExercises() {
    System.out.println(MostCommonInteger.run(new int[]{0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5,0,0,11,1,11,1,11,2,3,3,4,5}));
  }

  private static void runCodingBatExercises(){
//    System.out.println(Factorial.run(6));
//    System.out.println(Array11.run(new int[]{0,0,11,1,11,1,2,2,2,3,3,4,5}, 0));
    System.out.println(Fibonacci.run(300));
//    System.out.println(AllStar.run("RandomString"));
//    System.out.println(PairStair.run("Hello"));
//    System.out.println(CountHi.run("Hello hi hi hi Hello"));
//    System.out.println(StringClean.run("yyzzza"));
//    System.out.println(Array220.run( new int[]{0,2, 20, 84, 220}, 0));
//    System.out.println(PowerN.run(3, 3));
//    System.out.println(ChangeXY.run("helloxhelloxhellox"));
//    System.out.println(SumDigits.run(126));
//    System.out.println(CountAbc.run("helloabcabahello"));
//    System.out.println(CountX.run("xxhihixxxhixx"));
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

//    LongestCommonPrefix.run(in);
  }

  public static void runBacktrackCombinationSum(){
    int[] candidates = {2,3,5};
    int target = 8;
    BacktrackingCombinationSum.run(candidates, target);
  }
}

