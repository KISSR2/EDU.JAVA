package Basic.Lotto;

import java.util.Random;
import java.util.Scanner;

public class LottoMuveletek {

    static void lottoSzamGenerator(){
        int[] tombTarolo = new int[91];

        for(int i = 1; i < tombTarolo.length; i++) {
            tombTarolo[i] = i;

        }
    }
    static int[]veletlenSzamGenerator(){
        Random rnd = new Random();
        int[] tombVeletlenSzam = new int[5];
        int lehetoseg = 0;
        while(lehetoseg < 5) {
            int szam = rnd.nextInt(90) + 1;
            boolean benneVan = false;
            for(int j = 0; j < lehetoseg; j++) {
                if(tombVeletlenSzam[j] == szam) {
                    benneVan = true;
                }
            }
            if(benneVan == false) {
                tombVeletlenSzam[lehetoseg] = szam;
                lehetoseg++;
            }
        }
        return tombVeletlenSzam;
    }

    static int[] novekvo (int[] tomb){
        boolean rendezes = false;
        while (!rendezes){
            rendezes = true;
            for (int j = 1; j < tomb.length; j++){
                if (tomb[j-1] > tomb[j]){
                    int seged = tomb[j-1];
                    tomb[j-1] = tomb[j];
                    tomb[j] = seged;
                    rendezes = false;
                }
            }
        }
        return tomb;
    }

    static int[] szamBekeresEllenorzes(){
        System.out.println("\nKérem a nyerőszámokat:");
        int[] tombTipp = new int[5];
        tombTipp[0] = -1;
        tombTipp[1] = -2;
        tombTipp[2] = -3;
        tombTipp[3] = -4;
        tombTipp[4] = -5;

        int tombTippIndexSzamlalo = 0;
        boolean rosszAdat = false;
        String stringTipp = new String();

        for(int i = 1; i <= 5; i++){
            System.out.print("Írd be az " + i + ". számot: ");
            do{
                int seged = 0;
                rosszAdat = false;
                do{
                    rosszAdat = false;
                    Scanner in = new Scanner (System.in);
                    stringTipp = in.nextLine();
                    char karakter = stringTipp.charAt(0);
                    for(int j = 0; j < stringTipp.length(); j++){
                        karakter = stringTipp.charAt(j);
                        if(karakter != '0'
                                && karakter != '1'
                                && karakter != '2'
                                && karakter != '3'
                                && karakter != '4'
                                && karakter != '5'
                                && karakter != '6'
                                && karakter != '7'
                                && karakter != '8'
                                && karakter != '9'){
                            rosszAdat = true;
                            break;
                        }
                    }
                    if(rosszAdat == true){
                        System.out.println("LOG: Rossz bemeneti karakter(ek)!!");


                    }
                }while(rosszAdat == true);

                seged = Integer.parseInt(stringTipp);
                if(seged < 1 || seged > 90){
                    rosszAdat = true;
                }
                if(rosszAdat == true){
                    System.out.println("LOG: Kérem, hogy csak 1 és 90 közötti egész számokat adjon meg!");
                }

                tombTipp[tombTippIndexSzamlalo] = seged;
                label:
                for(int k = 0; k <= tombTippIndexSzamlalo; k++){
                    for(int l = 1; l <= tombTippIndexSzamlalo; l++){
                        if(k != l && tombTipp[k] == tombTipp[l]){
                            rosszAdat = true;
                            System.out.println("LOG: Két szám egyezeik, kérlek válasz másik számot!");
                            break label;
                        }
                    }
                }

            }while(rosszAdat == true);

            tombTipp[tombTippIndexSzamlalo] = Integer.parseInt(stringTipp);
            tombTippIndexSzamlalo++;
        }
        return tombTipp;
    }

    static void eredmeny (int[] tombTipp, int[] tombVeletlenSzam){
        int talalat = 0;
        for(int i = 0; i < tombTipp.length; i++){
            for(int j = 0; j < tombVeletlenSzam.length; j++){
                if(tombTipp[i] == tombVeletlenSzam[j]){
                    talalat++;
                }
            }
        }
        System.out.println("\nEREDMÉNY --> " + talalat + " találatod van.");
    }

    static void tombKiiras(int[] tomb){
        for(int i = 0; i < tomb.length; i++){
            System.out.print(tomb[i] + " ");
        }
    }
}
