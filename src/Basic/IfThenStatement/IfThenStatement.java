package Basic.IfThenStatement;

public class IfThenStatement {
    public static void main(String[] args) {

        System.out.println("IF-THEN STATEMENT");
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("Nem egy űrlény!");
        }

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("Az érték nem egyenlő 100-al!");
        }

        if (topScore >= 100) {
            System.out.println("A topScore nagyobb vagy egyenlő 100-al!");
        }

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("A második érték nagyobb és kisebb mint 100");
        }

        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("A második érték nagyobb és kisebb mint 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("TESZT");
        }
        int  newValue = 50;
        if( newValue == 50){
            System.out.println("Hiba történt ha csak 1 darab = <- van!");
        }
        boolean isCar = false;
        if(isCar == true){
            System.out.println("Nem támogatott, de lefut és nem kötelező ilyen módszerrel megadni boolean esetén elég a változót megadni!");
        }
        if(isCar != true || !isCar){
            System.out.println("Nem támogatott, de lefut és nem kötelező ilyen módszerrel megadni boolean esetén elég a változót megadni!");
        }

        // conditional ? return true : return false ; --> if(conditional){return true;}else{return false;}
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false :true;
        if(isDomestic){
            System.out.println("Ez Volkswagen!");
        }

        String s = (isDomestic) ? "This is domestic": "This car is not domestic";
        System.out.println(s);


        /*
         * CHALLANGE
         */

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double totalValue = firstValue + secondValue * 100.00d; // --> 8020.0
        System.out.println("totalValue: "+ totalValue);

        double totalValueTwo = (firstValue + secondValue) * 100.00d; // --> 10000.0
        System.out.println("totalValueTwo: "+ totalValueTwo);


        double theRemainder = totalValue % 40.00d;
        System.out.println("theRemainder: "+ theRemainder);
        boolean isNotRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNotRemainder: " +isNotRemainder);

        if(!isNotRemainder){
            System.out.println("Got some remainder");
        }


    }
}