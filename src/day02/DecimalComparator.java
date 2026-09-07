package day02;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numberOne, double numberTwo){
        int numberOneConverted =(int) (numberOne * 1000);
        int numberTwoCOnverted = (int)(numberTwo * 1000);
        return numberOneConverted == numberTwoCOnverted;
    }

    public static void main(String[] args) {
        boolean test1 = areEqualByThreeDecimalPlaces(-3.1756 , -3.175);
        System.out.println("Test 1 result = " + test1);

        boolean test2 = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println("Test 2 result = " + test2);

        boolean test3 = areEqualByThreeDecimalPlaces(3.0,3.0);
        System.out.println("Test 3 result = " +test3);
    }
}
