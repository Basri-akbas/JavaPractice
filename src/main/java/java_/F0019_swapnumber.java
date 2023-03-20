package java_;

public class F0019_swapnumber {

    /*
    Write a Java Program to swap two numbers

    Swap (takas) islemini --> a=3, b=5 iken  a=5, b=3 degerlerini almas� islemidir.
    iki yoldan yaptiginiz java kodunu yaziniz.
    1.Yol: 3. degisken kullanarak
    2.Yol: 3. degisken kullanmadan
*/
    public static void main(String[] args) {

        int a=5;
        int b=3;

        degistirme1(a,b);
        degistirme2(a,b);

    }

    private static void degistirme2(int a, int b) {


    }

    private static void degistirme1(int a, int b) {

        int c=0;
        c=a;
        a=b;
        b=c;

        System.out.println("a ="+a+","+"b="+b);
    }
}
