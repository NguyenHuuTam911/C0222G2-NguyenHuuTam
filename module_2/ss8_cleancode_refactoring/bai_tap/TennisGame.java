package ss8_cleancode_refactoring.bai_tap;

public class TennisGame {


    public static final int WIN_CHANGE = 4;

    public static String getScore(String playerFirstName, String playerSecondName, int scoreOne, int scoreTwo) {
        String score = "";
        int tempScore = 0;


        if (scoreOne == scoreTwo) {
            switch (scoreOne) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;


            }
        } else if (scoreOne >= WIN_CHANGE || scoreTwo >= WIN_CHANGE) {
            int minusResult = scoreOne - scoreTwo;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scoreOne;
                else {
                    score =score+ "-";
                    tempScore = scoreTwo;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
