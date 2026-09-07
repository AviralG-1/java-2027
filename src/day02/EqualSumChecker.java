package day02;

public class EqualSumChecker {
    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue){
        return (firstValue + secondValue) == thirdValue;
    }

    public static void main(String[] args) {
        boolean test1 = hasEqualSum(1,1,1);
        System.out.println("Test 1 result is = " + test1);

        boolean test2 = hasEqualSum(1,1,2);
        System.out.println("Test 2 result is = " + test2);

        boolean test3 = hasEqualSum(1,-1,0);
        System.out.println("Test 3 result is = " + test3);
    }
}
