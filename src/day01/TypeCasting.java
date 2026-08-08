package day01;

public class TypeCasting {
//    public static void main () {
//        short myMinShortValue = Short.MIN_VALUE;  int myMinIntValue = Integer.MIN_VALUE;
//        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
//
//        System.out.println(" Minimum Short Value = " + myMinShortValue);
//        System.out.println(" Minimum Integer Value = " + myMinIntValue);
//        System.out.println(" Minimum Byte Value = " + myMinByteValue);
//        System.out.println(" Maximum Byte Value = " + myMaxByteValue);
//
//        int myIntTotal = (myMinIntValue /2);
//        System.out.println(myIntTotal);
//
//        byte myNewByteValue = (byte) (myMinByteValue / 2);
//        System.out.println(myNewByteValue);
//
//        short myNewShortValue = (short) (myMinShortValue / 2);
//        System.out.println(myNewShortValue);
//    }
//    CHALLENGE TIME Lecture 20
//    public static void main (){
//        byte myValidByteValue = 120;
//        short myValidShortValue = 30_000;
//        int myValidIntegerValue = 10_00_00_000;
//
//        long myLongTotal = (50_000L + (10L * (myValidByteValue + myValidIntegerValue + myValidShortValue)));
//
//        System.out.println("My Byte Value : " + myValidByteValue);
//        System.out.println("My Short Value : " + myValidShortValue);
//        System.out.println("My Integer  Value : " + myValidIntegerValue);
//        System.out.println("The total after calculation is : " + myLongTotal);
//
//    }
//}

//  Lecture 21
//public static void main (){
//    System.out.println("The Float Range = " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
//    System.out.println("The Double Range = " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
//     double availableWeightInPounds = 200.00 ;
//     double sameWeightInKg = availableWeightInPounds * 0.45359237;
//     System.out.println(availableWeightInPounds + " pounds" + " when converted into KiloGrams is : " + sameWeightInKg+" Kg");
//
//}
    // CHAR AND BOOLEAN
    public static void main(){
        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDeciamlChar = 63;

        System.out.println("My Values are : " +mySimpleChar+ " for simple char , " + myUnicodeChar + " for unicode , " + myDeciamlChar + " for decimal char");
    }

}
