package SolvingSimpleMathProblem101;

public class PercentageOfANumber {

     public static double Percentage(double price , double getPercentage){
         double discount = price * (getPercentage / 100);
         double get = price - discount;

         return get;
     }

    static void main() {

          double result = Percentage(450 , 20);
          System.out.println("Percentage: " + result + "%");
    }
}
