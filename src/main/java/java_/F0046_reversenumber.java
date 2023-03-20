package java_;

import java.util.Scanner;

public class F0046_reversenumber {

    public static void main(String[] args) {
        // 2. soru   //Girilen sayının tersini return eden java methodunu yazınız.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        String sayi=scan.next();
        tersIslem(sayi);


        scan.close();
    }

    public static void tersIslem(String sayi) {
        int a=sayi.length();
        String ters="";
        while(a!=0) {
            ters+=sayi.charAt(a-1);
            a--;
        }
        System.out.println("Sayinin tersi="+ters);
    }
}
