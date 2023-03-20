package java_;

import java.util.Scanner;

public class F0043_asal {

    public static void main(String[] args) {
        // girilen sayiyi kadar asal sayilari bulan method

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi=scan.nextInt();
        asal(sayi);

        scan.close();
    }

    public static void asal(int sayi) {
        int sum=0;
        if(sayi<=1) {
            System.out.println("Asal sayi degildir");
        }else if (sayi>2) {
            for(int i=3;i<=sayi;i++) {
                for(int k=2;k<=i;k++) {
                    if(i%k==0) {
                        sum++;
                    }

                }if (sum==1) {
                    System.out.print(i+" ");}
            }
        }
    }
}
