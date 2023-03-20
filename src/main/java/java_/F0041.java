package java_;

import java.util.Scanner;

public class F0041 {public static void main(String[] args) {
    //  // Kullanıcıdan 25.01.2000 formatında tarih alacağız ve bu tarihi yazıya çeviren java kodu yazalım
    //yirmibes ocakikibin
    //"ocak", "subat", "mart", "nisan", "mayis", "haziran", "temmuz", "agustos","eylul", "ekim", "kasim", "aralik"
    //"bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"
    //"on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan"
    //"yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz","sekizyuz", "dokuzyuz"
    //"bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin","sekizbin", "dokuzbin"

    Scanner input = new Scanner(System.in);
    System.out.println("01.01.2000 formatında tarih giriniz.");
    String tarih = input.nextLine();//25.10.2010

    int on =new Integer(tarih.substring(0,1));//2
    int bir =new Integer(tarih.substring(1,2));
    int ay =new Integer(tarih.substring(3,5));
    int yilbinler=new Integer(tarih.substring(6,7));
    int yilyuzler=new Integer(tarih.substring(7,8));
    int yilonlar=new Integer(tarih.substring(8,9));
    int yilbirler=new Integer(tarih.substring(9,10));

    String [] aylar = {"","ocak", "subat", "mart", "nisan", "mayis", "haziran",
            "temmuz", "agustos","eylul", "ekim", "kasim", "aralik"};
    String [] birler = {"","bir", "iki", "uc", "dort", "bes", "alti", "yedi", "sekiz", "dokuz"};
    String [] onlar = {"","on", "yirmi", "otuz", "kirk", "elli", "altmis", "yetmis", "seksen", "doksan"};
    String [] yuzler = {"","yuz", "ikiyuz", "ucyuz", "dortyuz", "besyuz", "altiyuz", "yediyuz","sekizyuz", "dokuzyuz"};
    String [] binler = {"","bin", "ikibin", "ucbin", "dortbin", "besbin", "altibin", "yedibin","sekizbin", "dokuzbin"};

    System.out.println("Girilen tarihin yazi ile yazilmasi: "+onlar[on] + birler[bir]+" " +aylar[ay]+" " + binler[yilbinler]+ yuzler[yilyuzler]+
            onlar[yilonlar] + birler[yilbirler]);
    input.close();
}
}