package day02;
import java.util.Scanner;
public class OperatorPrecedence {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Value for Step One is :");
        double stepOne = sc.nextDouble();

        System.out.print("Value for Step Two is :");
        double stepTwo = sc.nextDouble();

         double stepThree = (stepOne + stepTwo) * 100.00;
        System.out.println("The final value after step three is : " + stepThree);

         double stepFour = stepThree % 40.00d;
         System.out.println("The Remainder is : " + stepFour);

         boolean stepFive = stepFour == 0.00;
         System.out.println("The output of Step Three is " + stepFour + " which is " + stepFive );

         if(!stepFive){
             System.out.println("Got some remainder which is " + stepFour);
         }
    }
}
