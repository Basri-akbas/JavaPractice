package java_;

import java.util.Scanner;

public class F0038 {

    public static void main(String[] args) {
        // Kullanıcıya bir String girmesini söyleyin ve bu String’i yukarıdan aşağıya doğru yazdıran
        //Program yazınız. Ornegin; CAN ==>   C
        //								  A
        // 							  N

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String str=scan.next().toUpperCase();
        int a=str.length();
        ad (a,str);

        scan.close();
    }
    public static void ad(int a,String str) {
        int i=0;
        do {
            System.out.println(str.charAt(i));
            i++;
        }while(i<a);



    }
}
