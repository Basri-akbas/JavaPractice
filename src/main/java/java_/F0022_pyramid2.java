package java_;

import java.util.Scanner;

public class F0022_pyramid2 {

    /*
	 Ask user to enter the number of lines of a  pyramid .
	 Type a program to create the pyramid.
	 For example if the number of lines is 5, the pyramid will be like;
	             *
	            * *
	           * * *
	          * * * *
	         * * * * *


	 Kullan�c�n�n  girdigi sat�r say�s� kadar * ile piramid sekli yazd�ran bir program create ediniz.

	 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();

        for (int i=1;i <= sayi; i++) {
            for(int j=sayi;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
