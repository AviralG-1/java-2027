package day02;
//import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//        System.out.print("enter a age :");
//        int n = sc.nextInt();
        int userAge = 16;
        String ageLimit = userAge >= 18 ? "Adult" : "Minor";
        System.out.println("User is " + userAge + " year's old and he is a " + ageLimit);

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar ==  "Volkswagen";
        System.out.println("The brand of car is " + makeOfCar + " and it is " + isDomestic );

        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }
    }
}
