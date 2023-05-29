package Basic.Lotto;

import java.util.Scanner;

import static Basic.Lotto.LottoMuveletek.*;

public class LottoMain {
    public static void main(String[] args) {
        int[] tombTipp = new int[5];
        int[] tombTippRendezett = new int[5];
        int[] tombVeletlenSzam = new int[5];
        int[] tombVeletlenRendezett = new int[5];

        Scanner sc=new Scanner(System.in);
        int valasztas;
        System.out.println("1 - Szelvény kitöltése");
        System.out.println("2 - Random számokkal történő kitöltés");
        System.out.println("3 - Kilépés a programból.");
        do {
            System.out.println("\n\nAdd meg a funkció sorszámát: ");;
            valasztas=sc.nextInt();
            switch (valasztas){
                case 1:{
                    System.out.println("\nSaját számokkal történő feltöltés és tárolás");
                    lottoSzamGenerator();
                    tombTipp = szamBekeresEllenorzes();
                    tombTippRendezett = novekvo(tombTipp);

                    System.out.println("\nAz általad megadott számok növekvő sorrendben:");
                    tombKiiras(tombTippRendezett);
                }break;
                case 2:{
                    System.out.println("\nRandom számokkal történő feltöltés és ellenőrzés");

                    tombVeletlenSzam = veletlenSzamGenerator();
                    tombVeletlenRendezett = novekvo(tombVeletlenSzam);


                    System.out.println("\nA lottóhúzás számai növekvő sorrendben:");
                    tombKiiras(tombVeletlenRendezett);
                    eredmeny(tombTippRendezett, tombVeletlenRendezett);

                    int[] metszet= new int[5];
                    int j;
                    int db = 0;
                    for( int i = 0; i <tombTippRendezett.length; i++ )
                    {
                        j = 0;
                        while( j < 5 && tombTippRendezett[j] != tombVeletlenRendezett[i] )
                        {
                            j++;
                        }
                        if( j < 5 )
                        {
                            metszet[db] = tombTippRendezett[j];
                            db++;
                        }
                    }
                    if(db==0){
                        System.out.println("Nincsen találat!");
                    } else {
                        for (int i = 0; i < db; i++) {
                            System.out.print(metszet[i]+ " ");
                        }
                    }

                }break;
                case 3:{
                    System.exit(0);
                }break;
                default:{
                    System.out.println("Érvénytelen menüpont lett kiválasztva!");
                }
            }

        } while (valasztas >=1 || valasztas <=3);


    }
}