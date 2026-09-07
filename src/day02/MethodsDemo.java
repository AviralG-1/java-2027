package day02;

import java.sql.SQLOutput;

public class MethodsDemo {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        int highScore = calculateScore(true, 800, 5,100);
        System.out.println("The first highscore is : " +highScore);
        System.out.println("The second highscore is :" +
                calculateScore(true, 10000, 8, 200));
     }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if(gameOver){
            finalScore = finalScore + (levelCompleted * bonus);
            finalScore = finalScore + 1000;
        }
        return finalScore;
    }
}
