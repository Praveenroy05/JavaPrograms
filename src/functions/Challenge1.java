package functions;

public class Challenge1 {


    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " Managed to get into position " + position + " on the high  score table");

//        String result= name+ "Managed to get into position" + position + "on the high top score ";
//
//        return result;

    }


    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }


    public static int calculateHighScorePosition2(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            position = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            position = 3;
        }
        return position;

    }

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(2000);
        displayHighScorePosition("Praveen", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("Cook", highScorePosition);

        highScorePosition = calculateHighScorePosition(300);
        displayHighScorePosition("Raj", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Mic", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Angel", highScorePosition);

        System.out.println("***********************************************************************");

        int highScorePosition1 = calculateHighScorePosition2(2000);
        displayHighScorePosition("Praveen", highScorePosition1);

        highScorePosition1 = calculateHighScorePosition2(1000);
        displayHighScorePosition("Tim", highScorePosition1);

        highScorePosition1 = calculateHighScorePosition2(800);
        displayHighScorePosition("Cook", highScorePosition1);

        highScorePosition1 = calculateHighScorePosition2(300);
        displayHighScorePosition("Raj", highScorePosition1);

        highScorePosition1 = calculateHighScorePosition2(50);
        displayHighScorePosition("Mic", highScorePosition1);

        highScorePosition1 = calculateHighScorePosition2(100);
        displayHighScorePosition("Angel", highScorePosition1);
    }

}
