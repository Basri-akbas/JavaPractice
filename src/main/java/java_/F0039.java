package java_;

import java.util.Scanner;

public class F0039 {

    public static void main(String[] args) {
        //	Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve iki sayı seçmesini söyleyin.
        //	Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birini seciniz Paralelkenar,diktortgen,ucgen");
        String str=scan.next().toLowerCase();
        System.out.println("1. sayiyi giriniz");
        int sy1=scan.nextInt();
        System.out.println("2.sayiyi giriniz");
        int sy2=scan.nextInt();
        islem(sy1,sy2,str);


        scan.close();
    }
    public static void islem(int sy1,int sy2,String str) {

        if(str.equalsIgnoreCase("paralelkenar")) {
            int cevre=2*(sy1+sy2);
            int alan=sy1*sy2;
            System.out.println("Paralelkenar alani="+ alan +"\n"+"Paralelkenar cevre="+ cevre);
        }else if (str.equalsIgnoreCase("diktortgen")) {
            int cevre=2*(sy1+sy2);
            int alan=sy1*sy2;
            System.out.println("Diktortgen alani="+ alan +"\n"+"Diktortgen cevre="+ cevre);
        }else {
            int cevre=4*(sy1+sy2);
            int alan=(sy1*sy2)/2;
            System.out.println("Ucgen alani="+ alan +"\n"+"Ucgen cevre="+ cevre);
        }
    }
}
