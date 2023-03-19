package java_;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class F0009_ArmstrongNumbers {

    /*
    Check if the integer is an Armstrong numbers
     Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
​
       153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
       370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
*/
    static List<Integer> armstrongSayilar=new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen hangi sayiya kadar armstrong sayilari bulmak istediginizi yaziniz");
        int sayi=scan.nextInt();
        String uzunluk=String.valueOf(sayi);
        System.out.println(uzunluk.length());
        int  basamak []=new int[uzunluk.length()];


        for(int i=2;i<=sayi;i++) {
            int sayi1=i;
            int number=i;
            int rakam=0;
            int toplam=0;
            int sira=0;
            while(number>0) {
                rakam=number%10;
                toplam=toplam+(rakam*rakam*rakam);
                number=number/10;
                basamak[sira]=rakam;
                sira++;
            }

            if(toplam==sayi1) {
                armstrongSayilar.add(sayi1);
                System.out.println(sayi1+" = "+basamak[0]+"³"+"+"+basamak[1]+"³"+"+"+basamak[2]+"³");

            }

        }
        System.out.println("---");

        System.out.println(armstrongSayilar);



        scan.close();
    }
}
