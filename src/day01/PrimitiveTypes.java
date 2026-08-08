package day01;

public class PrimitiveTypes {
    public static void main (){
       int MinIntValue = Integer.MIN_VALUE;
        System.out.println(MinIntValue);
        int MaxIntValue = Integer.MAX_VALUE;
        System.out.println(MaxIntValue);

        System.out.println("The minimum number of integer data type is :" + MinIntValue +  " The maximum number of " +
                "the integer data type is : " + MaxIntValue);

        System.out.println("Busted Max Value = " + (MaxIntValue + 1));
        System.out.println("Busted Min Value = " +(MinIntValue - 1));
        System.out.println("Integer max value = " + Integer.MAX_VALUE);

        System.out.println("Integer Value Range is : " + MinIntValue + " to " + MaxIntValue);
        System.out.println("Byte value range : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short value range : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Long value range : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        long myLongValue = 2147483649L ;
        System.out.println (myLongValue);
    }
}
