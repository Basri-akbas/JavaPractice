package java_;

import java.util.Scanner;

public class F0025_reversePyramid {

    /*
    Ask user to enter the number of lines of a inverted  .
    Type a program to create the inverted  pyramid.
    For example; if the number of lines is 5, the pyramid will be like;

    * * * *  * * * *
      * * * * * *
        * * * *
          * *
           *

    Kullan�c�n�n  girdigi sat�r say�s� kadar * ile  ters  piramid sekli yazd�ran bir program create ediniz.

    */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();
        int l=2*sayi-2;
        for (int i=0;i <sayi; i++) {
            if (i==sayi-1) {
                for(int j=0;j<=i*2-1;j++) {
                    System.out.print(" ");
                }
            }else {
                for(int j=0;j<=i*2;j++) {
                    System.out.print(" ");
                }
            }

            if (l>0) {
                for(int k=1;k<=l;k++) {
                    System.out.print("*");
                    System.out.print(" ");
                }l-=2;
            }else {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
