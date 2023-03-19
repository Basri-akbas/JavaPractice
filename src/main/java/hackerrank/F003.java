package hackerrank;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class F003 {

    public static void main(String[] args) {
        Scanner  scan=new Scanner(System.in);
        System.out.println("Lutfen ay gun  yil giriniz:");
        int month=scan.nextInt();
        int day=scan.nextInt();
        int year=scan.nextInt();

        System.out.println(findDay(month,day,year));
        System.out.println(getDay(month,day,year));


    }
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.GERMANY).toUpperCase();

    }

    public static String getDay(int month, int day, int year) {
        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);
        LocalDate date = LocalDate.of(y, m, d);
        return date.getDayOfWeek().toString();
    }
}
