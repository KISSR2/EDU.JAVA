package Collections.Henger;

import Collections.Henger.modell.Cso;
import Collections.Henger.modell.Henger;
import Collections.Henger.modell.Rud;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class HengerMain {

    public static void writeConsole(Henger[] hengerek){
        System.out.println("A megadott henger(ek) adatai:");
        for (int i=0; i<hengerek.length; i++){
            System.out.println(hengerek[i]);
        }
    }
    public static void osszesTerfogat(Henger[] hengerek){
        double terfogat = 0;
        for (int i=0; i<hengerek.length;i++){
            terfogat+=hengerek[i].terfogat();
        }
        System.out.println("\nA megadott henger(ek) teljes térfogatának összege: "+String.format("%.2f",terfogat)+" cm3");
        System.out.println("A megadott henger(ek) átlagtérfogata: "+String.format("%.2f",terfogat/hengerek.length)+" cm3");
    }

    public static void rogzitettCsovekAdatok(Henger[] hengerek){
        double csovekSulya=0d;
        for (int i = 0; i< hengerek.length; i++){
            if(hengerek[i] instanceof Cso){
                csovekSulya+=((Cso) hengerek[i]).suly();
            }
        }
        System.out.println("A megadott henger(ek) közötti Csövek teljes súlyának összege: "+String.format("%.2f",csovekSulya)+" kg");
    }

    public static void rogzitettAdatokFile(Henger[] hengerek){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter((new FileWriter("HengerAdatok.txt")));
            bufferedWriter.write("MAGASSAG\tSUGAR\t\tTERFOGAT");
            bufferedWriter.newLine();
            for (int i = 0; i < hengerek.length; i++) {
                bufferedWriter.write(converter(hengerek[i].getMagassag())+"\t\t"+converter(hengerek[i].getMagassag())+"\t\t"+converter(hengerek[i].getSugar()));
                bufferedWriter.newLine();;
            }
            bufferedWriter.close();
        }catch (IOException ex){
            ex.getStackTrace();
        }
    }

    public static String converter(double data){
        return String.format("%.2f",data);
    }
    public static void main(String[] args) {
        Henger[] hengerek = new Henger[3];
        hengerek[0] = new Henger(10,20);
        hengerek[1] = new Cso(5,15,3.0,2);
        hengerek[2] = new Rud(2,10,1);

        writeConsole(hengerek);
        osszesTerfogat(hengerek);
        rogzitettCsovekAdatok(hengerek);
        rogzitettAdatokFile(hengerek);


    }
}
