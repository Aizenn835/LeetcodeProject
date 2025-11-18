package SolvingSimpleMathProblem101;

public class Maximum {

     public static int findMaximum(int[]arr ){
         int max = arr[0];
          for(int i = 0; i < arr.length; i++){
               if(arr[i] > max){
                    max = arr[i];
               }
          }
          return max;
     }
    static void main() {
        int[] arr =  {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
        int result = findMaximum(arr);

        System.out.println("Maximum number in array: " + result);
    }
}
