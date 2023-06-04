package Basic.ExpressionsStatementsMore;

public class MethodChallange {
    public static void displayHightScore(String playerName, int highScore){
        System.out.println(playerName + " nevű játékos helyezése -> "+ highScore);
    }

    public static int calculateHighScorePos(int playerScore){
        if(playerScore >= 1000){
            return 1;
        } else if( playerScore >=500 && playerScore < 1000){
            return 2;
        } else if( playerScore >= 100 && playerScore < 500){
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args){
            int highScorePos = calculateHighScorePos(1500);
            displayHightScore("Robert", highScorePos);

            int number = 5;
            checkNumber(number);
    }

    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        } else if( number < 0){
            System.out.println("negative");
        } else if(number == 0) {
            System.out.println("zero");
        }
    }
}
