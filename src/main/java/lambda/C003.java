package lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C003 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<String>();
        list.add("Ali");
        list.add("Fatma");
        list.add("Zeki");
        list.add("Ayse");
        list.add("Abuziddin");
        list.add("Ayse");

        //Konsoldaki farklý öðeleri uzunluklarýyla birlikte yazdýrýn.
        list.stream().distinct().sorted().forEach(t-> System.out.println(t+"="+t.length()));
        System.out.println("*********************************************************");

        //Konsoldaki farklý öðeleri yazdýrýn, uzunluklarýna göre sýralayýn.
        list.stream().distinct().sorted(Comparator.comparing(t->t.length())).forEach(System.out::println);
        System.out.println("*********************************************************");

        //Konsoldaki farklý öðeleri yazdýrýn, son karakterlerine göre sýralayýn.
        list.stream().distinct().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).forEach(System.out::println);
        System.out.println("*********************************************************");

        //Konsoldaki farklý öðeleri ters sýrada yazdýrýn.
        list.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("*********************************************************");

        //Uzunluðu 7'den küçük olan farklý öðeleri ters sýrada konsolda büyük harflerle yazdýrýn.
        list.stream().distinct().filter(t->t.length()<7).map(t->t.toUpperCase()).sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
