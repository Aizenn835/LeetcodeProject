package SolvingSimpleMathProblem101;

import java.util.Arrays;

public class ReverseArray {
     public static int[] reverseFunc(int[] arr){
         int a = arr.length;
         int[] b = new int[a];

         for(int i = 0; i < a; i++){
             b[i] = arr[a - i - 1];
         }
         return b;
     }

    static void main() {
        int[] arr = {1 , 2 , 3, 4 , 5 ,6 , 7 ,8 , 9 , 10};
        System.out.println(Arrays.toString(reverseFunc(arr)));
    }
}
