package SolvingSimpleMathProblem101;

public class GetDiscount {
     static double discount(double price , double ActualDiscount){
           double DiscountFormula = price * (ActualDiscount / 100);
           double get = price - DiscountFormula;

           return get;
     }
    static void main(String[] args) {

          double result = discount(500 ,  10);

        System.out.println("The discount is: " + result );

    }
}
