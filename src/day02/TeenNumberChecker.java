package day02;

public class TeenNumberChecker {
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree){
        return isTeen(ageOne) || isTeen(ageTwo) || isTeen(ageThree);
    }
    public static boolean isTeen(int age){
        return age >=13 && age <= 19;
    }

    public static void main(String[] args) {
        boolean test1 = hasTeen(9,19,99);
        System.out.println("The result Test 1 = " + test1);

        boolean test2 = hasTeen(23, 15,42);
        System.out.println("The result Test 2 = " + test2);

        boolean test3 = hasTeen(22,23,24);
        System.out.println("The result Test 3 = " + test3);

        boolean test4 = isTeen(15);
        System.out.println("is 15 teen ? = " + test4);

        boolean test5 = isTeen(12);
        System.out.println("is 12 teen ? = " + test5);
    }
}
