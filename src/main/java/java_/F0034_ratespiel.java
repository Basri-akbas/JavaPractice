package java_;

import java.util.Random;
import java.util.Scanner;

public class F0034_ratespiel {

    public static void main(String[] args) {
        // do_while kullanarak bir oyun tasarlayın

        Scanner scan=new Scanner(System.in);
        System.out.println("Sayi Tahmin Oyununa Hosgeldiniz");
        System.out.println("Lutfen 1 ile 50 Arasi sayi giriniz");
        int sy =scan.nextInt();
        islem (sy);



        scan.close();
    }

    public static void islem(int sy) {
        Random r=new Random();
        int i=r.nextInt(50);
        Scanner scan=new Scanner(System.in);
        do {
            if(!(i==sy)) {
                if (sy>i) {
                    System.out.println("Tahmininiz sayidan buyuktur ");

                }else {
                    System.out.println("Tahminiz sayidan kucuktur");
                }
                System.out.println("Tekrar sayi giriniz");
                sy=scan.nextInt();
            }

        }while(!(i==sy));
        System.out.println("Tebrikler Tahminiz Dogru");
        scan.close();
    }
}
