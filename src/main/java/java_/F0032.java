package java_;

import java.util.Scanner;

public class F0032 {

    //Kelimenin harflerini alip onlari giris sirasina gore birlestirerek ekrana basan
    //          bir program yaziniz. Varargs kullanmalisiniz.

    static String str="";
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen isminizin harflerini giriniz,bittiginde 0'a basiniz");
        String x="";
        do {
            x=scan.next();
            isim(x);

        }while(!x.equals("0"));
        System.out.println(str);


        scan.close();
    }
    public static void isim(String... a) {

        for (String w : a) {
            if (w.equals("0")) {
                break;
            }else {
                str+=w;
            }

        }
    }
}
