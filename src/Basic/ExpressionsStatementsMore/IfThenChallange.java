package Basic.ExpressionsStatementsMore;

public class IfThenChallange {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 100;
        int levelCompleted = 5;
        int bonus = 50;
        int finalScore = score;

        calculateScore(true, score, levelCompleted, bonus, finalScore);
        System.out.println("A játék végi pontszámod: "+ calculateScoreReturn(true, score, levelCompleted, bonus, finalScore));

    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus, int finalScore){
        if( gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("A játék végi pontszámod: "+ finalScore);
        }
    }

    public static int calculateScoreReturn(boolean gameOver, int score, int levelCompleted, int bonus, int finalScore){
        if(gameOver){
            finalScore += (levelCompleted * bonus);
        }
        return  finalScore;
    }
}
