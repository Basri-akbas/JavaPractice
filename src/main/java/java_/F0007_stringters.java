package java_;

import java.util.Scanner;

public class F0007_stringters {

    /*
	Girilen bir String'i tersten yazdiran bir pr create ediniz
	 */

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.nextLine();

        for(int i=kelime.length()-1;i>=0;i--) {
            System.out.print(kelime.charAt(i));
        }


        scan.close();

    }
}
