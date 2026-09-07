package day02;

public class MethodChallenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Aviral", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Ayush", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Atharv", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Hitesh", highScorePosition);

        highScorePosition = calculateHighScorePosition(29);
        displayHighScorePosition("Hardik", highScorePosition);
    }
    public static void displayHighScorePosition(String playerName, int highScorePLayerPostion){
        System.out.println(playerName + " managed to get into position " + highScorePLayerPostion +
                " on tht high score list");

    }
    public static int calculateHighScorePosition (int playerScore){
        int position = 4;
        if(playerScore >= 1000){
            position = 1;
        }else if(playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
