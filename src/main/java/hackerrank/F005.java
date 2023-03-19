package hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class F005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat objus=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat objin=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        NumberFormat objch=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat objfr=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat objkr=NumberFormat.getCurrencyInstance(Locale.KOREA);
        NumberFormat objru=NumberFormat.getCurrencyInstance(new Locale("ru","RU"));

        String us=objus.format(payment);
        String india=objin.format(payment);
        String china=objch.format(payment) ;
        String france=objfr.format(payment);
        String korea=objkr.format(payment);
        String rusia=objru.format(payment);

        System.out.println("US: " + us);               //US: $25,463,215.00
        System.out.println("India: " + india);          //India: Rs.25,463,215.00
        System.out.println("China: " + china);          //China: ￥25,463,215.00
        System.out.println("France: " + france);        //  France: 25 463  215,00 €
        System.out.println("Korean:"+korea);            // Korean:￦25,463,215
        System.out.println("Rusia:"+rusia);             // Rusia:25 463  215 руб.
    }
}
