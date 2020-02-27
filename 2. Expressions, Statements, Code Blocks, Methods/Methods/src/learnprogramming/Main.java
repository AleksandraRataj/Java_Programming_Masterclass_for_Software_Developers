package learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);

        calculateScore(true, 10000, 8, 200);

        int highScore = calculateScoreInteger(gameOver, score, levelCompleted, bonus);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Monica", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Chandler", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Rachel", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Joey", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Phoebe", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Ross", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Ben", highScorePosition);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

    }

    public static int calculateScoreInteger(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }

    //Challenge

    public static void displayHighScorePosition(String name, int position) {
        System.out.println("Player " + name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {

//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }
}
