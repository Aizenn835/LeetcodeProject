package SolvingSimpleMathProblem101;



public class FindTheAverageNumbers {
     public static double SomMiss(int[] arr){
          double sum = 0;
          for(int i : arr){
               sum+=i;
          }
          return sum / arr.length;
     }

    static void main() {

         int[] arr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};

              double result = SomMiss(arr);
        System.out.println("Result: " + result);
    }
}
