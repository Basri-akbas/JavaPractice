package java_;

import java.util.Scanner;
import java.util.stream.IntStream;

public class F0012_faktoriyel {

    public static void main(String[] args) {
        // Soru = Interview Question Kullanicidan 10�dan kucuk bir  tamsayi isteyin
        //           ve girilen sayinin faktoryel�ini bulun. (5!=5*4*3*2*1)

        Scanner scan = new Scanner(System.in);
        System.out.println("Faktoryel hesaplamak icin 10'dan kucuk bir tam sayi girin...");
        int sayi = scan.nextInt();

        System.out.print(sayi +"!=");
        int faktoryel=1;

        for (int i = sayi; i >1; i--) {
            faktoryel*=i;
            System.out.print(i +"*");

        }

        System.out.println("1=" +faktoryel);
        scan.close();

        //Lambda
        int fak=IntStream.rangeClosed(1,sayi).reduce(1,(x,y)->x*y);
        System.out.println(sayi+" nin faktoriyeli "+fak);

        //Andere Lösung
        System.out.println(FirstFactorial(sayi));
    }
    public static int FirstFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * FirstFactorial(num - 1);
        }
    }
}
