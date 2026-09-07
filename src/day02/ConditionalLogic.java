package day02;

public class ConditionalLogic {
//    public static void main(String [] args){
//        System.out.println("Hello Mr. Failure");
//
//        boolean isAviralWorthy = false;
//        if(isAviralWorthy == false) {
//            System.out.println("No,  He is not");
//        }
//        int myScore = 99 ;
//        int mySecondScore = 81;
//        if(myScore >= 100) {
//            System.out.println("Nah, Aviral you can't achieve that");
//        }
//
//        if((myScore > mySecondScore) && (myScore < 100)){
//                System.out.println("You are slightly above average");
//        }
//
//        if((myScore > 90) || (mySecondScore <= 90)){
//            System.out.println("Still Can't do it ");
//        }
//    }

    public static void main(String[] args){
        boolean isCar = false;
        if(!isCar){     // Here is anything is not written with isCar that
                     //indirectly means that Java will check for isCar == true the exclamation mark will
                     // automatically check for isCar is not true //
            System.out.println("That will work");
        }
    }
}
