package java_;

import java.util.Scanner;

public class F0045 {

    public static void main(String[] args) {
        //klavyeden bir cumlede belirledigimiz harfin tekrar sayisini bulalim
        //bugun hava cok sicak  kac a vardir.
        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String str=scan.nextLine();
        System.out.println("istediginiz harf");
        char harf=scan.next().charAt(0);
        System.out.println(harf +" harfi "+toplam(str,harf)+" defa vardir");

        scan.close();
    }
    public static int toplam(String str,char harf) {
        int sum=0;
        int uzunluk=str.length();
        for(int i=0;i<uzunluk;i++) {
            if (str.charAt(i)==harf) {
                sum++;
            }
        }
        return sum;
    }
}
