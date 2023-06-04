package Basic.ExpressionsStatementsMore;

public class ExpressionsStatementsMore {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);
        int highScore = 50;

        if(highScore > 25){
            highScore += 1000;
        }
        int health = 100;
        if((health < 25 ) && (highScore > 1000)){
            highScore -= 1000;
        }

        ///STATEMENTS, WHITESPACES AND IDENTATION

        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test!");
        System.out.println("This is " +
                "another " +
                "still more.");


        /// CODEBLOCKS, IF-ELSE CONTROL STATEMENT

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 10;

        if(score < 5000 && score > 1000) {
            System.out.println("A pontszámod kevesebb mint 5000 de nagyobb mint 1000");
        } else if(score < 1000){
            System.out.println("A pontszámod kevesebb mint 1000");
        } else {
            System.out.println("A pontszámod jobb mint 5000");
        }

    }
}