package java_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F0040 {

    public static void main(String[] args) {
        /*
         * "ab" -> "aba" -> kaba ->kabak ->1.kul
         */

        List<String> kelimeler = new ArrayList<>();
        Scanner input =new Scanner(System.in);
        boolean devamMi=true;
        int siraKimde =0;
        int oyunSayisi=0;

        while(devamMi) {
            siraKimde =oyunSayisi%2 +1; //1 2
            System.out.println(siraKimde + ". Kulanici kelime yaziniz:");
            String kelime =input.next();
            kelimeler.add(kelime);
            oyunSayisi++;
            devamMi= getDevamMi(kelimeler);

        }
        int kazananiBelirle =siraKimde == 1?2:1;
        System.out.println(kazananiBelirle + ". kullanici kazandi");
        System.out.println(kelimeler);

        input.close();
    }
    private static boolean getDevamMi(List<String> kelimeler) {
        // yazialan kelime bir onceki kelimeyi kapsiyormu?
        //yazilan kelimenin uzunlugu ile bir onceki kelimenin uzunlugu farki 1 mi?

        if(kelimeler.size()<2)
            return true;
        String sonKelime = kelimeler.get(kelimeler.size()-1);  //aba
        String birOncekiKelime = kelimeler.get(kelimeler.size()-2); //ab
        if(sonKelime.length()-birOncekiKelime.length()!=1)
            return false;
        if(!sonKelime.contains(birOncekiKelime))
            return false;
        return true;

    }
}
