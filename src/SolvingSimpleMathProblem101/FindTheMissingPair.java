package SolvingSimpleMathProblem101;

import java.util.Arrays;
import java.util.HashMap;

public class FindTheMissingPair {
    public static int[] twoSum(int[]array , int target){

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i <= array.length; i++){
            int need = target - array[i];

            if(map.containsKey(need)){
                return new int[] { map.get(need), i};
            }
            map.put(array[i] , i );
        }
        return new int[]{};
    }

    static void main() {
        int[] arr =  {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        int target = 11;
        String result = Arrays.toString(twoSum(arr , target));


        System.out.println("Missing pair: " +  result);
    }
}
