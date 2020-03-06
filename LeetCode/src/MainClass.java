public class MainClass {
  public static void main (String[] args){
//    runLongestCommonPrefix();
//    runBacktrackCombinationSum();
//    DivideTwoIntegers.run(7, -3);
//    FizzBuzz.run();
//    RemoveDuplicatesFromSortedArray.run(new int[]{0,0,1,1,1,1,2,2,2,3,3,4,5});
//    RemoveElement.run(new int[]{0,1,2,2,3,0,4,2});
//    ReverseInteger.run(new int[]{123, -123, 120});
//    TwoSum.run(new int[]{2, 7, 11, 15}, 9);

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

