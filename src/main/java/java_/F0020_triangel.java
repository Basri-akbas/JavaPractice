package java_;

import java.util.Scanner;

public class F0020_triangel {

    /*

	Ask user to enter the number of lines of a half pyramid.
	Type a program to create the half pyramid.
	For exampleif the number of lines is 5, the pyramid will be  like;
	*
	* *
	* * *
	* * * *
	* * * * *

	Kullan�c�n�n  girdigi sat�r say�s� kadar yar�m piramid sekli yazd�ran bir program create ediniz.


	 */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int sayi=scan.nextInt();

        for(int i=0;i<sayi;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

    }
}
