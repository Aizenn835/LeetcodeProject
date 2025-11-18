package SolvingSimpleMathProblem101;

public class CountEvenArrays {
     public static int function(int[] arr){
          int sum = 0;
          for(int i = 0; i < arr.length; i++){
               if(arr[i] % 2 == 0){
                    ++sum;
               }
          }
          return sum;
     }
     public static void main() {
         int[] arr = {1 , 2 , 3 , 4 , 5 , 6 ,7 , 8,  9 , 10};
         int result = function(arr);

         System.out.println("Even numbers: " + result);
     }
}
