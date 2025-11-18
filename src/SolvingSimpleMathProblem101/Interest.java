package SolvingSimpleMathProblem101;

public class Interest {
    public static double getInterest(double principal , double rate){
            double formula = principal * (rate / 100);
            double get = principal + formula;
             return get;
    }

    static void main() {

         double result = getInterest(1000 , 5);
        System.out.println("Interest in 1 year: " + result);

    }
}
